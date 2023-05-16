package GunGame;

public class Weapon {
    int ammo = 60;
    int damage = 10;
    String weaponName = "Pistol";

    public Weapon() {
        System.out.println("You have \"" + weaponName + "\" now !");
    }

    public Weapon(int ammo, int dmg) {
        this.ammo = ammo;
        this.damage = dmg;
    }

    public void ChangeName(String mine) {
        this.weaponName = mine;
        System.out.println("\"You have selected" + weaponName + "\" !");
    }

    protected int Shoot() {
        System.out.println("BANG ! !");
        System.out.println("Current Weapon : " + weaponName);
        ammo -= damage;
        if (ammo >= 0) {
            System.out.println("Damage to the mob : \"" + damage +"\" !");
            System.out.println("Remaining Ammunition: \"" + ammo + "\".");
            return damage;
        } else {
            System.out.println("Low on Ammo! !");
            System.out.println("Change weapon and reload.");
        }
        return 0;
    }
}

class Revolver extends Weapon {
    String weaponName = "Revolver";

    public Revolver(int ammo, int damage) {
        super(ammo, damage);
        super.weaponName = weaponName;
        ChangeName(weaponName);
    }
}

class Rifle extends Weapon {
    String weaponName = "Rifle";

    public Rifle(int ammo, int damage) {
        super(ammo, damage);
        super.weaponName = weaponName;
        ChangeName(weaponName);
    }
}

class Cannon extends Weapon {
    String weaponName = "Hand Cannon";

    public Cannon(int ammo, int damage) {
        super(ammo, damage);
        super.weaponName = weaponName;
        ChangeName(weaponName);
    }
}