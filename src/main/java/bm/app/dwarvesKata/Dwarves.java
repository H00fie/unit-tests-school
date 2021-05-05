package bm.app.dwarvesKata;

public class Dwarves {

    private int numberOfAxemen = 0;
    private int numberOfBoarRiders = 0;
    private int armyNumbers = 0;

    public void recruitAxemen(int recruitmentOrder) {
        for (int i = 0; i < recruitmentOrder; i++) {
            numberOfAxemen++;
        }
    }

    public void recruitBoarRiders(int amountOfProvisions) {
        for (int i = 0; i < amountOfProvisions; i+=2) {
            numberOfBoarRiders++;
        }
    }





    public int getNumberOfAxemen() {
        return numberOfAxemen;
    }

    public int getNumberOfBoarRiders() {
        return numberOfBoarRiders;
    }
}
