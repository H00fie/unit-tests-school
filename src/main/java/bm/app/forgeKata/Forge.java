package bm.app.forgeKata;

import java.util.HashMap;
import java.util.Map;

public class Forge {

    private Map<Weapon, Integer> armoury = new HashMap<>();

    public void forgeWeapons(String weapon, int quantity) {
        switch (weapon) {
            case "sword":
                if (armoury.containsKey(Weapon.SWORD)) {
                    armoury.put(Weapon.SWORD, armoury.get(weapon) + quantity);
                } else {
                    armoury.put(Weapon.SWORD, quantity);
                }
                break;
            case "axe":
                if (armoury.containsKey(Weapon.AXE)) {
                    armoury.put(Weapon.AXE, armoury.get(weapon) + quantity);
                } else {
                    armoury.put(Weapon.AXE, quantity);
                }
                break;
            case "hammer":
                if (armoury.containsKey(Weapon.HAMMER)) {
                    armoury.put(Weapon.HAMMER, armoury.get(weapon) + quantity);
                } else {
                    armoury.put(Weapon.HAMMER, quantity);
                }
                break;
            case "spear":
                if (armoury.containsKey(Weapon.SPEAR)) {
                    armoury.put(Weapon.SPEAR, armoury.get(weapon) + quantity);
                } else {
                    armoury.put(Weapon.SPEAR, quantity);
                }
                break;
            case "crossbow":
                if (armoury.containsKey(Weapon.CROSSBOW)) {
                    armoury.put(Weapon.CROSSBOW, armoury.get(weapon) + quantity);
                } else {
                    armoury.put(Weapon.CROSSBOW, quantity);
                }
                break;
            case "bow":
                if (armoury.containsKey(Weapon.BOW)) {
                    armoury.put(Weapon.BOW, armoury.get(weapon) + quantity);
                } else {
                    armoury.put(Weapon.BOW, quantity);
                }
                break;
        }
    }

    public Map<Weapon, Integer> getArmoury() {
        return armoury;
    }
}
