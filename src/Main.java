// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setWeaponName("НОЖ");
        weapon.setWeaponType(WeaponType.THROWING);
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(550);
        boss.setWeapon(weapon);
        System.out.println("health:"+ boss.getHealth() +"\nDAMAGE:"+ boss.getDamage() + "\nweaponName:"+ weapon.getWeaponName()+"\nweapontype:"+weapon.getWeaponType());

    }
}