package GunGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    //main method
    public static void main(String args[]) {
        Menu menu = new Menu();
        Enemy mob = new Enemy();
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;

        try {
            while (true) {
                menu.MainMenu();
                inputNum = sc.nextInt();
                sc.nextLine();
                if (inputNum == 1) {
                    System.out.println("*         - Game Start -          *");
                    Player p1 = new Player();
                    System.out.println("\"" + p1.ShowUserName() + "\" chosen !");
                    mob.EnemyStatus();
                    while (true) {
                        if (mob.enemyHP > 0) {
                            int selNum;
                            menu.BattleMenu();
                            selNum = sc.nextInt();
                            sc.nextLine();
                            switch (selNum) {
                                case 0:
                                    mob.enemyHP -= p1.Attack();
                                    mob.EnemyStatus();
                                    break;
                                case 1: // choose weapon
                                    p1.myGun = new Weapon();
                                    break;
                                case 2: // revolver chosen (ammunition: 120 , damage: 30) total 4 times of shooting available
                                    p1.myGun = new Revolver(120, 30);
                                    break;
                                case 3: // rifle chosen (ammunition : 200 , damage: 50) total 4 times of shooting available
                                    p1.myGun = new Rifle(200, 50);
                                    break;
                                case 4: // hand canon chosen (ammunition : 450 , damage: 150) total 3 times of shooting available
                                    p1.myGun = new Cannon(450, 150);
                                    break;
                                case 5:
                                    if (p1 instanceof Player2) {
                                        p1 = new Player();
                                        System.out.println("\"Changed to " + p1.ShowUserName() + "\"!");
                                        break;
                                    }
                                    if (p1 instanceof Player) {
                                        p1 = new Player2();
                                        System.out.println("\"Changed to " + p1.ShowUserName() + "\"!");
                                        break;
                                    }
                                default:
                                    System.out.println("Type one number [1-5].");
                                    break;
                            }
                        }

                        else if (mob.enemyHP <= 0) { // when the player damages the mob
                            mob.EnemyClearText();
                            mob = new Enemy(); // creating new mob
                            break; // back to menu
                        }
                    }
                }

                else if (inputNum == 2) {
                    System.out.println("quiting the game");
                    break;
                }

                else
                    System.out.println("Type one number [1 - 2]");

            }
        } catch (InputMismatchException e) {
            System.out.println("Error. Please select numbers only in bracket");
            System.out.println("Ending the game. .");
        }
    }
}