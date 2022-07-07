package bm.app.counterKata;

public class Counterer {

    public int countOddNumbers(int providedNumber) {
        int result = 0;
        for (int i = 0; i < providedNumber; i++) {
            if (i%2 != 0) {
                result += i;
            }
        }
        return result;
    }

    public int countDivisorsOf3And5(int providedNumber) {
        int result = 0;
        for (int i = 0; i < providedNumber; i++) {
            if (i%3 == 0 || i%5 == 0) {
                result += i;
            }
        }
        return result;
    }

    public int[][] createAMultidimensionalArray(int[] providedArray, int numberOfArrays) {
        int[][] temporaryArray = new int[numberOfArrays][providedArray.length / numberOfArrays];
        int rowIndex = 0;
        int columnIndex = 0;

        for (int element : providedArray) {
            temporaryArray[rowIndex][columnIndex] = element;

            columnIndex++;
            if (columnIndex == (providedArray.length / numberOfArrays)) {
                rowIndex++;
                columnIndex = 0;
            }

        }
        return temporaryArray;
    }

    public int countUpperCaseLetters(String providedWord) {
        int counter = 0;
        for (int i = 0; i < providedWord.length(); i++) {
            if (Character.isUpperCase(providedWord.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public String insertBlanks(String providedWord) {
        int partsArraySize = 0;
        for (int i = 0; i < providedWord.length(); i++) {
            if (Character.isUpperCase(providedWord.charAt(i))) {
                partsArraySize++;
            }
        }

        String[] partsArray = new String[partsArraySize];
        int arrayIndexCounter = 0;
        int indexForTheNextStringsStart = 0;

        for (int i = 1; i < providedWord.length(); i++) {
            if (Character.isUpperCase(providedWord.charAt(i))) {
                partsArray[arrayIndexCounter] = providedWord.substring(indexForTheNextStringsStart, i);
                indexForTheNextStringsStart = i;
                arrayIndexCounter++;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < partsArray.length; i++) {
            stringBuffer.append(partsArray[i]);
            stringBuffer.append(" ");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return stringBuffer.toString();
    }
}
