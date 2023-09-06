package Maati.chess.model;

import static Maati.chess.model.Board.*;
import Maati.chess.model.pieces.Bishop;
import Maati.chess.model.pieces.King;
import Maati.chess.model.pieces.Knight;
import Maati.chess.model.pieces.Pawn;
import Maati.chess.model.pieces.Piece;
import Maati.chess.model.pieces.Queen;
import Maati.chess.model.pieces.Rook;
import java.util.ArrayList;
import java.util.List;

/**
 * Class Game that implement the Class Model, the gmae class have 7 attributs :
 * 1 Board that will be the board of the game, 1 Player with WHITE color value,
 * 1 Player with BLACK color, 1 Player with the value of the currentPlayer, 2
 * King for each color, 1 GameState to retain the state of the game
 *
 * @author Maati Oussama
 */
public class Game implements Model {

    private Board board;
    private Player white;
    private Player black;
    private Player currentPlayer;
    private King whiteKing;
    private King blackKing;
    private GameState state;

    /**
     * Constructor for the game Initialise the board with a new Board inside
     * Initialise the 1st player with white value Initialise the 2nd player with
     * black value, each king with their respective color, and the state at PLAY
     */
    public Game() {
        board = new Board();
        white = new Player(Color.WHITE);
        black = new Player(Color.BLACK);
        whiteKing = new King(Color.WHITE);
        blackKing = new King(Color.BLACK);
        state = GameState.PLAY;
    }

    @Override
    public boolean isValidMove(Position oldPos, Position newPos) {
        if (oldPos == null) {
            throw new IllegalArgumentException("The old position cannot be empty");
        }
        ifNotPossibleIAE(oldPos, newPos);
        Piece tmp = board.getPiece(newPos);
        board.setPiece(board.getPiece(oldPos), newPos);
        board.dropPiece(oldPos);

        Piece currentKing = getCurrentKing();
        Position kingPos = board.getPiecePosition(currentKing);
        if (getCapturePositions(getOppositePlayer()).contains(kingPos)) {
            board.setPiece(board.getPiece(newPos), oldPos);
            board.setPiece(tmp, newPos);
            return false;
        }

        board.setPiece(board.getPiece(newPos), oldPos);
        board.setPiece(tmp, newPos);
        return true;
    }

    /**
     * Method
     *
     * @param player to put into a list all of his possible capture
     * @return the list of capture of all the piece of the Player in parameters
     */
    private List<Position> getCapturePositions(Player player) {
        List<Position> allPiece = board.getPositionOccupiedBy(player);
        List<Position> allCapture = new ArrayList<>();

        for (Position position : allPiece) {
            Piece piece = board.getPiece(position);
            allCapture.addAll(piece.getCapturePositions(position, board));
        }

        return allCapture;
    }

    /**
     * Method to get the king of the current player
     *
     * @return the king attribut color of the current player color
     */
    private Piece getCurrentKing() {
        return (currentPlayer.getColor() == Color.BLACK) ? blackKing
                : whiteKing;

    }

    @Override
    public GameState getState() {
        return this.state;
    }

    @Override
    public void start() {
        currentPlayer = white;
        for (int i = 0; i < BOARD_SIZE; i++) {
            board.setPiece(new Pawn(Color.BLACK), new Position(6, i));
            board.setPiece(new Pawn(Color.WHITE), new Position(1, i));
        }

        Color col = Color.WHITE;
        int line = 0;
        for (int i = 0; i < 2; i++) {
            board.setPiece(new Rook(col), new Position(line, 0));
            board.setPiece(new Knight(col), new Position(line, 1));
            board.setPiece(new Bishop(col), new Position(line, 2));
            board.setPiece(new Queen(col), new Position(line, 3));
            board.setPiece(new King(col), new Position(line, 4));
            board.setPiece(new Bishop(col), new Position(line, 5));
            board.setPiece(new Knight(col), new Position(line, 6));
            board.setPiece(new Rook(col), new Position(line, 7));
            col = Color.BLACK;
            line = 7;
        }
    }

    @Override
    public Piece getPiece(Position pos) {
        if (!board.contains(pos)) {
            throw new IllegalArgumentException("The position is not valid");
        }
        return board.getPiece(pos);
    }

    @Override
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    @Override
    public Player getOppositePlayer() {
        return ((currentPlayer.equals(white)) ? black : white);
    }

    @Override
    public boolean isCurrentPlayerPosition(Position pos) {
        if (!board.contains(pos)) {
            throw new IllegalArgumentException("The position is not valid");
        }
        if (board.getPiece(pos) == null) {
            return false;
        }
        return (board.getPiece(pos).getColor()
                == this.getCurrentPlayer().getColor());
    }

