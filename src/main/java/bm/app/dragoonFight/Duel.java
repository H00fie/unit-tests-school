package bm.app.dragoonFight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duel {

    private List<String> dragoonBattalion = new ArrayList<>();
    PowerCrystal powerCrystal;

    public Duel(PowerCrystal powerCrystal) {
        this.powerCrystal = powerCrystal;
    }

    public int performSpineshatteringJump(int damage, int targetHealth) {
        return targetHealth - damage;
    }

    public void dragonClaw(Dragon dragon, Dragoon dragoon) {
        if (dragoon.getSpeed() < 250) {
            dragoon.setHealth(dragoon.getHealth() - dragon.getPhysicalPower());
            if (dragoon.getHealth() < 0) {
                dragoon.setHealth(0);
            }
        } else {
            System.out.println("The damage was dodged!");
        }
    }

    public void dragonSpellAttack(Dragon dragon, Dragoon dragoon) {
        if (!dragoon.getArmourType().equals("Enchanted mail")) {
            dragoon.setHealth(dragoon.getHealth() - dragon.getMagicalPower());
            if (dragoon.getHealth() < 0) {
                dragoon.setHealth(0);
                    dragoonBattalion.remove(dragoon.getName());
            }
        }
    }

    public void waveJumpAttack(Dragoon dragoon, Dragon dragon) {
        if (dragon.getDragonType().equals("Wivern")) {
            System.out.println("Wivern dodged the attack!");
        } else {
            dragon.setHealth(dragon.getHealth() - (dragoon.getPower() * 3));
            if (dragon.getHealth() < 0) {
                dragon.setHealth(0);
                System.out.println("The wyrm perished.");
            }
        }
    }

    public void flamingJump(Dragoon dragoon, Dragon dragon) {
        dragon.setHealth(dragon.getHealth() - (dragoon.getPower() * powerCrystal.powerBoostForType(dragoon.getArmourType())));
    }

    public boolean checkIfDead(int healthState) {
        if (healthState == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void crystalPoweredAttack(Dragon dragon, Dragoon dragoon) {
        dragon.setHealth(dragon.getHealth() - (dragoon.getPower() + powerCrystal.regularPowerBoost()));
    }

    public List<String> getDragoonBattalion() {
        return dragoonBattalion;
    }
}
