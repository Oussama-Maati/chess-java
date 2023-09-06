package Maati.chess.model.pieces;

import Maati.chess.model.Board;
import Maati.chess.model.Color;
import Maati.chess.model.Direction;
import static Maati.chess.model.Direction.*;
import Maati.chess.model.Position;
import java.util.ArrayList;
import java.util.List;

/**
 * Class Knight this class will be used to make a Knight instance and give it a
 * color with its constructor using the super Constructor to re-use the Piece
 * constructor. Knight heritate all the Attribut and Method and constructor of
 * Piece class, because Piece is the "parents" of Knight
 *
 * @author Maati Oussama
 */
public class Knight extends Piece {

    /**
     * Constructor for Knight Using with super the constructor of Piece
     *
     * @param color the color of the Knight
     */
    public Knight(Color color) {
        super(color);
    }

    @Override
    public List<Position> getPossibleMoves(Position position, Board board) {
        List<Position> possibleMove = new ArrayList<>();

        check2TopLeft(position, board, possibleMove);
        check2TopRight(position, board, possibleMove);
        check2BottomLeft(position, board, possibleMove);
        check2BottomRight(position, board, possibleMove);

        return possibleMove;
    }

    /**
     * Method to check if the 2 moves in the top right of the knight are
     * possible, but if the the knight is white check if the 2 moves in the
     * bottom left of the knight are possible
     *
     *
     * @param position the position of the knight
     * @param board the board where all this happen
     * @param possiblePosition the list of position where the position are added
     * if they are possible
     */
    private void check2TopLeft(Position position, Board board,
            List<Position> possiblePosition) {
        Position next_NE = position.next(NE).next(N);
        for (int i = 0; i < 2; i++) {
            if (board.contains(next_NE)
                    && (board.isFree(next_NE)
                    || this.getColor() != board.getPiece(next_NE).getColor())) {
                possiblePosition.add(next_NE);
            }
            next_NE = position.next(NE).next(E);
        }

    }

    /**
     * Method to check if the 2 moves in the top left of the knight are
     * possible, but if the the knight is white check if the 2 moves in the
     * bottom left of the knight are possible
     *
     *
     * @param position the position of the knight
     * @param board the board where all this happen
     * @param possiblePosition the list of position where the position are added
     * if they are possible
     */
    private void check2TopRight(Position position, Board board,
            List<Position> possiblePosition) {
        Position next_NW = position.next(NW).next(N);
        for (int i = 0; i < 2; i++) {
            if (board.contains(next_NW)
                    && (board.isFree(next_NW)
                    || this.getColor() != board.getPiece(next_NW).getColor())) {
                possiblePosition.add(next_NW);
            }
            next_NW = position.next(NW).next(W);
        }

    }

    /**
     * Method to check if the 2 moves in the bottom right of the knight are
     * possible, but if the the knight is white check if the 2 moves in the top
     * left of the knight are possible
     *
     *
     * @param position the position of the knight
     * @param board the board where all this happen
     * @param possiblePosition the list of position where the position are added
     * if they are possible
     */
    private void check2BottomLeft(Position position, Board board,
            List<Position> possiblePosition) {
        Position next_SE = position.next(SE).next(Direction.E);
        for (int i = 0; i < 2; i++) {
            if (board.contains(next_SE)
                    && (board.isFree(next_SE)
                    || this.getColor() != board.getPiece(next_SE).getColor())) {
                possiblePosition.add(next_SE);
            }
            next_SE = position.next(SE).next(S);
        }
    }

    /**
     * Method to check if the 2 moves in the bottom left of the knight are
     * possible, but if the the knight is white check if the 2 moves in the top
     * right of the knight are possible
     *
     *
     * @param position the position of the knight
     * @param board the board where all this happen
     * @param possiblePosition the list of position where the position are added
     * if they are possible
     */
    private void check2BottomRight(Position position, Board board,
            List<Position> possiblePosition) {
        Position next_SW = position.next(SW).next(W);
        for (int i = 0; i < 2; i++) {
            if (board.contains(next_SW)
                    && (board.isFree(next_SW)
                    || this.getColor() != board.getPiece(next_SW).getColor())) {
                possiblePosition.add(next_SW);
            }
            next_SW = position.next(SW).next(S);
        }
    }

}
