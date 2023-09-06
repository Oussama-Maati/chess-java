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
public class GameTest {

    private Game game;

    @BeforeEach     // Executé avant chaque test
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testStartCurrentPlayerWhite() {
        game.start();

        assertTrue(game.getCurrentPlayer().getColor().equals(Color.WHITE));

    }

    @Test
    public void testStartAllWhitePieceInGoodPos() {
        game.start();
        List<Position> result = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (game.getPiece(new Position(i, j)) != null
                        && game.getPiece(new Position(i, j)).getColor()
                        == Color.WHITE) {
                    result.add(new Position(i, j));
                }
            }
        }

        List<Position> expected = List.of(
                new Position(1, 0),
                new Position(1, 1),
                new Position(1, 2),
                new Position(1, 3),
                new Position(1, 4),
                new Position(1, 5),
                new Position(1, 6),
                new Position(1, 7),
                new Position(0, 0),
                new Position(0, 1),
                new Position(0, 2),
                new Position(0, 3),
                new Position(0, 4),
                new Position(0, 5),
                new Position(0, 6),
                new Position(0, 7)
        );

        assertEqualsIgnoringOrder(expected, result);

    }

    @Test
    public void testStartAllBlackPieceInGoodPos() {
        game.start();
        List<Position> result = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (game.getPiece(new Position(i, j)) != null
                        && game.getPiece(new Position(i, j)).getColor()
                        == Color.BLACK) {
                    result.add(new Position(i, j));
                }
            }
        }

        List<Position> expected = List.of(
                new Position(6, 0),
                new Position(6, 1),
                new Position(6, 2),
                new Position(6, 3),
                new Position(6, 4),
                new Position(6, 5),
                new Position(6, 6),
                new Position(6, 7),
                new Position(7, 0),
                new Position(7, 1),
                new Position(7, 2),
                new Position(7, 3),
                new Position(7, 4),
                new Position(7, 5),
                new Position(7, 6),
                new Position(7, 7)
        );

        assertEqualsIgnoringOrder(expected, result);

    }

    @Test
    public void testGetPieceIAERowAndColumn() {
        assertThrows(IllegalArgumentException.class, () -> {
            game.getPiece(new Position(8, 8));
        });

    }

    @Test
    public void testGetPieceIAERowOnly() {
        assertThrows(IllegalArgumentException.class, () -> {
            game.getPiece(new Position(8, 5));
        });

    }

    @Test
    public void testGetPieceIAEColumnOnly() {
        assertThrows(IllegalArgumentException.class, () -> {
            game.getPiece(new Position(2, 8));
        });

    }

    @Test
    public void testGetPieceBlackPiece() {
        game.start();
        Pawn expResult = new Pawn(Color.BLACK);
        Pawn result = (Pawn) game.getPiece(new Position(6, 0));

        assertTrue(expResult.equals(result));

    }

    @Test
    public void testGetPieceWhitePiece() {
        game.start();
        Pawn expResult = new Pawn(Color.WHITE);
        Piece result = game.getPiece(new Position(1, 0));

        assertTrue(expResult.equals(result));

    }

    @Test
    public void testGetPieceNoPiece() {
        game.start();
        Pawn expResult = new Pawn(Color.WHITE);
        Piece result = game.getPiece(new Position(3, 0));

        assertFalse(expResult.equals(result));

    }

    @Test
    public void testGetCurrentPlayerIsWhiteInStart() {
        game.start();
        assertTrue(game.getCurrentPlayer().getColor() == Color.WHITE);
    }

    @Test
    public void testGetCurrentPlayerMoveSoIsBlack() {
        game.start();
        game.movePiecePosition(new Position(1, 0), new Position(2, 0));
        assertTrue(game.getCurrentPlayer().getColor() == Color.BLACK);
    }

    @Test
    public void testGetCurrentPlayerTwoMoveSoIsWhite() {
        game.start();
        game.movePiecePosition(new Position(1, 0), new Position(2, 0));
        game.movePiecePosition(new Position(6, 0), new Position(5, 0));
        assertTrue(game.getCurrentPlayer().getColor() == Color.WHITE);
    }

    @Test
    public void testGetCurrentPlayerThreeMoveSoIsBlack() {
        game.start();
        game.movePiecePosition(new Position(1, 0), new Position(2, 0));
        game.movePiecePosition(new Position(6, 0), new Position(5, 0));
        game.movePiecePosition(new Position(2, 0), new Position(3, 0));
        assertTrue(game.getCurrentPlayer().getColor() == Color.BLACK);
    }

    @Test
    public void testGetOppositePlayerIsBlackAtStart() {
        game.start();
        assertTrue(game.getOppositePlayer().getColor() == Color.BLACK);
    }

    @Test
    public void testGetOppositePlayerIsWhiteAfterMove() {
        game.start();
        game.movePiecePosition(new Position(1, 0), new Position(2, 0));
        assertTrue(game.getOppositePlayer().getColor() == Color.WHITE);
    }

    @Test
    public void testIsCurrentPlayerPositionWhiteStartPos() {
        game.start();
        assertTrue(game.isCurrentPlayerPosition(new Position(1, 0)));
    }

    @Test
    public void testIsCurrentPlayerPositionWhiteStartPosLast() {
        game.start();

        assertTrue(game.isCurrentPlayerPosition(new Position(1, 7)));
    }

    @Test
    public void testIsCurrentPlayerPositionWhitePosWithTwoMoves() {
        game.start();
        game.movePiecePosition(new Position(1, 0), new Position(2, 0));
        game.movePiecePosition(new Position(6, 0), new Position(5, 0));

        assertTrue(game.isCurrentPlayerPosition(new Position(2, 0)));
    }

    @Test
    public void testIsCurrentPlayerPositionDontContainsPosIAE() {
        assertThrows(IllegalArgumentException.class, () -> {
            game.isCurrentPlayerPosition(new Position(-1, 0));
        });
    }

    @Test
    public void testIsCurrentPlayerPositionOutOfBoundIAERow() {
        assertThrows(IllegalArgumentException.class, () -> {
            game.isCurrentPlayerPosition(new Position(8, 5));
        });
    }

    @Test
    public void testIsCurrentPlayerPositionOutOfBoundIAEColumn() {
        assertThrows(IllegalArgumentException.class, () -> {
            game.isCurrentPlayerPosition(new Position(2, 10));
        });
    }

    @Test
    public void testIsCurrentPlayerPositionOutOfBoundIAEBoth() {
        assertThrows(IllegalArgumentException.class, () -> {
            game.isCurrentPlayerPosition(new Position(8, 9));
        });
    }

    @Test
    public void testIsCurrentPlayerPositionWhitePosAfterWhiteEatBlack() {
        game.start();
        game.movePiecePosition(new Position(1, 0), new Position(2, 0));
        game.movePiecePosition(new Position(6, 1), new Position(5, 1));
        game.movePiecePosition(new Position(2, 0), new Position(3, 0));
        game.movePiecePosition(new Position(5, 1), new Position(4, 1));
        game.movePiecePosition(new Position(3, 0), new Position(4, 1));
        game.movePiecePosition(new Position(6, 2), new Position(5, 2));

        assertTrue(game.isCurrentPlayerPosition(new Position(4, 1)));
    }

    @Test
    public void testIsCurrentPlayerPositionStartWithBLackPosAndNoMove() {
        game.start();
        assertFalse(game.isCurrentPlayerPosition(new Position(6, 0)));
    }

    @Test
    public void testIsCurrentPlayerPositionStartWithBLackPosAfterMove() {
        game.start();
        game.movePiecePosition(new Position(1, 1), new Position(2, 1));
        game.movePiecePosition(new Position(6, 6), new Position(5, 6));
        game.movePiecePosition(new Position(2, 1), new Position(3, 1));

        assertTrue(game.isCurrentPlayerPosition(new Position(5, 6)));
    }

    @Test
    public void testIsCurrentPlayerPositionBLackInBorderAfterAmove() {
        game.start();
        game.movePiecePosition(new Position(1, 0), new Position(3, 0));
        assertTrue(game.isCurrentPlayerPosition(new Position(6, 7)));
    }

    @Test
    public void testIsCurrentPlayerPositionWhitePosWithThreeMoves() {
        game.start();
        game.movePiecePosition(new Position(1, 0), new Position(2, 0));
        game.movePiecePosition(new Position(6, 0), new Position(5, 0));
        game.movePiecePosition(new Position(2, 0), new Position(3, 0));

        assertTrue(game.isCurrentPlayerPosition(new Position(5, 0)));
    }

    @Test
    public void testIsCurrentPlayerPositionBlackPosAfterBLackEatWhite() {
        game.start();
        game.movePiecePosition(new Position(1, 0), new Position(2, 0));
        game.movePiecePosition(new Position(6, 1), new Position(5, 1));
        game.movePiecePosition(new Position(2, 0), new Position(3, 0));
        game.movePiecePosition(new Position(5, 1), new Position(4, 1));
        game.movePiecePosition(new Position(3, 0), new Position(4, 0));

        assertTrue(game.isCurrentPlayerPosition(new Position(4, 1)));
    }

    @Test
    public void testIsCurrentPlayerPositionStartWithWhitePosAndOneMove() {
        game.start();
        game.movePiecePosition(new Position(1, 1), new Position(2, 1));

        assertFalse(game.isCurrentPlayerPosition(new Position(2, 1)));
    }

    @Test
    public void testMovePiecePositionStraightWhite() {
        game.start();
        game.movePiecePosition(new Position(1, 0), new Position(2, 0));
        Pawn expResult = new Pawn(Color.WHITE);
        Piece result = game.getPiece(new Position(2, 0));
        assertEquals(expResult, result);
    }

    @Test
    public void testMovePiecePositionTwoStraightWhite() {
        game.start();
        game.movePiecePosition(new Position(1, 0), new Position(3, 0));
        Pawn expResult = new Pawn(Color.WHITE);
        Piece result = game.getPiece(new Position(3, 0));
        assertEquals(expResult, result);
    }

    @Test
    public void testMovePiecePositionStraightBlack() {
        game.start();
        game.movePiecePosition(new Position(1, 1), new Position(3, 1));
        game.movePiecePosition(new Position(6, 0), new Position(5, 0));
        Pawn expResult = new Pawn(Color.BLACK);
        Piece result = game.getPiece(new Position(5, 0));
        assertEquals(expResult, result);
    }

    @Test
    public void testMovePiecePositionTwoStraightBlack() {
        game.start();
        game.movePiecePosition(new Position(1, 1), new Position(3, 1));
        game.movePiecePosition(new Position(6, 0), new Position(4, 0));
        Pawn expResult = new Pawn(Color.BLACK);
        Piece result = game.getPiece(new Position(4, 0));
        assertEquals(expResult, result);
    }

    @Test
    public void testMovePiecePositionOutOfBoundOldPosIAE() {
        game.start();
        assertThrows(IllegalArgumentException.class, () -> {
            game.movePiecePosition(new Position(8, 7), new Position(5, 5));
        });
    }

    @Test
    public void testMovePiecePositionOutOfBoundNewPosIAE() {
        game.start();
        assertThrows(IllegalArgumentException.class, () -> {
            game.movePiecePosition(new Position(0, 7), new Position(12, 5));
        });
    }

    @Test
    public void testMovePiecePositionNullPieceIAE() {
        game.start();
        assertThrows(IllegalArgumentException.class, () -> {
            game.movePiecePosition(new Position(3, 1), new Position(1, 1));
        });
    }

    @Test
    public void testMovePiecePositionNotCurrentPlayerWhitePositionBlackIAE() {
        game.start();
        assertThrows(IllegalArgumentException.class, () -> {
            game.movePiecePosition(new Position(6, 1), new Position(6, 5));
        });
    }

    @Test
    public void testMovePiecePositionNotCurrentPlayerBlackPositionWhiteIAE() {
        game.start();
        assertThrows(IllegalArgumentException.class, () -> {
            game.movePiecePosition(new Position(1, 1), new Position(2, 1));
            game.movePiecePosition(new Position(2, 1), new Position(3, 1));
        });
    }

    @Test
    public void testGameStatePlay() {

        game.start();

        game.movePiecePosition(new Position(1, 1), new Position(3, 1));

        assertEquals(GameState.PLAY, game.getState());

    }

    @Test
    public void testGameStateCheck() {
        game.start();

        game.movePiecePosition(new Position(1, 4), new Position(3, 4));
        game.movePiecePosition(new Position(6, 4), new Position(5, 4));
        game.movePiecePosition(new Position(1, 5), new Position(3, 5));
        game.movePiecePosition(new Position(7, 3), new Position(3, 7));

        assertEquals(GameState.CHECK, game.getState());

    }

    @Test
    public void testGameStateCheckMate() {
        game.start();

        game.movePiecePosition(new Position(1, 5), new Position(2, 5));
        game.movePiecePosition(new Position(6, 4), new Position(5, 4));
        game.movePiecePosition(new Position(1, 6), new Position(3, 6));
        game.movePiecePosition(new Position(7, 3), new Position(3, 7));

        assertEquals(GameState.CHECK_MATE, game.getState());

    }

    @Test
    public void testGameStateStaleMate() {
        game.start();

        game.movePiecePosition(new Position(1, 2), new Position(3, 2));
        game.movePiecePosition(new Position(6, 7), new Position(4, 7));
        game.movePiecePosition(new Position(1, 7), new Position(3, 7));
        game.movePiecePosition(new Position(6, 0), new Position(4, 0));
        game.movePiecePosition(new Position(0, 3), new Position(3, 0));
        game.movePiecePosition(new Position(7, 0), new Position(5, 0));
        game.movePiecePosition(new Position(3, 0), new Position(4, 0));
        game.movePiecePosition(new Position(5, 0), new Position(5, 7));  
        game.movePiecePosition(new Position(4, 0), new Position(6, 2));
        game.movePiecePosition(new Position(6, 5), new Position(5, 5));
        game.movePiecePosition(new Position(6, 2), new Position(6, 3));
        game.movePiecePosition(new Position(7, 4), new Position(6, 5));
        game.movePiecePosition(new Position(6, 3), new Position(6, 1)); 
        game.movePiecePosition(new Position(7, 3), new Position(2, 3));
        game.movePiecePosition(new Position(6, 1), new Position(7, 1));
        game.movePiecePosition(new Position(2, 3), new Position(6, 7));
        game.movePiecePosition(new Position(7, 1), new Position(7, 2));
        game.movePiecePosition(new Position(6, 5), new Position(5, 6));
        game.movePiecePosition(new Position(7, 2), new Position(5, 4));

        assertEquals(GameState.STALE_MATE, game.getState());

    }

    /*
    Already tested in the Pawn Class
     */
    @Test
    public void testGetPossibleMovesBlack() {
        game.start();
        Position position = new Position(6, 6);

        List<Position> result = game.getPossibleMoves(position);

        List<Position> expResult = new ArrayList<>(List.of(
                new Position(5, 6),
                new Position(4, 6)
        ));

        assertEqualsIgnoringOrder(expResult, result);
    }

    /*
    Already tested in the Pawn Class
     */
    @Test
    public void testGetPossibleMovesWhite() {
        game.start();
        Position position = new Position(1, 1);

        List<Position> result = game.getPossibleMoves(position);

        List<Position> expResult = new ArrayList<>(List.of(
                new Position(2, 1),
                new Position(3, 1)
        ));

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
