package bm.app;

public class BowlingGame {

    private int score = 0;

    public int getScore() {
        return score;
    }

    public void roll(int bowls){
        score += bowls;
    }


}
