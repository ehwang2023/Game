package GunGame;

public class Enemy {
    int enemyHP;

    public Enemy() {
        // create enemy's HP randomly between 500-1000
        enemyHP = (int)(Math.random()*(1000-500)) + 500;
    }

    void EnemyStatus() {
        System.out.println("Mob's current HP is \"" + enemyHP + "\"!");
    }

    void EnemyClearText() {
        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
        System.out.println("★★    Mob is dead !    ★★");
        System.out.println("☆★★★★★★★★★★★★★★★★★★★★★★★★★★★");
        System.out.println("Back to Menu..");
    }
}