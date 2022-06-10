package BattleShipDAO.BattleShipModules;

public class Targeting {
    // If the player misses the ship
    private String miss;
    // If the player hits the ship
    private String hit;
    // If the player hasn't hit or miss this spot
    private String fogOfWar;
    // If the warship has been sunk.
    private String sunk;

    private String player = "";

    public Targeting(String player) {
        this.miss = "X";
        this.hit = "H";
        this.fogOfWar = "?";
        this.sunk = "S";
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
