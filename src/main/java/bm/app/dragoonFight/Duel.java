package bm.app.dragoonFight;

public class Duel {

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
            }
        }
    }
}
