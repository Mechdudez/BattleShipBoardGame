package BattleShipDAO.BattleShipModules;

public class Targeting {
    // If the player misses the ship
    private String miss = "X";
    // If the player hits the ship
    private String hit = "H";
    // If the player hasn't hit or miss this spot
    private String fogOfWar = "?";
    // If the warship has been sunk.
    private String sunk = "S";

    private String player = "";

    public Targeting(String miss, String hit, String fogOfWar, String sunk, String player) {
        this.miss = miss;
        this.hit = hit;
        this.fogOfWar = fogOfWar;
        this.sunk = sunk;
        this.player = player;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getMiss() {
        return miss;
    }

    public void setMiss(String miss) {
        this.miss = miss;
    }

    public String getHit() {
        return hit;
    }

    public void setHit(String hit) {
        this.hit = hit;
    }

    public String getFogOfWar() {
        return fogOfWar;
    }

    public void setFogOfWar(String fogOfWar) {
        this.fogOfWar = fogOfWar;
    }

    public String getSunk() {
        return sunk;
    }

    public void setSunk(String sunk) {
        this.sunk = sunk;
    }
}
