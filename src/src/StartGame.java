import BattleShipDAO.BattleShipDao;

import java.io.IOException;

public class StartGame {

    public static void main(String[] args) throws InterruptedException, IOException {
        BattleShipDao battleShipDao = new BattleShipDao();
        battleShipDao.introduceTheGame();
    }
}
