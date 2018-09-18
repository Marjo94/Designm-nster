public class Tile {


    private boolean hasShip = false;
    private boolean beenShot = false;


    public Tile(boolean hasShip) {
        this.hasShip = hasShip;
    }

    public boolean hasShip() {
        return hasShip;
    }

    public void setHasShip(boolean hasShip) {
        this.hasShip = hasShip;
    }

    public boolean beenShot() {
        return beenShot;
    }

    public void setBeenShot(boolean beenShot) {
        this.beenShot = beenShot;
    }
}
