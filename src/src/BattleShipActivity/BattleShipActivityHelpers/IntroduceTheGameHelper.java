package BattleShipActivity.BattleShipActivityHelpers;

import BattleShipActivity.BattleShipModules.RulesOfTheGame;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class IntroduceTheGameHelper {

    public void introduceTheGameHelper() throws InterruptedException {
        Scanner player = new Scanner(System.in);
        RulesOfTheGame rulesOfTheGame = new RulesOfTheGame();
        int playerChoice;
        String nameOfUser = null;
        String nameOfUserTwo = null;
        boolean otherUserLeftItEmpty = true;
        boolean userLeftItEmpty = true;

        // The User will name themselves... if empty, will print out a message saying they will need to try again.
        // Player One
        while (userLeftItEmpty) {
            System.out.println("\nPlayer one please type in a name");
            nameOfUser = UserInputHelper.getStringUserInput();
            if (nameOfUser.isEmpty()) {
                System.out.println("Sorry it seems you didn't put anything in, Try again.");
                TimeUnit.SECONDS.sleep(1);
            } else {
                userLeftItEmpty = false;
            }
        }

        //Player two
        while (otherUserLeftItEmpty) {
            System.out.println("\nPlayer two please type in a name");
            nameOfUserTwo = UserInputHelper.getStringUserInput();
            if (nameOfUserTwo.isEmpty()) {
                System.out.println("Sorry it seems you didn't put anything in, Try again.");
                TimeUnit.SECONDS.sleep(1);
            } else {
                otherUserLeftItEmpty = false;
            }
        }

        do {
            System.out.println("\nHello Player One " + nameOfUser + " and welcome! This game is called Battleship and your goal is to destroy your enemy." +
                    "\n --------------------------------------" +
                    "\n 1: Rules of the Game." +
                    "\n 2: Play the Game." +
                    "\n -------------------------------------" +
                    "\n Please make your choice");
            playerChoice = player.nextInt();

            switch (playerChoice) {
                // This case will show the player the rules of the game.
                case 1:
                    rulesOfTheGame.Rules();
                    System.out.println("\nWhen you are ready to go back to the main menu press enter.");
                    UserInputHelper.getStringUserInput();
                    break;
                case 2:
                    // This will start the game and wish the player good luck!
                    System.out.println("Good luck player one! May your shots be in your favor.");
                    TimeUnit.SECONDS.sleep(5);
                    break;
                // Let the player know they can not make this selection
                default:
                    System.out.println("I am sorry, but option " + playerChoice + " is not an option. Try again.");
            }
        } while (playerChoice != 2);


        // This is where player two will have the option of seeing the rules or not.
        do {
            System.out.println("\nHello Player Two " + nameOfUserTwo + " and welcome! This game is called Battleship and your goal is to destroy your enemy." +
                    "\n --------------------------------------" +
                    "\n 1: Rules of the Game." +
                    "\n 2: Play the Game." +
                    "\n -------------------------------------" +
                    "\n Please make your choice");
            playerChoice = player.nextInt();

            switch (playerChoice) {
                // This case will show the player the rules of the game.
                case 1:
                    rulesOfTheGame.Rules();
                    System.out.println("\nWhen you are ready to go back to the main menu press enter.");
                    UserInputHelper.getStringUserInput();
                    break;
                case 2:
                    // This will start the game and wish the player good luck!
                    System.out.println("Good luck player two! May your shots be in your favor.");
                    TimeUnit.SECONDS.sleep(5);
                    break;
                // Let the player know they can not make this selection
                default:
                    System.out.println("I am sorry, but option " + playerChoice + " is not an option. Try again.");
            }
        } while (playerChoice != 2);
    }
}

