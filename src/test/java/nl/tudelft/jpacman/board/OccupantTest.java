package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void noStartSquare() {
        // Remove the following placeholder:
        assertThat(unit).isNotNull();
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testOccupy() {
        // Create a new square.
        Square targetSquare = new BasicSquare();

        // Make the unit occupy the square.
        unit.occupy(targetSquare);

        // Assert that the unit occupies the square.
        assertThat(unit.getSquare()).isEqualTo(targetSquare);
    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() {
        // Create two squares.
        Square firstSquare = new BasicSquare();
        Square secondSquare = new BasicSquare();

        // Make the unit occupy the first square.
        unit.occupy(firstSquare);

        // Reoccupy the unit with the second square.
        unit.occupy(secondSquare);

        // Assert that the unit now occupies the second square.
        assertThat(unit.getSquare()).isEqualTo(secondSquare);
    }
}
