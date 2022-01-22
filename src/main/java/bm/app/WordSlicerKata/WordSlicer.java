package bm.app.WordSlicerKata;

public class WordSlicer {

    public String[] cutStringInHalf(String providedWord) {
        String[] resultArray = new String[2];
        resultArray[0] = providedWord.substring(0, (providedWord.length() / 2));
        resultArray[1] = providedWord.substring((providedWord.length() / 2));
        return resultArray;
    }

    public char[] cutStringIntoSingleCharacters(String providedWord) {
        char[] resultArray = new char[providedWord.length()];
        for (int i = 0; i < providedWord.length(); i++) {
            resultArray[i] = providedWord.charAt(i);
        }
        return resultArray;
    }

    public String[] cutStringIntoPairs(String providedWord) {
        int arrayLength;
        if (providedWord.length() %2 == 0) {
            arrayLength = providedWord.length() / 2;
        } else {
            arrayLength = providedWord.length() / 2 + 1;
        }
        String[] resultArray = new String[arrayLength];
        int indexCounter = 0;
        for (int i = 0; i < providedWord.length(); i += 2) {
            if (i < providedWord.length() - 1) {
                resultArray[indexCounter] = String.valueOf(providedWord.charAt(i)) + providedWord.charAt(i + 1);
            } else {
                resultArray[indexCounter] = String.valueOf(providedWord.charAt(i));
            }
            indexCounter++;
        }
        return resultArray;
    }

    public String[] cutStringIntoPairsWithPossibleUnderscore(String providedWord) {
        int arrayLength;
        if (providedWord.length() %2 == 0) {
            arrayLength = providedWord.length() / 2;
        } else {
            arrayLength = providedWord.length() / 2 + 1;
        }
        String[] resultArray = new String[arrayLength];
        int indexCounter = 0;
        for (int i = 0; i < providedWord.length(); i += 2) {
            if (i < providedWord.length() - 1) {
                resultArray[indexCounter] = String.valueOf(providedWord.charAt(i)) + providedWord.charAt(i + 1);
            } else {
                resultArray[indexCounter] = providedWord.charAt(i) + "_";
            }
            indexCounter++;
        }
        return resultArray;
    }
}
