import BattleShipActivity.BattleShipActivity;
import BattleShipActivity.BattleShipModules.BattleShipBoard;

import java.io.IOException;

public class StartGame {




    public static void main(String[] args) throws InterruptedException, IOException {
        BattleShipActivity battleShipDao = new BattleShipActivity();
      //  battleShipDao.introduceTheGame();
        battleShipDao.setUpTheBoard(new BattleShipBoard()); //TODO this is wrong?
    }
}
