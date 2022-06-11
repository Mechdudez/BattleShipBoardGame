package BattleShipActivity;

import BattleShipActivity.BattleShipActivityHelpers.IntroduceTheGameHelper;
import BattleShipActivity.BattleShipActivityHelpers.SetUpTheBoardHelper;
import BattleShipActivity.BattleShipModules.BattleShipBoard;
import BattleShipActivity.BattleShipModules.Targeting;
import BattleShipActivity.BattleShipModules.WarShips;

public class BattleShipActivity {

    private BattleShipBoard battleShipBoard;

    private WarShips warShips;

    private Targeting targeting;

    public BattleShipActivity() {

    }

    public BattleShipActivity(BattleShipBoard battleShipBoard, WarShips warShips, Targeting targeting) {
        this.battleShipBoard = battleShipBoard;
        this.warShips = warShips;
        this.targeting = targeting;
    }

    // Method that Introduces the players on the rules and game play.
    public void introduceTheGame() throws InterruptedException {
        IntroduceTheGameHelper introduceTheGameHelper = new IntroduceTheGameHelper();

        introduceTheGameHelper.introduceTheGameHelper();
    }

    // Method that sets up the board
    public void setUpTheBoard(BattleShipBoard battleShipBoard) {
        int rows = 0;
        int columns = 0;
        //       int[] numbers = new int[10];
        //     int[] letters = new int[10];
        // private String fogOfWar = "?"; // warships
        for (rows = 0; rows < 10; rows++) { // represents the letters on the board
            for (columns = 0; columns < 10; columns++) { // represents the numbers on the board.
                battleShipBoard.getNumbers()[rows] = -1;
                battleShipBoard.getLetters()[columns] = -1;
                // -1 will be unknown, 0 is a miss and 1 is a hit.
                // I will need to add a fogOfWar to each number in the number array;
                // each letter should have 10 numbers in it.
                // each one of hardcoded for 10, so it won't go out of bounds.
                // After the iteration is done, print the grid out.
            }
        }
        SetUpTheBoardHelper setUpTheBoardHelper = new SetUpTheBoardHelper();
        System.out.println("\nType out where you would like to hit.\n");

        System.out.println("  Player One                                       Player Two"); // TODO Getter to get the names of players
        setUpTheBoardHelper.setUpTheBoard();
    }

    // Method that places the warShips // Randomly at this time, just can't be on top of each other ??? possible Nodes?.
    public void placementOfWarships() {

    }

    // Method that lets the player choose where to fire, letting them choose a column and row... possible instructions on this.
    // This Method will need a way to let the player they sunk a ship // TODO will I need to return something?
    public void targetTheWarShips() {

    }

    // Method for when the game ends with either player losing all their ships // Give them an option to go again?
    public void gameOver() {

    }

}
