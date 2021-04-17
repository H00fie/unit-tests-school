package bm.app.shooter;

public class ShooterKata {

    public int dealRawRangedDamage(Weapon weapon) {
        return weapon.getPower();
    }

    public int dealDamage(Weapon weapon, Enemy enemy) {
        return enemy.ifArmoured() ? weapon.getPower() / 2 : weapon.getPower();
    }

    public boolean isAlive(Weapon weapon, Enemy enemy) {
        int damageDealt = dealDamage(weapon, enemy);
        if (damageDealt > enemy.getHealth()) {
            return false;
        }
        return true;
    }

    public boolean ifHeldGround(Enemy invader, Enemy defender) {
        if (invader.getPower() >= 18) {
            switch (defender.getCourage()) {
                case FEARLESS:
                case BRAVE:
                case STERN:
                    return true;
                default:
                    return false;
            }
        } else {
            return true;
        }
    }
}
