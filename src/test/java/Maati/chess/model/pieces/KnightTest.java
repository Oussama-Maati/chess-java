package Maati.chess.model.pieces;

import Maati.chess.model.Board;
import Maati.chess.model.Color;
import Maati.chess.model.Position;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Maati Oussama
 */
public class KnightTest {

    public KnightTest() {
    }

    /**
     * Test of getPossibleMoves method, of class Knight.
     */
    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoard() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightLeftBottomCorner() {

        Position position = new Position(0, 0);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(2, 1),
                new Position(1, 2)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightRightBottomCorner() {

        Position position = new Position(0, 7);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(1, 5),
                new Position(2, 6)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightRightTopCorner() {

        Position position = new Position(7, 7);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(6, 5),
                new Position(5, 6)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightLefttTopCorner() {

        Position position = new Position(7, 0);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 1),
                new Position(6, 2)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWithBlackPieceInPos54() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWithBlackPieceInRightTop() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWithBlackPieceInAllTop() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWithBlackPieceInMoves() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWithBlackPieceInAllExceptBottomLeft() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 4));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWithBlackPieceInAllExceptOne() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 2));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWithBlackPieceInAll() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 1));
        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWith1WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWith2WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWith3WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWith4WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWith5WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWith6WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 4));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWith7WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 2));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKnightMiddleBoardWith8WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 1));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    /*
    Test for Capture position of the knight piece
     */
    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith8WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 1));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith7WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 2));

        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith6WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 4));

        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith5WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));

        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith4WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));

        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith3WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));

        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith2WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));

        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith1WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));

        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith0WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith8BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 1));
        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith7BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 2));

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith6BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);

        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 4));

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith5BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith4BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith3BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith2BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith1BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKnightMiddleBoardWith0BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.BLACK);

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoard() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesWhiteKnightLeftBottomCorner() {

        Position position = new Position(0, 0);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(2, 1),
                new Position(1, 2)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightRightBottomCorner() {

        Position position = new Position(0, 7);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(1, 5),
                new Position(2, 6)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightRightTopCorner() {

        Position position = new Position(7, 7);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(6, 5),
                new Position(5, 6)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightLefttTopCorner() {

        Position position = new Position(7, 0);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 1),
                new Position(6, 2)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoardWithWhitePieceInPos54() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoardWithWhitePieceInRightTop() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoardWithWhiteieceInAllTop() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoardWithWhitePieceInMoves() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoardWithWhitePieceInAllExceptBottomLeft() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 4));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoardWithWhitePieceInAllExceptOne() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 2));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoardWithWhitePieceInAll() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 1));
        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoardWith1BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoardWith2BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoardWith3BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoardWith4BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoardWith5BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoardWith6BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 4));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMoveWhiteKnightMiddleBoardWith7BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 2));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKnightMiddleBoardWith8BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 1));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    /*
    Test for Capture position of the knight piece
     */
    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith8BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 1));
        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2),
                new Position(2, 1)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith7BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 2));

        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4),
                new Position(1, 2)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith6BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(1, 4));

        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5),
                new Position(1, 4)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith5BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));
        board.setPiece(new Knight(Color.BLACK), new Position(2, 5));

        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1),
                new Position(2, 5)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith4BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 1));

        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2),
                new Position(4, 1)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith3BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));
        board.setPiece(new Knight(Color.BLACK), new Position(5, 2));

        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5),
                new Position(5, 2)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith2BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));
        board.setPiece(new Knight(Color.BLACK), new Position(4, 5));

        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4),
                new Position(4, 5)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith1BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.BLACK), new Position(5, 4));

        board.setPiece(knight, position);
        List<Position> expResult = List.of(
                new Position(5, 4)
        );
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith0BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith8WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 1));
        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith7WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);

        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 2));

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith6WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);

        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(1, 4));

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith5WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));
        board.setPiece(new Knight(Color.WHITE), new Position(2, 5));

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith4WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 1));

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith3WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));
        board.setPiece(new Knight(Color.WHITE), new Position(5, 2));

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith2WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));
        board.setPiece(new Knight(Color.WHITE), new Position(4, 5));

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith1WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);
        board.setPiece(new Knight(Color.WHITE), new Position(5, 4));

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKnightMiddleBoardWith0WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Knight knight = new Knight(Color.WHITE);

        board.setPiece(knight, position);
        List<Position> expResult = List.of();
        List<Position> result = knight.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    /*
     *      Permet de tester si deux listes de positions sont identiques à l'ordre
     *      des éléments prêts. Cette méthode est appelée
     *      par les méthodes de test.
     */
    private void assertEqualsIgnoringOrder(List<Position> expected, List<Position> actual) {
        assertEquals(expected.size(), actual.size());
        assertTrue(actual.containsAll(expected));
        assertTrue(expected.containsAll(actual));
    }

}
