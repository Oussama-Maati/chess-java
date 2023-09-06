package Maati.chess.model;

import Maati.chess.model.pieces.Pawn;
import Maati.chess.model.pieces.Piece;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Maati Oussama
 */
public class PawnTest {

    Board board;

    public PawnTest() {
    }

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    @Test
    public void testGetPossibleMovesP() {
        Position position = new Position(1, 1);
        Pawn pawn = new Pawn(Color.WHITE);
        board.setPiece(pawn, position);

        List<Position> expected = List.of(
                new Position(2, 1),
                new Position(3, 1)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesWhiteNotOnInitialPos() {
        Position position = new Position(2, 1);
        Pawn pawn = new Pawn(Color.WHITE);
        board.setPiece(pawn, position);

        List<Position> expected = List.of(
                new Position(3, 1)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesWhiteNotOnInitialPosWithWhiteInFront() {
        Position position = new Position(2, 1);
        Pawn pawn = new Pawn(Color.WHITE);
        board.setPiece(pawn, position);

        Position black = new Position(3, 1);
        Pawn pawn2 = new Pawn(Color.WHITE);
        board.setPiece(pawn2, black);

        List<Position> expected = new ArrayList<>();

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesWhiteNotOnInitialPosWithBlackInFront() {
        Position position = new Position(2, 1);
        Pawn pawn = new Pawn(Color.WHITE);
        board.setPiece(pawn, position);

        Position black = new Position(3, 1);
        Piece pawn2 = new Pawn(Color.BLACK);
        board.setPiece(pawn2, black);

        List<Position> expected = new ArrayList<>();

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesWhiteWithBlackOnRightDiag() {
        Position position = new Position(2, 1);
        Pawn pawn = new Pawn(Color.WHITE);
        board.setPiece(pawn, position);

        Position black = new Position(3, 2);
        Pawn pawn2 = new Pawn(Color.BLACK);
        board.setPiece(pawn2, black);

        List<Position> expected = List.of(
                new Position(3, 1),
                new Position(3, 2)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesWhiteNotInitPositionWithBlackOnLeftDiag() {
        Position position = new Position(2, 1);
        Pawn pawn = new Pawn(Color.WHITE);
        board.setPiece(pawn, position);

        Position black = new Position(3, 0);
        Pawn pawn2 = new Pawn(Color.BLACK);
        board.setPiece(pawn2, black);

        List<Position> expected = List.of(
                new Position(3, 1),
                new Position(3, 0)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesWhiteNotInitialPositionWithBlackOnRightDiagAndLeftDiag() {
        Position position = new Position(2, 1);
        Pawn pawn = new Pawn(Color.WHITE);
        board.setPiece(pawn, position);

        Position black = new Position(3, 2);
        Pawn pawn2 = new Pawn(Color.BLACK);
        board.setPiece(pawn2, black);

        Position black2 = new Position(3, 0);
        Pawn pawn3 = new Pawn(Color.BLACK);
        board.setPiece(pawn3, black2);

        List<Position> expected = List.of(
                new Position(3, 1),
                new Position(3, 2),
                new Position(3, 0)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesWhiteOnInitialPosWithBlackInFront2Square() {
        Position position = new Position(2, 1);
        Pawn pawn = new Pawn(Color.WHITE);
        board.setPiece(pawn, position);

        Position black = new Position(4, 1);
        Pawn pawn2 = new Pawn(Color.BLACK);
        board.setPiece(pawn2, black);

        List<Position> expected = List.of(
                new Position(3, 1)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesWhiteInitPosWithBlackOnRightDiagAndLeftDiag() {
        Position position = new Position(1, 1);
        Pawn pawn = new Pawn(Color.WHITE);
        board.setPiece(pawn, position);

        Position black = new Position(2, 2);
        Pawn pawn2 = new Pawn(Color.BLACK);
        board.setPiece(pawn2, black);

        Position black2 = new Position(2, 0);
        Pawn pawn3 = new Pawn(Color.BLACK);
        board.setPiece(pawn3, black2);

        List<Position> expected = List.of(
                new Position(2, 2),
                new Position(2, 1),
                new Position(3, 1),
                new Position(2, 0)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesWhiteInitPosWithWhiteOnRightDiagAndLeftDiag() {
        Position position = new Position(1, 1);
        Pawn pawn = new Pawn(Color.WHITE);
        board.setPiece(pawn, position);

        Position black = new Position(2, 2);
        Pawn pawn2 = new Pawn(Color.WHITE);
        board.setPiece(pawn2, black);

        Position black2 = new Position(2, 0);
        Pawn pawn3 = new Pawn(Color.WHITE);
        board.setPiece(pawn3, black2);

        List<Position> expected = List.of(
                new Position(2, 1),
                new Position(3, 1)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesWhiteRightCorner() {
        Position position = new Position(7, 7);
        Pawn pawn = new Pawn(Color.WHITE);
        board.setPiece(pawn, position);

        List<Position> expected = new ArrayList<>();

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesWhiteLeftCorner() {
        Position position = new Position(7, 0);
        Pawn pawn = new Pawn(Color.WHITE);
        board.setPiece(pawn, position);

        List<Position> expected = new ArrayList<>();

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesBlackInitalPos() {
        Position position = new Position(6, 6);
        Pawn pawn = new Pawn(Color.BLACK);
        board.setPiece(pawn, position);

        List<Position> expected = List.of(
                new Position(5, 6),
                new Position(4, 6)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesBlackOnInitialPosWithWhiteInFront() {
        Position position = new Position(6, 6);
        Pawn pawn = new Pawn(Color.BLACK);
        board.setPiece(pawn, position);

        Position black = new Position(5, 6);
        Pawn pawn2 = new Pawn(Color.WHITE);
        board.setPiece(pawn2, black);

        List<Position> expected = new ArrayList<>();

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesBlackOnInitialPosWithWhiteInFront2SQaure() {
        Position position = new Position(6, 6);
        Pawn pawn = new Pawn(Color.BLACK);
        board.setPiece(pawn, position);

        Position black = new Position(4, 6);
        Pawn pawn2 = new Pawn(Color.WHITE);
        board.setPiece(pawn2, black);

        List<Position> expected = List.of(
                new Position(5, 6)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesBlackNotOnInitialPos() {
        Position position = new Position(5, 6);
        Pawn pawn = new Pawn(Color.BLACK);
        board.setPiece(pawn, position);

        List<Position> expected = List.of(
                new Position(4, 6)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesBlackNotOnInitialPosWithBlakInFront() {
        Position position = new Position(5, 6);
        Pawn pawn = new Pawn(Color.BLACK);
        board.setPiece(pawn, position);

        Position black = new Position(4, 6);
        Pawn pawn2 = new Pawn(Color.BLACK);
        board.setPiece(pawn2, black);

        List<Position> expected = new ArrayList<>();

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesBlackNotInitaialPositionWithWhiteOnRightDiag() {
        Position position = new Position(5, 6);
        Pawn pawn = new Pawn(Color.BLACK);
        board.setPiece(pawn, position);

        Position black = new Position(4, 5);
        Pawn pawn2 = new Pawn(Color.WHITE);
        board.setPiece(pawn2, black);

        List<Position> expected = List.of(
                new Position(4, 5),
                new Position(4, 6)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesBlackNotInitPositionWithWhiteOnLeftDiag() {
        Position position = new Position(5, 6);
        Pawn pawn = new Pawn(Color.BLACK);
        board.setPiece(pawn, position);

        Position black = new Position(4, 7);
        Pawn pawn2 = new Pawn(Color.WHITE);
        board.setPiece(pawn2, black);

        List<Position> expected = List.of(
                new Position(4, 6),
                new Position(4, 7)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesBlackNotInitialPositionWithWhiteOnRightDiagAndLeftDiag() {
        Position position = new Position(5, 6);
        Pawn pawn = new Pawn(Color.BLACK);
        board.setPiece(pawn, position);

        Position black = new Position(4, 5);
        Pawn pawn2 = new Pawn(Color.WHITE);
        board.setPiece(pawn2, black);

        Position black2 = new Position(4, 7);
        Pawn pawn3 = new Pawn(Color.WHITE);
        board.setPiece(pawn3, black2);

        List<Position> expected = List.of(
                new Position(4, 5),
                new Position(4, 6),
                new Position(4, 7)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesBlackOnInitialPositionWithWhiteOnRightDiagAndLeftDiag() {
        Position position = new Position(6, 6);
        Pawn pawn = new Pawn(Color.BLACK);
        board.setPiece(pawn, position);

        Position black = new Position(5, 5);
        Pawn pawn2 = new Pawn(Color.WHITE);
        board.setPiece(pawn2, black);

        Position black2 = new Position(5, 7);
        Pawn pawn3 = new Pawn(Color.WHITE);
        board.setPiece(pawn3, black2);

        List<Position> expected = List.of(
                new Position(5, 5),
                new Position(5, 6),
                new Position(5, 7),
                new Position(4, 6)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesBlackOnInitialPositionWithBlackOnRightDiagAndLeftDiag() {
        Position position = new Position(6, 6);
        Pawn pawn = new Pawn(Color.BLACK);
        board.setPiece(pawn, position);

        Position black = new Position(5, 5);
        Pawn pawn2 = new Pawn(Color.BLACK);
        board.setPiece(pawn2, black);

        Position black2 = new Position(5, 7);
        Pawn pawn3 = new Pawn(Color.BLACK);
        board.setPiece(pawn3, black2);

        List<Position> expected = List.of(
                new Position(5, 6),
                new Position(4, 6)
        );

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesBlackRightCorner() {
        Position position = new Position(0, 0);
        Pawn pawn = new Pawn(Color.BLACK);
        board.setPiece(pawn, position);

        List<Position> expected = new ArrayList<>();

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesBlackLeftCorner() {
        Position position = new Position(0, 7);
        Pawn pawn = new Pawn(Color.BLACK);
        board.setPiece(pawn, position);

        List<Position> expected = new ArrayList<>();

        List<Position> positions = pawn.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
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