    @Override
    public void movePiecePosition(Position oldPos, Position newPos) {
        allIAEForMove(oldPos, newPos);
        ifNotPossibleIAE(oldPos, newPos);

        List<Position> possibleMove
                = board.getPiece(oldPos).getPossibleMoves(oldPos, board);

        for (Position position : possibleMove) {
            if (position.equals(newPos)) {
                board.setPiece(board.getPiece(oldPos), newPos);
                board.dropPiece(oldPos);
            }
        }

        changeCurrentPlayer();

        changeState();
    }

    /**
     * Method to check the condition of the state and put the right state of the
     * game
     */
    private void changeState() {

        if (currentKingInCheck()) {

            if (!haveValid()) {
                state = GameState.CHECK_MATE;
            } else {
                state = GameState.CHECK;
            }
        } else {
            if (!haveValid()) {
                state = GameState.STALE_MATE;
            } else {
                state = GameState.PLAY;
            }
        }
    }

    /**
     * Method to check if the current king is in a check state and return the
     * boolean value
     *
     * @return if the current king is an position of capture of any ennemy piece
     */
    private boolean currentKingInCheck() {
        Position kingPos = board.getPiecePosition(getCurrentKing());
        List<Position> listOfCapture
                = getCapturePositions(getOppositePlayer());
        return listOfCapture.contains(kingPos);
    }

    /**
     * Method to check if the current player have a valid move, get all he piece
     * of the current player and look in each possible move if at least one is
     * valid
     *
     * @return if the current player have at least one move valid
     */
    private boolean haveValid() {
        List<Position> allPiece = board.
                getPositionOccupiedBy(getCurrentPlayer());

        for (Position oldPos : allPiece) {
            Piece oldPiece = board.getPiece(oldPos);
            List<Position> moveForOld = oldPiece.getPossibleMoves(oldPos, board);
            for (Position newPos : moveForOld) {
                if (isValidMove(oldPos, newPos)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Method to throws IAE for the move Position because the method have a lot
     * of condition to throws and it is hard to read and understand
     *
     * @param oldPos the old pos to check
     * @param newPos the newPos to check
     */
    private void allIAEForMove(Position oldPos, Position newPos) {
        if (!board.contains(newPos)
                || !board.contains(oldPos)
                || board.getPiece(oldPos) == null
                || !this.isCurrentPlayerPosition(oldPos)) {
            throw new IllegalArgumentException("The move is not possible ! 5");
        }
    }

    /**
     * Method to throws an IAE if move is not possible
     *
     * @param newPos the position to checks if a piece has been moved there
     */
    private void ifNotPossibleIAE(Position oldPos, Position newPos) {
        List<Position> possibleMoves
                = board.getPiece(oldPos).getPossibleMoves(oldPos, board);
        if (!possibleMoves.contains(newPos)) {
            throw new IllegalArgumentException("This move is not possible");
        }
    }

    /**
     * Method void to just change the current player
     */
    private void changeCurrentPlayer() {
        currentPlayer = (currentPlayer == black ? white : black);

    }

    /**
     * Package method to move easily the piece and test the isGameOver method
     * (My professor allowed me to use a package method to do the test of game
     * over)
     *
     * @param oldPos the old Position of the piece in the board
     * @param newPos the new Position of the piece in the board
     */
    void moveForTest(Position oldPos, Position newPos) {
        board.setPiece(board.getPiece(oldPos), newPos);
        board.dropPiece(oldPos);

        changeCurrentPlayer();
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        return board.getPiece(position).getPossibleMoves(position, board);
    }

    @Override
    public List<Move> getAllValidMoves() {
        List<Move> allValidMoves = new ArrayList<>();
        List<Position> allCurrentPiece
                = board.getPositionOccupiedBy(currentPlayer);
        for (Position piece : allCurrentPiece) {
            List<Position> allValidOfpiece = getPossibleAndValid(piece);
            if (!allValidOfpiece.isEmpty()) {
                for (Position validNewPos : allValidOfpiece) {
                    allValidMoves.add(new Move(piece, validNewPos));

                }
            }

        }

        return allValidMoves;
    }

    private List<Position> getPossibleAndValid(Position oldPos) {
        List<Position> possAndVal = getPossibleMoves(oldPos);
        List<Position> notValidMove = new ArrayList<>();

        for (Position newPos : possAndVal) {
            if (!isValidMove(oldPos, newPos)) {
                notValidMove.add(newPos);
            }
        }
        possAndVal.removeAll(notValidMove);
        return possAndVal;
    }

}
