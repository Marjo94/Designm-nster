public class ShapeCalculator {

    public float getAreaOfParallelogram(Object object) {
        Parallelogram parallelogram = (Parallelogram) object;
        return parallelogram.getHeight() * parallelogram.getWidth();
    }

    public float getAreaOfRectangle(Object object) {
        Rectangle rectangle = (Rectangle) object;
        return rectangle.getHeight() * rectangle.getWidth();
    }

    public float getAreaOfSquare(Object object) {
        Square square = (Square) object;
        return square.getHeight() * square.getWidth();
    }

}
