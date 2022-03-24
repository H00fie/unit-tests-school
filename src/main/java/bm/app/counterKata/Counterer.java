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

}
