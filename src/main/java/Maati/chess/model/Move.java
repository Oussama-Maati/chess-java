package Maati.chess.model;

/**
 * Move class used to make an object move, this is representing a move by 2
 * attribut, Origin : the position where is actually the piece -----------------
 * Target : the position where the piece will be sent that must be a valid and
 * possiblie move of the origin piece
 *
 * @author Maati Oussama
 */
public class Move {

    private Position origin;
    private Position target;

    public Move(Position origin, Position target) {
        this.origin = origin;
        this.target = target;
    }

    public Position getOrigin() {
        return origin;
    }

    public Position getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return "Move to {" + "origin=" + origin + ", target=" + target + '}';
    }

}
