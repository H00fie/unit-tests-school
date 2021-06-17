package bm.app.forgeKata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class Forge {

    private static final Logger logger = LoggerFactory.getLogger(Forge.class);

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

    /**
     * TODO -> learn why I can increment Integer in a Map, as above, but
     * TODO -> I cannot decrement it ("because it's immutable"), as below.
     */

    public void issueAWeapon(String weapon) {
        switch (weapon) {
            case "sword":
                int currentSwordsNumber = armoury.get(Weapon.SWORD);
                if (armoury.containsKey(Weapon.SWORD)) {
                    if (armoury.get(Weapon.SWORD) >= 1) {
                        armoury.put(Weapon.SWORD, currentSwordsNumber - 1);
                        if (armoury.get(Weapon.SWORD) == 0) {
                            armoury.remove(Weapon.SWORD);
                        }
                    }
                } else {
                    logger.error("No swords left!");
                }
                break;
            case "axe":
                int currentAxesNumber = armoury.get(Weapon.AXE);
                if (armoury.containsKey(Weapon.AXE)) {
                    if (armoury.get(Weapon.AXE) >= 1) {
                        armoury.put(Weapon.AXE, currentAxesNumber - 1);
                        if (armoury.get(Weapon.AXE) == 0) {
                            armoury.remove(Weapon.AXE);
                        }
                    }
                } else {
                    logger.error("No axes left!");
                }
                break;
            case "hammer":
                int currentHammersNumber = armoury.get(Weapon.HAMMER);
                if (armoury.containsKey(Weapon.HAMMER)) {
                    if (armoury.get(Weapon.HAMMER) >= 1) {
                        armoury.put(Weapon.HAMMER, currentHammersNumber - 1);
                        if (armoury.get(Weapon.HAMMER) == 0) {
                            armoury.remove(Weapon.HAMMER);
                        }
                    }
                } else {
                    logger.error("No hammers left!");
                }
                break;
            case "spear":
                int currentSpearsNumber = armoury.get(Weapon.SPEAR);
                if (armoury.containsKey(Weapon.SPEAR)) {
                    if (armoury.get(Weapon.SPEAR) >= 1) {
                        armoury.put(Weapon.SPEAR, currentSpearsNumber - 1);
                        if (armoury.get(Weapon.SPEAR) == 0) {
                            armoury.remove(Weapon.SPEAR);
                        }
                    }
                } else {
                    logger.error("No spears left!");
                }
                break;
            case "crossbow":
                int currentCrossbowNumber = armoury.get(Weapon.CROSSBOW);
                if (armoury.containsKey(Weapon.CROSSBOW)) {
                    if (armoury.get(Weapon.CROSSBOW) >= 1) {
                        armoury.put(Weapon.CROSSBOW, currentCrossbowNumber - 1);
                        if (armoury.get(Weapon.CROSSBOW) == 0) {
                            armoury.remove(Weapon.CROSSBOW);
                        }
                    }
                } else {
                    logger.error("No crossbow left!");
                }
                break;
            case "bow":
                int currentBowsNumber = armoury.get(Weapon.BOW);
                if (armoury.containsKey(Weapon.BOW)) {
                    if (armoury.get(Weapon.BOW) >= 1) {
                        armoury.put(Weapon.BOW, currentBowsNumber - 1);
                        if (armoury.get(Weapon.BOW) == 0) {
                            armoury.remove(Weapon.BOW);
                        }
                    }
                } else {
                    logger.error("No bows left!");
                }
                break;
        }
    }

    public Map<Weapon, Integer> getArmoury() {
        return armoury;
    }
}
