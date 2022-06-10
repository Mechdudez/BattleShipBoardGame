import BattleShipDAO.BattleShipActivity;
import BattleShipDAO.BattleShipModules.BattleShipBoard;
import BattleShipDAO.BattleShipModules.Targeting;
import BattleShipDAO.BattleShipModules.WarShips;

import java.io.IOException;

public class StartGame {




    public static void main(String[] args) throws InterruptedException, IOException {
        BattleShipActivity battleShipDao = new BattleShipActivity();
    //    battleShipDao.introduceTheGame();
        battleShipDao.setUpTheBoard(new BattleShipBoard()); //TODO this is wrong?
    }
}
