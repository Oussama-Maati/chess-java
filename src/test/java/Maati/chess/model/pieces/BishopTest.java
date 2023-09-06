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
public class BishopTest {

    public BishopTest() {
    }

    /**
     * Test of getPossibleMoves method, of class Bishop.
     */
    @Test
    public void testGetPossibleMovesMiddleBoard() {
        Position position = new Position(3, 3);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        List<Position> expResult = List.of(
                new Position(4, 4),
                new Position(5, 5),
                new Position(6, 6),
                new Position(7, 7),
                new Position(2, 2),
                new Position(1, 1),
                new Position(0, 0),
                new Position(4, 2),
                new Position(5, 1),
                new Position(6, 0),
                new Position(2, 4),
                new Position(1, 5),
                new Position(0, 6)
        );
        List<Position> result = bisphop.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesMiddleBoardWithWhitePieceAround() {
        Position position = new Position(3, 3);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        board.setPiece(new Pawn(Color.WHITE), new Position(4, 4));
        board.setPiece(new Pawn(Color.WHITE), new Position(2, 2));
        board.setPiece(new Pawn(Color.WHITE), new Position(4, 2));
        board.setPiece(new Pawn(Color.WHITE), new Position(2, 4));

        List<Position> expResult = List.of(
                new Position(4, 4),
                new Position(2, 2),
                new Position(4, 2),
                new Position(2, 4)
        );
        List<Position> result = bisphop.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesMiddleBoardWithBlackPieceAround() {
        Position position = new Position(3, 3);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        board.setPiece(new Pawn(Color.BLACK), new Position(4, 4));
        board.setPiece(new Pawn(Color.BLACK), new Position(2, 2));
        board.setPiece(new Pawn(Color.BLACK), new Position(4, 2));
        board.setPiece(new Pawn(Color.BLACK), new Position(2, 4));

        List<Position> expResult = List.of();
        List<Position> result = bisphop.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesLeftTopCorner() {
        Position position = new Position(7, 0);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        List<Position> expResult = List.of(
                new Position(6, 1),
                new Position(5, 2),
                new Position(4, 3),
                new Position(3, 4),
                new Position(2, 5),
                new Position(1, 6),
                new Position(0, 7)
        );
        List<Position> result = bisphop.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesLeftTopCornerWithWhitePieceAround() {
        Position position = new Position(7, 0);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        board.setPiece(new Pawn(Color.WHITE), new Position(6, 1));
        board.setPiece(new Pawn(Color.WHITE), new Position(5, 2));

        List<Position> expResult = List.of(
                new Position(6, 1)
        );
        List<Position> result = bisphop.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesLeftTopCornerWithBlackPieceAround() {
        Position position = new Position(7, 0);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        board.setPiece(new Pawn(Color.BLACK), new Position(6, 1));
        board.setPiece(new Pawn(Color.BLACK), new Position(5, 2));

        List<Position> expResult = List.of();
        List<Position> result = bisphop.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesRightTopCorner() {
        Position position = new Position(7, 7);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        List<Position> expResult = List.of(
                new Position(6, 6),
                new Position(5, 5),
                new Position(4, 4),
                new Position(3, 3),
                new Position(2, 2),
                new Position(1, 1),
                new Position(0, 0)
        );
        List<Position> result = bisphop.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesRightTopCornerWithWhitePieceAround() {
        Position position = new Position(7, 7);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        board.setPiece(new Pawn(Color.WHITE), new Position(6, 6));

        List<Position> expResult = List.of(
                new Position(6, 6)
        );
        List<Position> result = bisphop.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesRightTopCornerWithBlackPieceAround() {
        Position position = new Position(7, 7);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        board.setPiece(new Pawn(Color.BLACK), new Position(6, 6));

        List<Position> expResult = List.of();
        List<Position> result = bisphop.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesRightBottomCorner() {
        Position position = new Position(0, 7);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        List<Position> expResult = List.of(
                new Position(1, 6),
                new Position(2, 5),
                new Position(3, 4),
                new Position(4, 3),
                new Position(5, 2),
                new Position(6, 1),
                new Position(7, 0)
        );
        List<Position> result = bisphop.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesRightBottomCornerWithWhitePieceAround() {
        Position position = new Position(0, 7);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        board.setPiece(new Pawn(Color.WHITE), new Position(1, 6));
        board.setPiece(new Pawn(Color.WHITE), new Position(2, 5));
        board.setPiece(new Pawn(Color.WHITE), new Position(3, 4));

        List<Position> expResult = List.of(
                new Position(1, 6)
        );
        List<Position> result = bisphop.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesRightBottomCornerWithBlackPieceAround() {
        Position position = new Position(0, 7);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        board.setPiece(new Pawn(Color.BLACK), new Position(1, 6));
        board.setPiece(new Pawn(Color.BLACK), new Position(2, 5));
        board.setPiece(new Pawn(Color.BLACK), new Position(3, 4));

        List<Position> expResult = List.of();
        List<Position> result = bisphop.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesLeftBottomCorner() {
        Position position = new Position(0, 0);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        List<Position> expResult = List.of(
                new Position(1, 1),
                new Position(2, 2),
                new Position(3, 3),
                new Position(4, 4),
                new Position(5, 5),
                new Position(6, 6),
                new Position(7, 7)
        );
        List<Position> result = bisphop.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesLeftBottomCornerWithWhiteieceAround() {
        Position position = new Position(0, 0);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        board.setPiece(new Pawn(Color.WHITE), new Position(1, 1));

        List<Position> expResult = List.of(
                new Position(1, 1)
        );
        List<Position> result = bisphop.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesLeftBottomCornerWithBlackieceAround() {
        Position position = new Position(0, 0);
        Board board = new Board();
        Bishop bisphop = new Bishop(Color.BLACK);
        board.setPiece(bisphop, position);
        board.setPiece(new Pawn(Color.BLACK), new Position(1, 1));

        List<Position> expResult = List.of();
        List<Position> result = bisphop.getPossibleMoves(position, board);
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
