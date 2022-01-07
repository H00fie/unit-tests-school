package bm.app.moduleThree;

public class BowlingKata {

    private int spareJackpot = 0;
    private int strikeJackpot = 0;
    private int score = 0;

    public int getScore() {
        return score;
    }

    public void roll(int pins) {
        score += pins;
    }

    public void rolling(int numberOfThrows, int pinsFelled) {
        for (int i = 0; i < numberOfThrows; i++) {
            roll(pinsFelled);
        }
    }

    public void rollingWithSpare(int numberOfThrows, int pinsFelled) {
        if (spareJackpot == 1) {
            for (int i = 0; i < numberOfThrows; i++) {
                roll(pinsFelled * 2);
                spareJackpot = 0;
            }
        } else {
            for (int i = 0; i < numberOfThrows; i++) {
                roll(pinsFelled);
            }
        }
        for (int i = 0; i < numberOfThrows; i++) {
            roll(pinsFelled);
        }
        if ((numberOfThrows * pinsFelled) >= 10) {
            spareJackpot = 1;
        }
    }

    public void rollingWithStrike(int numberOfThrows, int pinsFelled) {
        if (strikeJackpot == 1) {
            for (int i = 0; i < numberOfThrows; i++) {
                roll(pinsFelled * 2);
            }
        } else {
            for (int i = 0; i < numberOfThrows; i++) {
                roll(pinsFelled);
            }
        }
        if (numberOfThrows == 1 && pinsFelled == 10) {
            strikeJackpot = 1;
        }
    }
}
