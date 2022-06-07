package BattleShipDAO;

import BattleShipDAO.BattleShipModules.BattleShipBoard;
import BattleShipDAO.BattleShipModules.RulesOfTheGame;
import BattleShipDAO.BattleShipModules.Targeting;
import BattleShipDAO.BattleShipModules.WarShips;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BattleShipDao {

    private BattleShipBoard battleShipBoard;

    private WarShips warShips;

    private Targeting targeting;

    public BattleShipDao() {
    }

    public BattleShipDao(BattleShipBoard battleShipBoard, WarShips warShips, Targeting targeting) {
        this.battleShipBoard = battleShipBoard;
        this.warShips = warShips;
        this.targeting = targeting;
    }

    // Method that Introduces the player on the rules and game play.
    public void introduceTheGame() throws InterruptedException{
        Scanner player = new Scanner(System.in);
        RulesOfTheGame rulesOfTheGame = new RulesOfTheGame();
        int playerChoice;

        do {
            System.out.println("\nHello and welcome! This game is called Battleship and your goal is to destroy your enemy." +
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
                  String test =  player.nextLine();
                  player.nextLine();
                    break;
                case 2:
                    // This will start the game and wish the player good luck!
                    System.out.println("Good luck player! May your shots be in your favor.");
                    TimeUnit.SECONDS.sleep(5);
                    break;
                // Let the player know they can not make this selection
                default:
                    System.out.println("I am sorry, but option " + playerChoice + " is not an option. Try again.");
            }
        } while (playerChoice != 2);
    }


    // Method that sets up the board
    public void setUpTheBoard() {

    }

    // Method that places the warShips // Randomly at this time, just can't be on top of each other ??? possible Nodes?.
    public void warShipPlacement() {

    }

    // Method that lets the player choose where to fire, letting them choose a column and row... possible instructions on this.
    // This Method will need a way to let the player they sunk a ship // TODO will I need to return something?
    public void targetTheWarShips() {

    }

    // Method for when the game ends with either player losing all their ships // Give them an option to go again?
    public void gameOver() {

    }

}
