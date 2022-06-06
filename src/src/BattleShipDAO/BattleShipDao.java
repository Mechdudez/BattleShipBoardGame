package BattleShipDAO;

import BattleShipDAO.BattleShipModules.BattleShipBoard;
import BattleShipDAO.BattleShipModules.Targeting;
import BattleShipDAO.BattleShipModules.WarShips;

public class BattleShipDao {

    private BattleShipBoard battleShipBoard;

    private WarShips warShips;

    private Targeting targeting;

    public BattleShipDao(BattleShipBoard battleShipBoard, WarShips warShips, Targeting targeting) {
        this.battleShipBoard = battleShipBoard;
        this.warShips = warShips;
        this.targeting = targeting;
    }

    // Method that Introduces the player on the rules and game play.
    private void IntroductionOfTheGame() {

    }

    // Method that sets up the board
    private void boardSetUp() {

    }

    // Method that places the warShips // Randomly at this time, just can't be on top of each other ??? possible Nodes?.
    private void warShipPlacement() {

    }

    // Method that lets the player choose where to fire, letting them choose a column and row... possible instructions on this.
    // This Method will need a way to let the player they sunk a ship // TODO will I need to return something?
    private void targetTheWarShips() {

    }

    // Method for when the game ends with either player losing all their ships // Give them an option to go again?
    private void gameOver() {

    }

}
