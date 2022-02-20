package bm.app.MineSweeperKata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MineSweeper {

    public int[] countFieldsSimply(int[][] inputArray) {
        int[] resultArray = new int[inputArray.length];
        int counter = 0;
        for (int row = 0; row < inputArray.length; row++) {
                resultArray[counter] = inputArray[row][0];
                counter++;
        }
        return resultArray;
    }

    public int countTheFields(int[][] inputArray) {
        int result = 0;
        for (int row = 0; row < inputArray.length; row++) {
            if (inputArray[row][0] != '.') {
                result++;
            }
        }
        return result;
    }

    public Map<Integer, Integer> countTheMinesForEveryField(int[][] inputArray) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        int fieldCounter = 0;
        int mineCounter  = 0;

        for (int row = 0; row < inputArray.length; row++) {
            if (inputArray[row][0] != '*' && inputArray[row][0] != '.') {
                fieldCounter++;
                resultMap.put(fieldCounter, 0);
                mineCounter = 0;
            }
            for (int column = 0; column < inputArray[row].length; column++) {
                if (inputArray[row][column] == '*') {
                    mineCounter++;
                }
            }
            resultMap.put(fieldCounter, mineCounter);
        }
        return resultMap;
    }

//    public int[][] countTheAdjacentMinesForEverySquare(int[][] inputArray) {
//        for (int row = 0; row <inputArray.length; row++) {
//            for (int column = 0; column < inputArray[row].length; column++) {
//
//            }
//        }
//    }
}
