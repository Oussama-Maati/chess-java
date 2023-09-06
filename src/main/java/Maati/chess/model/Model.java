package Maati.chess.model;

import Maati.chess.model.pieces.Piece;
import java.util.List;

/**
 * Class Model that will be implemented by the Game Class
 *
 * @author Maati Oussama
 */
public interface Model {

    /**
     * Start the game: create the pieces and put them on the board, initialize
     * the current player to 'WHITE'.
     */
    public void start();

    /**
     * Method to check if a move with oldPos and newPos is valid or no so this
     * will check if the move put the current king in danger and so cannot make
     * this actual move
     *
     * @param oldPos the oldPos of the piece
     * @param newPos the newPos of the piece
     * @return if this is a valid move of not
     */
    public boolean isValidMove(Position oldPos, Position newPos);

    /**
     * Getter for the state attribut in Game Class
     *
     * @return the current state of the game
     */
    public GameState getState();

    /**
     * Get the piece of the board located on a given position
     *
     * @param pos the position
     * @return the piece located at P
     * @throws IllegalArgumentException pos is not located on the board.
     */
    public Piece getPiece(Position pos);

    /**
     * Getter for the current player.
     *
     * @return the current player.
     */
    public Player getCurrentPlayer();

    /**
     * Getter for the second player.
     *
     * @return the player that is waiting
     */
    public Player getOppositePlayer();

    /**
     * Check if the square at the given position is occupied by a piece of the
     * current player.
     *
     * @param pos the postion
     * @return true if the position is occupied by a piece of the current
     * player, false otherwise.
     * @throws IllegalArgumentException if the position is not located on the
     * board.
     */
    public boolean isCurrentPlayerPosition(Position pos);

    /**
     * Moves a piece from one position of the chess board to another one. If the
     * game is not over, change the current player.
     *
     * @param oldPos the current position
     * @param newPos the new position of the board where to put the piece
     * @throws IllegalArgumentException if 1) oldPos or newPos are not located
     * on the board, or 2) oldPos does not contain a piece, or 3) the piece does
     * not belong to the current player, or 4) the move is not valid for the
     * piece located at position oldPos
     */
    public void movePiecePosition(Position oldPos, Position newPos);

    /**
     * Get the possible moves for the piece located at the specified position.
     *
     * @param position the position of the piece
     * @return the liste of admissible positions.
     */
    public List<Position> getPossibleMoves(Position position);

    /**
     * Method to get all the possible moves by the current player and return it
     * as a list of moves
     *
     * @return the list of all posible move by the current player
     */
    public List<Move> getAllValidMoves();
}
