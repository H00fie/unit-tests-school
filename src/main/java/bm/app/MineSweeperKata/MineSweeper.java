package bm.app.MineSweeperKata;

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

    public int countTheBatches(int[][] inputArray) {
        int result = 0;
        for (int row = 0; row < inputArray.length; row++) {
            if (inputArray[row][0] != '.') {
                result++;
            }
        }
        return result;
    }

}
