package bm.app.dwarvesKata;

public class Dwarves {

    private int numberOfAxemen = 0;
    private int armyNumbers = 0;

    public void recruitAxemen(int recruitmentOrder) {
        for (int i = 0; i < recruitmentOrder; i++) {
            numberOfAxemen++;
        }
    }





    public int getNumberOfAxemen() {
        return numberOfAxemen;
    }
}
