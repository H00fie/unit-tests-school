package bm.app.shooter;

public class ShooterKata {

    public int dealRawRangedDamage(Weapon weapon) {
        return weapon.getPower();
    }

    public int dealDamage(Weapon weapon, Enemy enemy) {
        return enemy.ifArmoured() ? weapon.getPower() / 2 : weapon.getPower();
    }

}
