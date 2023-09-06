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
public class KingTest {

    public KingTest() {
    }

    /**
     * Test of getPossibleMoves method, of class King.
     */
    @Test
    public void testGetPossibleMovesBlackKingMiddleBoard() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King instance = new King(Color.BLACK);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = instance.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingLeftBottomCorner() {

        Position position = new Position(0, 0);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(1, 0),
                new Position(1, 1),
                new Position(0, 1)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingRightBottomCorner() {

        Position position = new Position(0, 7);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(0, 6),
                new Position(1, 6),
                new Position(1, 7)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingRightTopCorner() {

        Position position = new Position(7, 7);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(7, 6),
                new Position(6, 6),
                new Position(6, 7)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingLefttTopCorner() {

        Position position = new Position(7, 0);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(6, 0),
                new Position(6, 1),
                new Position(7, 1)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWithBlackPieceInPosNE() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWithBlackPieceInRightTop() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWithBlackPieceInAllTop() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWithBlackPieceInMoves() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 3));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWithBlackPieceInAllExceptBottomLeft() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 3));
        board.setPiece(new King(Color.BLACK), new Position(2, 2));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWithBlackPieceInAllExceptOne() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 3));
        board.setPiece(new King(Color.BLACK), new Position(2, 2));
        board.setPiece(new King(Color.BLACK), new Position(3, 2));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWithBlackPieceInAll() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 3));
        board.setPiece(new King(Color.BLACK), new Position(2, 2));
        board.setPiece(new King(Color.BLACK), new Position(3, 2));
        board.setPiece(new King(Color.BLACK), new Position(4, 2));
        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWith1WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWith2WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWith3WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWith4WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 4));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWith5WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 3));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWith6WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 3));
        board.setPiece(new King(Color.WHITE), new Position(2, 2));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWith7WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 3));
        board.setPiece(new King(Color.WHITE), new Position(2, 2));
        board.setPiece(new King(Color.WHITE), new Position(3, 2));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBoardWith8WhitePieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 3));
        board.setPiece(new King(Color.WHITE), new Position(2, 2));
        board.setPiece(new King(Color.WHITE), new Position(3, 2));
        board.setPiece(new King(Color.WHITE), new Position(4, 2));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackKingMiddleBottom() {

        Position position = new Position(0, 4);
        Board board = new Board();
        King king = new King(Color.BLACK);

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(0, 3),
                new Position(1, 3),
                new Position(1, 4),
                new Position(1, 5),
                new Position(0, 5)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    /*
    Test for Capture position of the king piece 
     */
    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith8WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 3));
        board.setPiece(new King(Color.WHITE), new Position(2, 2));
        board.setPiece(new King(Color.WHITE), new Position(3, 2));
        board.setPiece(new King(Color.WHITE), new Position(4, 2));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith7WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 3));
        board.setPiece(new King(Color.WHITE), new Position(2, 2));
        board.setPiece(new King(Color.WHITE), new Position(3, 2));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith6WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 3));
        board.setPiece(new King(Color.WHITE), new Position(2, 2));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith5WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 3));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith4WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 4));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith3WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith2WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith1WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith0WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith8BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 3));
        board.setPiece(new King(Color.BLACK), new Position(2, 2));
        board.setPiece(new King(Color.BLACK), new Position(3, 2));
        board.setPiece(new King(Color.BLACK), new Position(4, 2));
        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith7BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);

        board.setPiece(new King(Color.BLACK), new Position(5, 4));
        board.setPiece(new King(Color.BLACK), new Position(4, 5));
        board.setPiece(new King(Color.BLACK), new Position(5, 2));
        board.setPiece(new King(Color.BLACK), new Position(4, 1));
        board.setPiece(new King(Color.BLACK), new Position(2, 5));
        board.setPiece(new King(Color.BLACK), new Position(1, 4));
        board.setPiece(new King(Color.BLACK), new Position(1, 2));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith6BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);

        board.setPiece(new King(Color.BLACK), new Position(5, 4));
        board.setPiece(new King(Color.BLACK), new Position(4, 5));
        board.setPiece(new King(Color.BLACK), new Position(5, 2));
        board.setPiece(new King(Color.BLACK), new Position(4, 1));
        board.setPiece(new King(Color.BLACK), new Position(2, 5));
        board.setPiece(new King(Color.BLACK), new Position(1, 4));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith5BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.BLACK), new Position(5, 4));
        board.setPiece(new King(Color.BLACK), new Position(4, 5));
        board.setPiece(new King(Color.BLACK), new Position(5, 2));
        board.setPiece(new King(Color.BLACK), new Position(4, 1));
        board.setPiece(new King(Color.BLACK), new Position(2, 5));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith4BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.BLACK), new Position(5, 4));
        board.setPiece(new King(Color.BLACK), new Position(4, 5));
        board.setPiece(new King(Color.BLACK), new Position(5, 2));
        board.setPiece(new King(Color.BLACK), new Position(4, 1));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith3BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.BLACK), new Position(5, 4));
        board.setPiece(new King(Color.BLACK), new Position(4, 5));
        board.setPiece(new King(Color.BLACK), new Position(5, 2));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith2BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.BLACK), new Position(5, 4));
        board.setPiece(new King(Color.BLACK), new Position(4, 5));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith1BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);
        board.setPiece(new King(Color.BLACK), new Position(5, 4));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsBlackKingMiddleBoardWith0BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.BLACK);

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    /*
    Method getPossibleMoves for white King
    */
    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoard() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesWhiteKingLeftBottomCorner() {

        Position position = new Position(0, 0);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(1, 0),
                new Position(1, 1),
                new Position(0, 1)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingRightBottomCorner() {

        Position position = new Position(0, 7);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(1, 7),
                new Position(1, 6),
                new Position(0, 6)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingRightTopCorner() {

        Position position = new Position(7, 7);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(6, 7),
                new Position(6, 6),
                new Position(7, 6)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingLefttTopCorner() {

        Position position = new Position(7, 0);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(7, 1),
                new Position(6, 1),
                new Position(6, 0)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoardWithWhitePieceInPos54() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoardWithWhitePieceInRightTop() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoardWithWhiteieceInAllTop() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new Pawn(Color.WHITE), new Position(4, 2));
        board.setPiece(new Pawn(Color.WHITE), new Position(4, 3));
        board.setPiece(new Pawn(Color.WHITE), new Position(4, 4));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoardWithWhitePieceInMoves() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 3));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoardWithWhitePieceInAllExceptBottomLeft() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.WHITE), new Position(4, 2));
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 4));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(3, 2),
                new Position(2, 2),
                new Position(2, 3)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoardWithWhitePieceInAllExceptOne() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 3));
        board.setPiece(new King(Color.WHITE), new Position(2, 2));
        board.setPiece(new King(Color.WHITE), new Position(3, 2));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoardWithWhitePieceInAll() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.WHITE), new Position(4, 3));
        board.setPiece(new King(Color.WHITE), new Position(4, 4));
        board.setPiece(new King(Color.WHITE), new Position(3, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 4));
        board.setPiece(new King(Color.WHITE), new Position(2, 3));
        board.setPiece(new King(Color.WHITE), new Position(2, 2));
        board.setPiece(new King(Color.WHITE), new Position(3, 2));
        board.setPiece(new King(Color.WHITE), new Position(4, 2));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoardWith1BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoardWith2BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoardWith3BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoardWith4BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoardWith5BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 3));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoardWith6BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 3));
        board.setPiece(new King(Color.BLACK), new Position(2, 2));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMoveWhiteKingMiddleBoardWith7BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 3));
        board.setPiece(new King(Color.BLACK), new Position(2, 2));
        board.setPiece(new King(Color.BLACK), new Position(3, 2));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesWhiteKingMiddleBoardWith8BlackPieceNoChange() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 3));
        board.setPiece(new King(Color.BLACK), new Position(2, 2));
        board.setPiece(new King(Color.BLACK), new Position(3, 2));
        board.setPiece(new King(Color.BLACK), new Position(4, 2));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    /*
    Test for Capture position of the king piece with white king
     */
    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith8BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 3));
        board.setPiece(new King(Color.BLACK), new Position(2, 2));
        board.setPiece(new King(Color.BLACK), new Position(3, 2));
        board.setPiece(new King(Color.BLACK), new Position(4, 2));
        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2),
                new Position(4, 2)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith7BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 3));
        board.setPiece(new King(Color.BLACK), new Position(2, 2));
        board.setPiece(new King(Color.BLACK), new Position(3, 2));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2),
                new Position(3, 2)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith6BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 3));
        board.setPiece(new King(Color.BLACK), new Position(2, 2));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3),
                new Position(2, 2)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith5BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 3));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4),
                new Position(2, 3)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith4BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));
        board.setPiece(new King(Color.BLACK), new Position(2, 4));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(2, 4)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith3BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(3, 4));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith2BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 4));
        board.setPiece(new King(Color.BLACK), new Position(4, 3));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 4),
                new Position(4, 3)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith1BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.BLACK), new Position(4, 3));

        board.setPiece(king, position);
        List<Position> expResult = List.of(
                new Position(4, 3)
        );
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith0BlackPiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith8WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.WHITE), new Position(5, 4));
        board.setPiece(new King(Color.WHITE), new Position(4, 5));
        board.setPiece(new King(Color.WHITE), new Position(5, 2));
        board.setPiece(new King(Color.WHITE), new Position(4, 1));
        board.setPiece(new King(Color.WHITE), new Position(2, 5));
        board.setPiece(new King(Color.WHITE), new Position(1, 4));
        board.setPiece(new King(Color.WHITE), new Position(1, 2));
        board.setPiece(new King(Color.WHITE), new Position(2, 1));
        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith7WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);

        board.setPiece(new King(Color.WHITE), new Position(5, 4));
        board.setPiece(new King(Color.WHITE), new Position(4, 5));
        board.setPiece(new King(Color.WHITE), new Position(5, 2));
        board.setPiece(new King(Color.WHITE), new Position(4, 1));
        board.setPiece(new King(Color.WHITE), new Position(2, 5));
        board.setPiece(new King(Color.WHITE), new Position(1, 4));
        board.setPiece(new King(Color.WHITE), new Position(1, 2));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith6WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);

        board.setPiece(new King(Color.WHITE), new Position(5, 4));
        board.setPiece(new King(Color.WHITE), new Position(4, 5));
        board.setPiece(new King(Color.WHITE), new Position(5, 2));
        board.setPiece(new King(Color.WHITE), new Position(4, 1));
        board.setPiece(new King(Color.WHITE), new Position(2, 5));
        board.setPiece(new King(Color.WHITE), new Position(1, 4));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith5WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.WHITE), new Position(5, 4));
        board.setPiece(new King(Color.WHITE), new Position(4, 5));
        board.setPiece(new King(Color.WHITE), new Position(5, 2));
        board.setPiece(new King(Color.WHITE), new Position(4, 1));
        board.setPiece(new King(Color.WHITE), new Position(2, 5));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith4WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.WHITE), new Position(5, 4));
        board.setPiece(new King(Color.WHITE), new Position(4, 5));
        board.setPiece(new King(Color.WHITE), new Position(5, 2));
        board.setPiece(new King(Color.WHITE), new Position(4, 1));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith3WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.WHITE), new Position(5, 4));
        board.setPiece(new King(Color.WHITE), new Position(4, 5));
        board.setPiece(new King(Color.WHITE), new Position(5, 2));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith2WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.WHITE), new Position(5, 4));
        board.setPiece(new King(Color.WHITE), new Position(4, 5));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith1WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);
        board.setPiece(new King(Color.WHITE), new Position(5, 4));

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetCapturePositionsWhiteKingMiddleBoardWith0WhitePiece() {

        Position position = new Position(3, 3);
        Board board = new Board();
        King king = new King(Color.WHITE);

        board.setPiece(king, position);
        List<Position> expResult = List.of();
        List<Position> result = king.getCapturePositions(position, board);
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
