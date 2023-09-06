package Maati.chess.model;

/**
 * This enumeration is used to set the direction of the paws with a constructor
 * and the enuùeration will be used inside the constructor so the Attribut will
 * be set depending of which enum will be used inside
 *
 * @author Maati Oussama
 *
 */
public enum Direction {
    NW(1, -1), N(1, 0), NE(1, 1), W(0, -1), E(0, 1), SW(-1, -1), S(-1, 0), SE(-1, 1);

    private int deltaRow;
    private int deltaColumn;

    /**
     * Constructor for Enum Direction
     *
     * @param deltaR the integer that will set the position of the direction for
     * the row
     * @param deltaC the integer that will set the position of the direction for
     * the column
     */
    private Direction(int deltaR, int deltaC) {
        this.deltaRow = deltaR;
        this.deltaColumn = deltaC;
    }

    /**
     * Getter for the DeltaRow Attribut
     *
     * @return the DeltaRow of the current Direction
     */
    public int getDeltaRow() {
        return deltaRow;
    }

    /**
     * Getter for the DeltaColumn Attribut
     *
     * @return the DeltaColumn of the current Direction
     */
    public int getDeltaColumn() {
        return deltaColumn;
    }

}
