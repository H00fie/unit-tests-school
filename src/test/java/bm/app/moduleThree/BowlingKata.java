package bm.app.moduleThree;

public class BowlingKata {

    private int score = 0;

    public int getScore() {
        return score;
    }

    public void roll(int pins) {
        score += pins;
    }
}
