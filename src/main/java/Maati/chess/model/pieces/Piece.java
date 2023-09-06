package Maati.chess.model.pieces;

import Maati.chess.model.Board;
import Maati.chess.model.Color;
import Maati.chess.model.Direction;
import Maati.chess.model.Position;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class Piece This class will be used to make a Piece and give it a color with
 * Constructor Attribut Color : used in the constructor to initialise the Object
 * Piece with a color and this attribut have a getter
 *
 * @author Maati Oussama
 */
public abstract class Piece {

    protected Color color;

    /**
     * Constructor for Piece This constructor will be used to make instance of a
     * Piece
     *
     * @param color to put initialise in the Piece
     */
    public Piece(Color color) {
        this.color = color;
    }

    /**
     * Getter for the Color attribut
     *
     * @return the color of the current piece
     */
    public Color getColor() {
        return color;
    }

    /**
     * Method to create for the piece in the given position a list of all the
     * possible move but only the one that take a piece of the opposite color
     *
     * @param position the pos to get its possible capture
     * @param board the board in which all this is checked
     * @return the list with all possible position to eat a Piece of opposite
     * color
     */
    public List<Position> getCapturePositions(Position position, Board board) {
        List<Position> possibleCapture = new ArrayList<>();
        List<Position> possibleMoves = getPossibleMoves(position, board);
        
        for (Position possibleMove : possibleMoves) {
            if (!board.isFree(possibleMove)
                    && board.containsOppositeColor(position,
                            board.getPiece(possibleMove).getColor())) {
                possibleCapture.add(possibleMove);
            }
        }

        return possibleCapture;
    }

    /**
     * Method to get all the posible move in a given direction to maximum in a
     * board of a piece in a given position, used for the Queen, Rook and Bishop
     * class
     *
     * @param position the position of the piece to check the possible moves
     * @param board the board where are located the piece
     * @param possibleMoves the list of possible to add the positions if
     * possible
     * @param dir the direction to checks continualy till the board doesnt
     * contains it
     */
    protected void moveDirToMax(Position position, Board board,
            List<Position> possibleMoves, Direction dir) {
        Position dirs = position.next(dir);
        while (board.contains(dirs)) {
            if (board.isFree(dirs)
                    || this.getColor() != board.getPiece(dirs).getColor()) {
                possibleMoves.add(dirs);
            }

            if (!board.isFree(dirs)) {
                break;
            }

            dirs = dirs.next(dir);
        }
    }

    /**
     * Method to add into a list that i create all the moves possible by the
     * Piece inside the position given in param, this class is abstract because
     * the Class Piece have multiple "child" and everyone of them have
     * différents ways to move
     *
     * @param position to check all the posible move
     * @param board the board where this is checked
     * @return List that will contains all the possible position
     */
    public abstract List<Position> getPossibleMoves(Position position,
            Board board);

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Piece other = (Piece) obj;
        if (this.color != other.color) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.color);
        return hash;
    }

}
