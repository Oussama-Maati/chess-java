package Maati.chess.model;

/**
 * Represents the two color of the game: black and white.
 *
 * @author Maati Oussama
 */
public enum Color {
    BLACK, WHITE;

    /**
     * Method to return the color depending of the current color
     *
     * @return the opposite color of the given color
     */
    public Color opposite() {
        return (this == BLACK) ? WHITE : BLACK;

    }
}
