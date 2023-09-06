package Maati.chess.model;

import Maati.chess.model.pieces.Piece;

/**
 * Class Square that will represent a Square in the chess Board Attribut Piece
 * that determinate which Piece is inside the Square this attribut have a getter
 * and setter
 *
 * @author Maati Oussama
 *
 */
public class Square {

    private Piece piece;

    /**
     * Constructor for Square
     *
     * @param piece the piece that will be initialised in the Square
     */
    public Square(Piece piece) {
        this.piece = piece;
    }

    /**
     * Getter for Piece attribut
     *
     * @return the piece of the current square
     */
    public Piece getPiece() {
        return this.piece;
    }

    /**
     * Setter for Piece attribut
     *
     * @param piece the piece that will replace the current one
     */
    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    /**
     * Method to check if the curretn Square is free, so, null or not
     *
     * @return the boolean value of expression current piece = null
     */
    public boolean isFree() {
        return this.piece == null;
    }
}
