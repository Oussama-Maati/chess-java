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
public class QueenTest {

    public QueenTest() {
    }

    /**
     * Test of getPossibleMoves method, of class Queen.
     */
    @Test
    public void testGetPossibleMovesAllMovesMiddleBoard() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        List<Position> expResult = List.of(
                new Position(4, 2),
                new Position(5, 1),
                new Position(6, 0),
                new Position(4, 3),
                new Position(5, 3),
                new Position(6, 3),
                new Position(7, 3),
                new Position(4, 4),
                new Position(5, 5),
                new Position(6, 6),
                new Position(7, 7),
                new Position(3, 4),
                new Position(3, 5),
                new Position(3, 6),
                new Position(3, 7),
                new Position(2, 4),
                new Position(1, 5),
                new Position(0, 6),
                new Position(2, 3),
                new Position(1, 3),
                new Position(0, 3),
                new Position(2, 2),
                new Position(1, 1),
                new Position(0, 0),
                new Position(3, 2),
                new Position(3, 1),
                new Position(3, 0)
        );
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesBlackQueenWithWhitePawnInLine() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        board.setPiece(new Pawn(Color.WHITE), new Position(3, 2));
        board.setPiece(new Pawn(Color.WHITE), new Position(3, 4));
        List<Position> expResult = List.of(
                new Position(4, 2),
                new Position(5, 1),
                new Position(6, 0),
                new Position(4, 3),
                new Position(5, 3),
                new Position(6, 3),
                new Position(7, 3),
                new Position(4, 4),
                new Position(5, 5),
                new Position(6, 6),
                new Position(7, 7),
                new Position(3, 4),
                new Position(2, 4),
                new Position(1, 5),
                new Position(0, 6),
                new Position(2, 3),
                new Position(1, 3),
                new Position(0, 3),
                new Position(2, 2),
                new Position(1, 1),
                new Position(0, 0),
                new Position(3, 2)
        );
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesBlackQueenWithWhitePawnInAllAxes() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        board.setPiece(new Pawn(Color.WHITE), new Position(4, 2));

        board.setPiece(new Pawn(Color.WHITE), new Position(4, 3));

        board.setPiece(new Pawn(Color.WHITE), new Position(4, 4));

