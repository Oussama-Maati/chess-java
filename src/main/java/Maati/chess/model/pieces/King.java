package Maati.chess.model.pieces;

import Maati.chess.model.Board;
import Maati.chess.model.Color;
import Maati.chess.model.Direction;
import Maati.chess.model.Position;
import java.util.ArrayList;
import java.util.List;

/**
 * Class King this class will be used to make a King instance and give it a
 * color with its constructor using the super Constructor to re-use the Piece
 * constructor. King heritate all the Attribut and Method and constructor of
 * Piece class, because Piece is the "parents" of King
 *
 * @author Maati Oussama
 */
public class King extends Piece {

    /**
     * Constructor for King used with super the constructor of Piece
     *
     * @param color the color of the King
     */
    public King(Color color) {
        super(color);
    }

    /**
     * As the king have every direction as a move this method check with a
     * private method every value of the direction enum class if possible then
     * add it to the list of position
     *
     */
    @Override
    public List<Position> getPossibleMoves(Position position, Board board) {

        List<Position> possibleMoves = new ArrayList<>();

        for (Direction dir : Direction.values()) {
            checkDirMove(position, board, possibleMoves, dir);
        }

        return possibleMoves;
    }

    /**
     * Method to check if the move in given Direction is possible for the king
     *
     * @param position the position of the king
     * @param board the board where all this happen
     * @param possiblePosition the list of position where the position are added
     * if they are possible
     */
    private void checkDirMove(Position position, Board board,
            List<Position> possibleMoves, Direction dir) {
        Position dirs = position.next(dir);
        if (board.contains(dirs)
                && (board.isFree(dirs)
                || this.getColor() != board.getPiece(dirs).getColor())) {
            possibleMoves.add(dirs);
        }

    }

}
