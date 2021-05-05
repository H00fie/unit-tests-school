package bm.app.dwarvesKata;

public class Dwarves {

    public int numberOfAxemen = 0;

    public void recruitAxemen(int recruitmentOrder) {
        for (int i = 0; i < recruitmentOrder; i++) {
            numberOfAxemen++;
        }
    }

    public int getNumberOfAxemen() {
        return numberOfAxemen;
    }
}
