public class ShipCreator implements ShipFactory {
    @Override
    public SmallShip createSmallShip() {
        return new SmallShip();
    }

    @Override
    public MediumShip createMediumShip() {
        return new MediumShip();
    }

    @Override
    public LargeShip createLargeShip() {
        return new LargeShip();
    }
}
