package BattleShipActivity.BattleShipModules;

import java.util.HashMap;
import java.util.Objects;

public class WarShips {
    private int hitPoints = 0;
    // 5(Carrier) spots,
    // 4(BattleShip),
    // Submarine(3),
    // Cruiser(3)
    // and Scout(2).
    private HashMap<String, Integer> warShips = new HashMap<>();

    public WarShips(int hitPoints, HashMap<String, Integer> warShips) {
        this.hitPoints = hitPoints;
        this.warShips = warShips;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public HashMap<String, Integer> getWarShips() {
        return warShips;
    }

    public void setWarShips(HashMap<String, Integer> warShips) {
        this.warShips = warShips;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WarShips)) return false;
        WarShips warShips1 = (WarShips) o;
        return hitPoints == warShips1.hitPoints && Objects.equals(warShips, warShips1.warShips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hitPoints, warShips);
    }


}
