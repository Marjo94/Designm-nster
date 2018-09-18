public class MediumShip implements Ship {

    private int length = 3;
    private boolean isDestroyed = false;

    @Override
    public boolean isDestroyed() {
        return isDestroyed;
    }

    @Override
    public void setIsDestroyed() {
        isDestroyed = true;
    }

    @Override
    public int getLength() {
        return length;
    }
}
