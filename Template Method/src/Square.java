public class Square implements Shape {

    private double width;
    private double height;

    private Color color;

    public Square(double width, double height){
        this.width = width;
        this.height = height;
    }


    @Override
    public double calculcateArea() {
        return width * height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
