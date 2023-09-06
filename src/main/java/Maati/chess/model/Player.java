package Maati.chess.model;

/**
 * Class Player This class will be used to make a Player and give it a color
 * with Constructor Attribut Color : used in the constructor to initialise the
 * Object Player with a color and this attribut have a getter
 *
 * @author Maati Oussama
 */
public class Player {

    private Color color;

    /**
     * Constructor for Player
     *
     * @param color to initialised the Player with this color
     */
    public Player(Color color) {
        this.color = color;
    }

    /**
     * Getter for the Color attribut
     *
     * @return the color of the current Player
     */
    public Color getColor() {
        return color;
    }

}
