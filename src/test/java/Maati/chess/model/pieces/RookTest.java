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
public class RookTest {

    public RookTest() {
    }

    /**
     * Test of getPossibleMoves method, of class Rook.
     */
    @Test
    public void testGetPossibleMovesMiddleBoard() {
        Position position = new Position(3, 3);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);
        board.setPiece(rook, position);
        List<Position> expResult = List.of(
                new Position(3, 0),
                new Position(3, 1),
                new Position(3, 2),
                new Position(3, 4),
                new Position(3, 5),
                new Position(3, 6),
                new Position(3, 7),
                new Position(7, 3),
                new Position(6, 3),
                new Position(5, 3),
                new Position(4, 3),
                new Position(2, 3),
                new Position(1, 3),
                new Position(0, 3)
        );
        List<Position> result = rook.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackRookMiddelBoardWithWhitePieceInAllAxes() {
        Position position = new Position(3, 3);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);
        board.setPiece(rook, position);
        board.setPiece(new Pawn(Color.WHITE), new Position(3, 2));
        board.setPiece(new Pawn(Color.WHITE), new Position(3, 4));
        board.setPiece(new Pawn(Color.WHITE), new Position(4, 3));
        board.setPiece(new Pawn(Color.WHITE), new Position(2, 3));
        List<Position> expResult = List.of(
                new Position(3, 2),
                new Position(3, 4),
                new Position(4, 3),
                new Position(2, 3)
        );
        List<Position> result = rook.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackRookMiddelBoardWithBlackPieceInAllAxes() {
        Position position = new Position(3, 3);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);

        board.setPiece(new Pawn(Color.BLACK), new Position(3, 2));
        board.setPiece(new Pawn(Color.BLACK), new Position(3, 4));
        board.setPiece(new Pawn(Color.BLACK), new Position(4, 3));
        board.setPiece(new Pawn(Color.BLACK), new Position(2, 3));
        board.setPiece(rook, position);
        List<Position> expResult = List.of();
        List<Position> result = rook.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesLeftTopCorner() {
        Position position = new Position(7, 0);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);
        board.setPiece(rook, position);
        List<Position> expResult = List.of(
                new Position(6, 0),
                new Position(5, 0),
                new Position(4, 0),
                new Position(3, 0),
                new Position(2, 0),
                new Position(1, 0),
                new Position(0, 0),
                new Position(7, 1),
                new Position(7, 2),
                new Position(7, 3),
                new Position(7, 4),
                new Position(7, 5),
                new Position(7, 6),
                new Position(7, 7)
        );
        List<Position> result = rook.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackLeftTopCornerWithWhitePieceAround() {
        Position position = new Position(7, 0);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);
        board.setPiece(rook, position);
        board.setPiece(new Pawn(Color.WHITE), new Position(7, 1));
        board.setPiece(new Pawn(Color.WHITE), new Position(6, 0));

        List<Position> expResult = List.of(
                new Position(6, 0),
                new Position(7, 1)
        );
        List<Position> result = rook.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackLeftTopCornerWithBlackPieceAround() {
        Position position = new Position(7, 0);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);
        board.setPiece(rook, position);
        board.setPiece(new Pawn(Color.BLACK), new Position(7, 1));
        board.setPiece(new Pawn(Color.BLACK), new Position(6, 0));

        List<Position> expResult = List.of();
        List<Position> result = rook.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesRightTopCorner() {
        Position position = new Position(7, 7);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);
        board.setPiece(rook, position);
        List<Position> expResult = List.of(
                new Position(7, 6),
                new Position(7, 5),
                new Position(7, 4),
                new Position(7, 3),
                new Position(7, 2),
                new Position(7, 1),
                new Position(7, 0),
                new Position(6, 7),
                new Position(5, 7),
                new Position(4, 7),
                new Position(3, 7),
                new Position(2, 7),
                new Position(1, 7),
                new Position(0, 7)
        );
        List<Position> result = rook.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackRookRightTopCornerWithWhitePieceAround() {
        Position position = new Position(7, 7);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);
        board.setPiece(rook, position);
        board.setPiece(new Pawn(Color.WHITE), new Position(7, 6));
        board.setPiece(new Pawn(Color.WHITE), new Position(6, 7));
        List<Position> expResult = List.of(
                new Position(7, 6),
                new Position(6, 7)
        );
        List<Position> result = rook.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackRookRightTopCornerWithBlackPieceAround() {
        Position position = new Position(7, 7);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);
        board.setPiece(rook, position);
        board.setPiece(new Pawn(Color.BLACK), new Position(7, 6));
        board.setPiece(new Pawn(Color.BLACK), new Position(6, 7));
        List<Position> expResult = List.of();
        List<Position> result = rook.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesRightBottomCorner() {
        Position position = new Position(0, 7);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);
        board.setPiece(rook, position);
        List<Position> expResult = List.of(
                new Position(0, 6),
                new Position(0, 5),
                new Position(0, 4),
                new Position(0, 3),
                new Position(0, 2),
                new Position(0, 1),
                new Position(0, 0),
                new Position(6, 7),
                new Position(5, 7),
                new Position(4, 7),
                new Position(3, 7),
                new Position(2, 7),
                new Position(1, 7),
                new Position(7, 7)
        );
        List<Position> result = rook.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackRookRightBottomCornerWithWhitePieceAround() {
        Position position = new Position(0, 7);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);
        board.setPiece(rook, position);
        board.setPiece(new Pawn(Color.WHITE), new Position(1, 7));
        board.setPiece(new Pawn(Color.WHITE), new Position(0, 6));

        List<Position> expResult = List.of(
                new Position(0, 6),
                new Position(1, 7)
        );
        List<Position> result = rook.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackRookRightBottomCornerWithBlackPieceAround() {
        Position position = new Position(0, 7);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);
        board.setPiece(rook, position);
        board.setPiece(new Pawn(Color.BLACK), new Position(1, 7));
        board.setPiece(new Pawn(Color.BLACK), new Position(0, 6));

        List<Position> expResult = List.of();
        List<Position> result = rook.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesLeftBottomCorner() {
        Position position = new Position(0, 0);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);
        board.setPiece(rook, position);
        List<Position> expResult = List.of(
                new Position(0, 6),
                new Position(0, 5),
                new Position(0, 4),
                new Position(0, 3),
                new Position(0, 2),
                new Position(0, 1),
                new Position(0, 7),
                new Position(1, 0),
                new Position(2, 0),
                new Position(3, 0),
                new Position(4, 0),
                new Position(5, 0),
                new Position(6, 0),
                new Position(7, 0)
        );
        List<Position> result = rook.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackRookLeftBottomCornerWithWhitePieceAround() {
        Position position = new Position(0, 0);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);
        board.setPiece(new Pawn(Color.WHITE), new Position(0, 1));
        board.setPiece(new Pawn(Color.WHITE), new Position(1, 0));

        board.setPiece(rook, position);
        List<Position> expResult = List.of(
                new Position(1, 0),
                new Position(0, 1)
        );
        List<Position> result = rook.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);

    }

    @Test
    public void testGetPossibleMovesBlackRookLeftBottomCornerWithBlackieceAround() {
        Position position = new Position(0, 0);
        Board board = new Board();
        Rook rook = new Rook(Color.BLACK);
        board.setPiece(new Pawn(Color.BLACK), new Position(0, 1));
        board.setPiece(new Pawn(Color.BLACK), new Position(1, 0));

        board.setPiece(rook, position);
        List<Position> expResult = List.of();
        List<Position> result = rook.getPossibleMoves(position, board);
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
