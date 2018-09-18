public class LargeShip implements Ship {

    private int length = 5;

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
