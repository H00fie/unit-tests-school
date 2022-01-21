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
}
