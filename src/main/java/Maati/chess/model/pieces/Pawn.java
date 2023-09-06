package Maati.chess.model.pieces;

import Maati.chess.model.Board;
import Maati.chess.model.Color;
import static Maati.chess.model.Color.*;
import Maati.chess.model.Direction;
import static Maati.chess.model.Direction.*;
import Maati.chess.model.Position;
import java.util.ArrayList;
import java.util.List;

/**
 * Class Pawn this class will be used to make a Pawn and give it a color with
 * its constructor using the super Constructor to re-use the Piece constructor.
 * Pawn heritate all the Attribut and Method and constructor of Piece class,
 * because Piece is the "parents" of Pawn
 *
 * @author Maati Oussama
 */
public class Pawn extends Piece {

    /**
     * Constructor for Pawn Using with super the constructor of Piece
     *
     * @param color the color of the Pawn
     */
    public Pawn(Color color) {
        super(color);
    }

    /**
     * Method to create for the piece in the position given in param a list of
     * all the possible move but only the one that take an opposite color piece
     *
     * @param position to then check in which position the position can take an
     * opposite piece
     * @param board the board in which all this is checked
     * @return the list with all possible position to eat a Piece of opposite
     * color
     */
    @Override
    public List<Position> getCapturePositions(Position position, Board board) {
        List<Position> possiblePosition = new ArrayList<>();
        List<Direction> rightDir = rightDirForCapture(position, board);

        checkAndGoToDiag(position, board, possiblePosition, rightDir.get(0));

        checkAndGoToDiag(position, board, possiblePosition, rightDir.get(1));

        return possiblePosition;
    }

    /**
     * Method to get the color of the paws and so return a list of direction
     * depending of its color for the possible capture
     *
     * @param pos the pos of the piece to get the color
     * @param board the board where this happen
     * @return the list with the right direction
     */
    private List<Direction> rightDirForCapture(Position pos, Board board) {
        if (board.getPiece(pos).getColor() == BLACK) {
            return List.of(SW, SE);
        }
        return List.of(NW, NE);
    }

    /**
     * Method to add into a list that i create all the moves possible by the
     * pawn inside the position given in param, using 3 differents sub-method
     *
     * @param position to check all the posible move
     * @param board the board where this is checked
     * @return List that will contains all the possible position
     */
    @Override
    public List<Position> getPossibleMoves(Position position, Board board) {
        List<Position> possiblePosition = new ArrayList<>();
        List<Direction> rightDir = rightDirForMoves(position, board);

        checkAndGoStraight(position, board, possiblePosition, rightDir.get(0));

        checkAndGo2TimeStraight(position, board, possiblePosition,
                rightDir.get(0));

        checkAndGoToDiag(position, board, possiblePosition, rightDir.get(1));

        checkAndGoToDiag(position, board, possiblePosition, rightDir.get(2));

        return possiblePosition;
    }

    /**
     * Method to get the color of the paws and so return a list of direction
     * depeinding of its color for the possible moves
     *
     * @param pos the pos of the piecec to get the color
     * @param board the board where this happen
     * @return the list with the right direction
     */
    private List<Direction> rightDirForMoves(Position pos, Board board) {
        if (board.getPiece(pos).getColor() == BLACK) {
            return List.of(S, SW, SE);
        }
        return List.of(N, NW, NE);
    }

    /**
     * Method to check if the pawn in the given position can move to 1 Square
     * straight and if so then add the position into a list only if the next
     * position is free
     *
     *
     * @param position with which i check if the next position with straight
     * direction is free
     * @param board the board where it is checked
     * @param possiblePosition the list in which we will add the next position
     * if possible
     * @param dir the direction to use with current position and next and check
     * if free and if so add to to the list
     */
    private void checkAndGoStraight(Position position, Board board,
            List<Position> possiblePosition, Direction dir) {
        if (board.contains(position.next(dir))
                && board.isFree(position.next(dir))) {
            possiblePosition.add(position.next(dir));

        }

    }

    /**
     * Method to check if the pawn in the given position can move to 2 Square
     * straight and if so then add the position into a list only if the 2
     * straight square are free
     *
     * @param position with which i check if the next position with straight
     * direction is free
     * @param board the board where it is checked
     * @param possiblePosition the list in which we will add the next position
     * if possible
     * @param dir the direction to use with next and check if free and if so add
     * to to the list
     */
    private void checkAndGo2TimeStraight(Position position, Board board,
            List<Position> possiblePosition, Direction dir) {
        if (board.getInitialPawnRow(board.getPiece(position)
                .getColor()) == (position.getRow())
                && board.isFree(position.next(dir).next(dir))
                && board.isFree(position.next(dir))) {
            possiblePosition.add(position.next(dir).next(dir));
        }
    }

    /**
     * Method to check if the pawn in the given position can move to the left
     * diagonal or right diagonal by checking if they contains opposite colors
     *
     * @param position with which i check if the next position with diagonal
     * direction is possible
     * @param board the board where it is checked
     * @param possiblePosition the list in which we will add the next position
     * if possible
     * @param dir the direction to use with next and check if free and if so add
     * to to the list
     */
    private void checkAndGoToDiag(Position position, Board board,
            List<Position> possiblePosition, Direction dir) {
        if (board.contains(position.next(dir))
                && board.containsOppositeColor(position.next(dir),
                        board.getPiece(position).getColor())) {
            possiblePosition.add(position.next(dir));
        }
    }
}
