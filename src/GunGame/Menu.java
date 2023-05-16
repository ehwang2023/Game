package GunGame;

public class Menu {
    void MainMenu() {
        System.out.println("======== Shooting Game ========");
        System.out.println("::  [1] Start the game   ");
        System.out.println("::  [2] End the game    ");
        System.out.println("===========================");
        System.out.print(" Please type a number [1 - 2].  >>> ");
    }

    void BattleMenu() {
        System.out.println("========== Battle Menu ===========");
        System.out.println("::  [0]Shoot !               ");
        System.out.println("::  [1]Pistol        [2]Revolver    ");
        System.out.println("::  [3]Rifle   [4]Hand Canon   ");
        System.out.println("::  [5]Change the player        ");
        System.out.println("==============================");
        System.out.print("Please type a number [0 - 5].  >>> ");
    }
}