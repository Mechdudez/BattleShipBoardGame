import BattleShipDAO.BattleShipActivity;

import java.io.IOException;

public class StartGame {

    public static void main(String[] args) throws InterruptedException, IOException {
        BattleShipActivity battleShipDao = new BattleShipActivity();
        battleShipDao.introduceTheGame();
    }
}
