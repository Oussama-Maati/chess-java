package Maati.chess.model;

import Maati.chess.model.pieces.Piece;
import java.util.ArrayList;
import java.util.List;

/**
 * Class board to make the board of the chess games Private attribut squares
 * it's a 2D array of Square that have it's accesor
 *
 * @author Maati Oussama
 */
public class Board {

    private Square[][] squares;
    public static final int BOARD_SIZE = 8;

    /**
     * Constructor for Board Initialise the squares 2D array of squares of 8
     */
    public Board() {

        this.squares = new Square[BOARD_SIZE][BOARD_SIZE];
        for (Square[] square : squares) {
            for (int j = 0; j < square.length; j++) {
                square[j] = new Square(null);
            }
        }
    }

    /**
     * This method is used to return the position of a piece given in parameters
     * if found in the board if not found return null
     *
     * @param piece the piece we are looking for
     * @return the the position of the found piece or null if the board doesnt
     * contains this piece
     */
    public Position getPiecePosition(Piece piece) {

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                Position pos = new Position(i, j);
                Piece pieceInPos = this.getPiece(pos);
                if (pieceInPos != null && pieceInPos.equals(piece)) {
                    return pos;
                }
            }
        }
        return null;
    }

    /**
     * Method boolean to check is the position is inside the board
     *
     * @param pos the position to check
     * @return boolean value of if the Position is inside the board
     */
    public boolean contains(Position pos) {
        return (pos.getColumn() >= 0
                && pos.getColumn() < BOARD_SIZE
                && pos.getRow() >= 0
                && pos.getRow() < BOARD_SIZE);
    }

    /**
     * Method to set a piece inside the board with a Position given
     *
     * @param piece the piece that will be set
     * @param pos the position where to put the piece
     */
    public void setPiece(Piece piece, Position pos) {
        if (!contains(pos)) {
            throw new IllegalArgumentException("The position is not valid");
        }

        squares[pos.getRow()][pos.getColumn()].setPiece(piece);
    }

    /**
     * Method to get the Piece from the given position
     *
     * @param pos from where we want to get the piece
     * @return the^piece in the given position
     */
    public Piece getPiece(Position pos) {
        if (!contains(pos)) {
            throw new IllegalArgumentException("The position is not valid");
        }
        return squares[pos.getRow()][pos.getColumn()].getPiece();
    }

    /**
     * Method to return an integer depending on the color given
     *
     * @param color the colo
     * @return Integer if the color is 6 or 1 if white
     */
    public Integer getInitialPawnRow(Color color) {
        return ((color == Color.BLACK) ? 6 : 1);
    }

    /**
     * Method to delete a piece of the given position
     *
     * @param pos the pos to
     */
    public void dropPiece(Position pos) {
        if (!contains(pos)) {
            throw new IllegalArgumentException("The position is not valid");
        }

        squares[pos.getRow()][pos.getColumn()].setPiece(null);
    }

    /**
     * Method to check is the given position is free that means contains no
     * Piece
     *
     * @param pos the position to check is free
     * @return the boolean of if the pos is free
     */
    public boolean isFree(Position pos) {
        if (!contains(pos)) {
            throw new IllegalArgumentException("The position is not valid");
        }
        return (squares[pos.getRow()][pos.getColumn()].isFree());
    }

    /**
     * Method boolean to check is the color of the piece in the given position
     * is the opposite of the color given in parameters
     *
     * @param pos the position to get the first color from
     * @param color to compare with the one in the piece of the position
     * @return the boolean value of if the color of the piece in the given
     * position is the opposite of the color given in parameters
     */
    public boolean containsOppositeColor(Position pos, Color color) {
        if (!contains(pos)) {
            throw new IllegalArgumentException("The position is not valid");
        }

        if (squares[pos.getRow()][pos.getColumn()].isFree()) {
            return false;
        }

        return (squares[pos.getRow()][pos.getColumn()].getPiece().getColor()
                != color);
    }

    /**
     * Method to create an List and put inside all the position of the piece
     * that have the same color as the player
     *
     * @param player the player to get its color and compare it with every piece
     * @return the list of position containing all the piece with the same color
     * as the player
     */
    public List<Position> getPositionOccupiedBy(Player player) {
        List<Position> playerPiecePosition = new ArrayList<>();

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (squares[i][j].getPiece() != null) {
                    if (squares[i][j].getPiece().getColor() == (player.getColor())) {
                        playerPiecePosition.add(new Position(i, j));
                    }
                }
            }
        }
        return playerPiecePosition;
    }
}
