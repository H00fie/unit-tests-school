package bm.app.dwarvesKata;

public class Dwarves {

    RuneMagic runeMagic;

    private int numberOfAxemen = 0;
    private int numberOfBoarRiders = 0;
    private int armyNumbers = 0;

    public Dwarves(RuneMagic runeMagic) {
        this.runeMagic = runeMagic;
    }

    public void recruitAxemen(int recruitmentOrder) {
        for (int i = 0; i < recruitmentOrder; i++) {
            numberOfAxemen++;
            armyNumbers++;
        }
    }

    public void recruitBoarRiders(int amountOfProvisions) {
        for (int i = 0; i < amountOfProvisions; i+=2) {
            numberOfBoarRiders++;
            armyNumbers++;
        }
    }

    public String checkTheSizeOfTheArmy() {
        String report;
        if (armyNumbers > 50) {
            report = "The army is huge!";
        } else if (armyNumbers > 30) {
            report = "The army is quite large!";
        } else  if (armyNumbers > 20) {
            report = "The army is pretty medium in size!";
        } else if (armyNumbers > 10) {
            report = "That's more of a unit than an army.";
        } else {
            report = "We might as well surrender already.";
        }
        return report;
    }

    public int getUnitHitPointsWithRuneShieldForASpecificUnitType(Unit unit, int manaSpent) {
        return getUnitHitPointsWithRuneShield(unit.getHealth(), decideThePowerOfTheRuneShield(manaSpent));
    }

    public int getUnitHitPointsWithDefaultRuneShield(Unit unit) {
        return getUnitHitPointsWithRuneShield(unit.getHealth(), runeMagic.getDefaultRuneShield());
    }

    public int getUnitHitPointsWithRuneShield(int health, int runeShield) {
        return health + runeShield;
    }

    private int decideThePowerOfTheRuneShield(int manaSpent) {
        int powerOfTheRuneShield = 0;
        switch (manaSpent) {
            case 50:
                powerOfTheRuneShield = 200;
                break;
            case 35:
                powerOfTheRuneShield = 100;
                break;
            case 10:
                powerOfTheRuneShield = 20;
                break;
        }
        return powerOfTheRuneShield;
    }

    public int getNumberOfAxemen() {
        return numberOfAxemen;
    }

    public int getNumberOfBoarRiders() {
        return numberOfBoarRiders;
    }

    public int getArmyNumbers() {
        return armyNumbers;
    }
}
