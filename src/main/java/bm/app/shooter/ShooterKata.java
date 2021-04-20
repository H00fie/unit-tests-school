package bm.app.shooter;

import java.math.BigDecimal;

public class ShooterKata {

    MagicalShieldProvider magicalShieldProvider;

    public ShooterKata(MagicalShieldProvider magicalShieldProvider) {
        this.magicalShieldProvider = magicalShieldProvider;
    }

    public int dealRawRangedDamage(Weapon weapon) {
        return weapon.getPower();
    }

    public int dealDamage(Weapon weapon, Enemy enemy) {
        return enemy.ifArmoured() ? (weapon.getPower() / 2) : weapon.getPower();
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

    public int dealMassiveDamageWithShieldOn(Enemy invader, Enemy defender, int shield) {
        return (defender.getHealth() + shield) - invader.getPower() * 3;
    }

    public int dealDamageWithShieldOn(Enemy invader, Enemy defender, int shield) {
        return (defender.getHealth() + shield) - invader.getPower();
    }
}
