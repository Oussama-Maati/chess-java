package Maati.chess.model.pieces;

import Maati.chess.model.Board;
import Maati.chess.model.Color;
import Maati.chess.model.Direction;
import Maati.chess.model.Position;
import java.util.ArrayList;
import java.util.List;

/**
 * Class Queen this class will be used to make a Queen instance and give it a
 * color with its constructor using the super Constructor to re-use the Piece
 * constructor. Queen heritate all the Attribut and Method and constructor of
 * Piece class, because Piece is the "parents" of Queen
 *
 * @author Maati Oussama
 */
public class Queen extends Piece {

    /**
     * Constructor for Queen used with super the constructor of Piece
     *
     * @param color the color of the Queen
     */
    public Queen(Color color) {
        super(color);
    }

    @Override
    public List<Position> getPossibleMoves(Position position, Board board) {
        List<Position> possibleMoves = new ArrayList<>();

        for (Direction dir : Direction.values()) {
            super.moveDirToMax(position, board, possibleMoves, dir);
        }
        return possibleMoves;
    }
}
