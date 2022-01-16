package bm.app.MineSweeperKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MineSweeperTest {

    MineSweeper mineSweeper;

    @Test
    void shouldReturnTheNumberOfLinesForEachField() {
        //given
        int[][] inputArray = {{2, 2}, {3, 4}, {6, 8}};
        //when
        int[] actualResultArray = mineSweeper.countFieldsSimply(inputArray);
        int[] expectedResultArray = {2, 3, 6};
        //then
        assertThat(actualResultArray).isEqualTo(expectedResultArray);
    }

    @Test
    void shouldCountTheNumberOfBatches() {
        //given
        int[][] inputArray = {
                {4, 4},
                {'.', '.', '.', '.'},
                {'.', '.', '.', '.'},
                {'.', '.', '.', '.'},
                {'.', '.', '.', '.'},
                {1, 2},
                {'.', '.'},
                {0, 0}
        };
        //when
        int numberOfBatches = mineSweeper.countTheBatches(inputArray);
        //then
        assertThat(numberOfBatches).isEqualTo(3);
    }

    @BeforeEach
    void setUp() {
        mineSweeper = new MineSweeper();
    }

}