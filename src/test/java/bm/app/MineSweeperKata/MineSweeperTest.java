package bm.app.MineSweeperKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

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
    void shouldCountTheNumberOfFields() {
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
        int numberOfFields = mineSweeper.countTheFields(inputArray);
        //then
        assertThat(numberOfFields).isEqualTo(3);
    }

    @Test
    void shouldCountTheNumberOfMinesForEachField() {
        //given
        int[][] inputArray = {
                {2, 3},
                {'*', '.', '.'},
                {'.', '.', '.'},
                {4, 3},
                {'.', '.', '*'},
                {'*', '.', '.'},
                {'.', '.', '.'},
                {'*', '.', '.'}
        };
        //when
        Integer expectedResult = 2;
        Map<Integer, Integer> actualNumbersOfMinesForEveryField = mineSweeper.countTheMinesForEveryField(inputArray);
        //then
        assertThat(actualNumbersOfMinesForEveryField.get(2)).isEqualTo(3);
    }

    @BeforeEach
    void setUp() {
        mineSweeper = new MineSweeper();
    }

}