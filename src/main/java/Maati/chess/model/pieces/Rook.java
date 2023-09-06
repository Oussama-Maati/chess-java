package Maati.chess.model.pieces;

import Maati.chess.model.Board;
import Maati.chess.model.Color;
import Maati.chess.model.Direction;
import static Maati.chess.model.Direction.*;
import Maati.chess.model.Position;
import java.util.ArrayList;
import java.util.List;

/**
 * Class Rook this class will be used to make a Rook instance and give it a
 * color with its constructor using the super Constructor to re-use the Piece
 * constructor. Rook heritate all the Attribut and Method and constructor of
 * Piece class, because Piece is the "parents" of Rook
 *
 * @author Maati Oussama
 */
public class Rook extends Piece {

    /**
     * Constructor for Rook using with super the constructor of Piece
     *
     * @param color the color of the Rook
     */
    public Rook(Color color) {
        super(color);
    }

    @Override
    public List<Position> getPossibleMoves(Position position, Board board) {
        List<Position> possibleMoves = new ArrayList<>();
        List<Direction> rightDir = List.of(N, E, S, W);
        for (Direction dir : rightDir) {
            super.moveDirToMax(position, board, possibleMoves, dir);
        }

        return possibleMoves;
    }

}
