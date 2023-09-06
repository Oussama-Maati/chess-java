package Maati.chess.model;

/**
 * Class Position Used to make a Position that is determined 2 attribut : row
 * Integer column Integer A Constructor and 2 getter for the attributs
 *
 * @author Maati Oussama
 *
 */
public class Position {

    private int row;
    private int column;

    /**
     * Constructor for the Class Position
     *
     * @param row integer that will be initialised for the row
     * @param column integer that will be initialised for the column
     */
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    /**
     * Getter Row for the private attribut
     *
     * @return the Row of the current Position
     */
    public int getRow() {
        return row;
    }

    /**
     * Getter Column for the private attribut
     *
     * @return the column of the current Position
     */
    public int getColumn() {
        return column;
    }

    /**
     * Method to return the next position based on the current position and the
     * direction given in parameters
     *
     * @param dir the direction we will use to make a position with it
     * @return the next position based on the direction
     */
    public Position next(Direction dir) {
        return new Position(row + dir.getDeltaRow(),
                column + dir.getDeltaColumn());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.row;
        hash = 37 * hash + this.column;
        return hash;
    }

    /**
     * Method Equals overrided to check if 2 position are equals that means they
     * have the same value integer for the column and also the row ( also used
     * for the JUnit test )
     *
     * @param obj the other object position that will be checked with the
     * current one
     * @return the boolean value of equality of the current position with the
     * one in param
     */
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
        final Position other = (Position) obj;
        if (this.row != other.row) {
            return false;
        }
        return this.column == other.column;
    }

}
