package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test for the Board class.
 */
class BoardTest {

    private Board board;
    private Square square;

    /**
     * Set up a 1x1 board with a valid BasicSquare.
     */
    @BeforeEach
    void setUp() {
        square = new BasicSquare();
        Square[][] grid = {{square}};
        board = new Board(grid);
    }

    /**
     * Test if the board is correctly constructed and invariant holds.
     */
    @Test
    void boardIsValid() {
        assertThat(board).isNotNull();
        assertThat(board.getWidth()).isEqualTo(1);
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.squareAt(0, 0)).isEqualTo(square);
    }

    /**
     * Set up a 1x1 board with a null square, expecting an exception.
     */
    @Test
    void boardWithNullSquare() {
        Square[][] gridWithNull = {{null}};

        // Create the board with a null square, expecting an assertion failure
        try {
            new Board(gridWithNull);
        } catch (AssertionError e) {
            assertThat(e).hasMessage("Initial grid cannot contain null squares");
        }
    }

}
