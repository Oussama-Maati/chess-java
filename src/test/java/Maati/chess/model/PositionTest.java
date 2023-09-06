package Maati.chess.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Maati Oussama
 */
public class PositionTest {

    @Test
    public void testNextDirectionNW() {
        Position ne = new Position(5, 5);

        Position neNext = ne.next(Direction.NW);

        Position expResult = new Position(6, 4);

        assertTrue(neNext.equals(expResult));

    }

    @Test
    public void testNextDirectionN() {
        Position ne = new Position(5, 5);

        Position neNext = ne.next(Direction.N);

        Position expResult = new Position(6, 5);

        assertTrue(neNext.equals(expResult));

    }

    @Test
    public void testNextDirectionNE() {
        Position ne = new Position(5, 5);

        Position neNext = ne.next(Direction.NE);

        Position expResult = new Position(6, 6);

        assertTrue(neNext.equals(expResult));

    }

    @Test
    public void testNextDirectionW() {
        Position ne = new Position(5, 5);

        Position neNext = ne.next(Direction.W);

        Position expResult = new Position(5, 4);

        assertTrue(neNext.equals(expResult));

    }

    @Test
    public void testNextDirectionE() {
        Position ne = new Position(5, 5);

        Position neNext = ne.next(Direction.E);

        Position expResult = new Position(5, 6);

        assertTrue(neNext.equals(expResult));

    }

    @Test
    public void testNextDirectionSW() {
        Position ne = new Position(5, 5);

        Position neNext = ne.next(Direction.SW);

        Position expResult = new Position(4, 4);

        assertTrue(neNext.equals(expResult));

    }

    @Test
    public void testNextDirectionS() {
        Position ne = new Position(5, 5);

        Position neNext = ne.next(Direction.S);

        Position expResult = new Position(4, 5);

        assertTrue(neNext.equals(expResult));

    }

    @Test
    public void testNextDirectionSE() {
        Position ne = new Position(5, 5);

        Position neNext = ne.next(Direction.SE);

        Position expResult = new Position(4, 6);

        assertTrue(neNext.equals(expResult));

    }

    @Test
    public void testGetRow() {

        Position instance = new Position(5, 3);
        Integer expResult = 5;
        Integer result = instance.getRow();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetColumn() {

        Position instance = new Position(5, 3);
        Integer expResult = 3;
        Integer result = instance.getColumn();
        assertEquals(expResult, result);
        
    }

}
