package bm.app.battleTacticKata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Army {

    private int numbers;
    private Map<String, Integer> armyComposition = new HashMap<>();

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public Map<String, Integer> getArmyComposition() {
        return armyComposition;
    }

    public void setArmyComposition(Map<String, Integer> armyComposition) {
        this.armyComposition = armyComposition;
    }
}