        board.setPiece(new Pawn(Color.WHITE), new Position(3, 4));
        board.setPiece(new Pawn(Color.WHITE), new Position(3, 2));
        board.setPiece(new Pawn(Color.WHITE), new Position(2, 2));
        board.setPiece(new Pawn(Color.WHITE), new Position(2, 3));
        board.setPiece(new Pawn(Color.WHITE), new Position(2, 4));
        List<Position> expResult = List.of(
                new Position(4, 2),
                new Position(4, 3),
                new Position(4, 4),
                new Position(3, 4),
                new Position(3, 2),
                new Position(2, 2),
                new Position(2, 3),
                new Position(2, 4)
        );
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesBlackQueenWithBlackPawnsInLine() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        board.setPiece(new Pawn(Color.BLACK), new Position(3, 0));
        board.setPiece(new Pawn(Color.BLACK), new Position(3, 1));
        board.setPiece(new Pawn(Color.BLACK), new Position(3, 2));
        board.setPiece(new Pawn(Color.BLACK), new Position(3, 4));
        board.setPiece(new Pawn(Color.BLACK), new Position(3, 5));
        board.setPiece(new Pawn(Color.BLACK), new Position(3, 6));
        board.setPiece(new Pawn(Color.BLACK), new Position(3, 7));
        List<Position> expResult = List.of(
                new Position(4, 2),
                new Position(5, 1),
                new Position(6, 0),
                new Position(4, 3),
                new Position(5, 3),
                new Position(6, 3),
                new Position(7, 3),
                new Position(4, 4),
                new Position(5, 5),
                new Position(6, 6),
                new Position(7, 7),
                new Position(2, 4),
                new Position(1, 5),
                new Position(0, 6),
                new Position(2, 3),
                new Position(1, 3),
                new Position(0, 3),
                new Position(2, 2),
                new Position(1, 1),
                new Position(0, 0)
        );
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesBlackQueenWithBlackPawnsInAllAxe() {

        Position position = new Position(3, 3);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        board.setPiece(new Pawn(Color.BLACK), new Position(4, 2));

        board.setPiece(new Pawn(Color.BLACK), new Position(4, 3));

        board.setPiece(new Pawn(Color.BLACK), new Position(4, 4));

        board.setPiece(new Pawn(Color.BLACK), new Position(3, 4));
        board.setPiece(new Pawn(Color.BLACK), new Position(3, 2));
        board.setPiece(new Pawn(Color.BLACK), new Position(2, 2));
        board.setPiece(new Pawn(Color.BLACK), new Position(2, 3));
        board.setPiece(new Pawn(Color.BLACK), new Position(2, 4));
        List<Position> expResult = List.of();
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesLeftTopCorner() {

        Position position = new Position(7, 0);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        List<Position> expResult = List.of(
                new Position(7, 1),
                new Position(7, 2),
                new Position(7, 3),
                new Position(7, 4),
                new Position(7, 5),
                new Position(7, 6),
                new Position(7, 7),
                new Position(6, 0),
                new Position(5, 0),
                new Position(4, 0),
                new Position(3, 0),
                new Position(2, 0),
                new Position(1, 0),
                new Position(0, 0),
                new Position(6, 1),
                new Position(5, 2),
                new Position(4, 3),
                new Position(3, 4),
                new Position(2, 5),
                new Position(1, 6),
                new Position(0, 7)
        );
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesBlackQueenLeftTopCornerWithWhiteInAllAxes() {

        Position position = new Position(7, 0);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(new Pawn(Color.WHITE), new Position(7, 1));
        board.setPiece(new Pawn(Color.WHITE), new Position(6, 0));
        board.setPiece(new Pawn(Color.WHITE), new Position(6, 1));
        board.setPiece(queen, position);
        List<Position> expResult = List.of(
                new Position(7, 1),
                new Position(6, 0),
                new Position(6, 1)
        );
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesBlackQueenLeftTopCornerWithBlackPawnInAllAxes() {

        Position position = new Position(7, 0);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        board.setPiece(new Pawn(Color.BLACK), new Position(7, 1));
        board.setPiece(new Pawn(Color.BLACK), new Position(6, 0));
        board.setPiece(new Pawn(Color.BLACK), new Position(6, 1));
        List<Position> expResult = List.of();
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesRightTopCorner() {

        Position position = new Position(7, 7);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        List<Position> expResult = List.of(
                new Position(7, 6),
                new Position(7, 5),
                new Position(7, 4),
                new Position(7, 3),
                new Position(7, 2),
                new Position(7, 1),
                new Position(7, 0),
                new Position(6, 6),
                new Position(5, 5),
                new Position(4, 4),
                new Position(3, 3),
                new Position(2, 2),
                new Position(1, 1),
                new Position(0, 0),
                new Position(6, 7),
                new Position(5, 7),
                new Position(4, 7),
                new Position(3, 7),
                new Position(2, 7),
                new Position(1, 7),
                new Position(0, 7)
        );
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesBlackQueenRightTopCornerWithWhitePawnInAllAxe() {

        Position position = new Position(7, 7);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        board.setPiece(new Pawn(Color.WHITE), new Position(7, 6));
        board.setPiece(new Pawn(Color.WHITE), new Position(6, 7));
        board.setPiece(new Pawn(Color.WHITE), new Position(6, 6));

        List<Position> expResult = List.of(
                new Position(7, 6),
                new Position(6, 7),
                new Position(6, 6)
        );
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesBlackQueenRightTopCornerWithBlackPawnInAllAxes() {

        Position position = new Position(7, 7);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        board.setPiece(new Pawn(Color.BLACK), new Position(7, 6));
        board.setPiece(new Pawn(Color.BLACK), new Position(6, 7));
        board.setPiece(new Pawn(Color.BLACK), new Position(6, 6));
        List<Position> expResult = List.of();
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesRightBottomCorner() {

        Position position = new Position(0, 7);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        List<Position> expResult = List.of(
                new Position(1, 6),
                new Position(2, 5),
                new Position(3, 4),
                new Position(4, 3),
                new Position(5, 2),
                new Position(6, 1),
                new Position(7, 0),
                new Position(1, 7),
                new Position(2, 7),
                new Position(3, 7),
                new Position(4, 7),
                new Position(5, 7),
                new Position(6, 7),
                new Position(7, 7),
                new Position(0, 6),
                new Position(0, 5),
                new Position(0, 4),
                new Position(0, 3),
                new Position(0, 2),
                new Position(0, 1),
                new Position(0, 0)
        );
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesBlackQueenRightBottomCornerWithWhitePAwnInAllAxes() {

        Position position = new Position(0, 7);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        board.setPiece(new Pawn(Color.WHITE), new Position(0, 6));
        board.setPiece(new Pawn(Color.WHITE), new Position(1, 6));
        board.setPiece(new Pawn(Color.WHITE), new Position(1, 7));
        List<Position> expResult = List.of(
                new Position(0, 6),
                new Position(1, 6),
                new Position(1, 7)
        );
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesBlackQueenRightBottomCornerWithBlackPAwnInAllAxes() {

        Position position = new Position(0, 7);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        board.setPiece(new Pawn(Color.BLACK), new Position(0, 6));
        board.setPiece(new Pawn(Color.BLACK), new Position(1, 6));
        board.setPiece(new Pawn(Color.BLACK), new Position(1, 7));
        List<Position> expResult = List.of();
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesLeftBottomCorner() {

        Position position = new Position(0, 0);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        List<Position> expResult = List.of(
                new Position(1, 0),
                new Position(2, 0),
                new Position(3, 0),
                new Position(4, 0),
                new Position(5, 0),
                new Position(6, 0),
                new Position(7, 0),
                new Position(1, 1),
                new Position(2, 2),
                new Position(3, 3),
                new Position(4, 4),
                new Position(5, 5),
                new Position(6, 6),
                new Position(7, 7),
                new Position(0, 1),
                new Position(0, 2),
                new Position(0, 3),
                new Position(0, 4),
                new Position(0, 5),
                new Position(0, 6),
                new Position(0, 7)
        );
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesBlackQueenLeftBottomCornerWithWhitePawnInAllAxes() {

        Position position = new Position(0, 0);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        board.setPiece(new Pawn(Color.WHITE), new Position(1, 0));
        board.setPiece(new Pawn(Color.WHITE), new Position(0, 1));
        board.setPiece(new Pawn(Color.WHITE), new Position(1, 1));

        List<Position> expResult = List.of(
                new Position(0, 1),
                new Position(1, 0),
                new Position(1, 1)
        );
        List<Position> result = queen.getPossibleMoves(position, board);
        assertEqualsIgnoringOrder(expResult, result);
    }

    @Test
    public void testGetPossibleMovesBlackQueenLeftBottomCornerWithBlackPawnInAllAxes() {

        Position position = new Position(0, 0);
        Board board = new Board();
        Queen queen = new Queen(Color.BLACK);
        board.setPiece(queen, position);
        board.setPiece(new Pawn(Color.BLACK), new Position(1, 0));
        board.setPiece(new Pawn(Color.BLACK), new Position(0, 1));
        board.setPiece(new Pawn(Color.BLACK), new Position(1, 1));
        List<Position> expResult = List.of();
        List<Position> result = queen.getPossibleMoves(position, board);
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
