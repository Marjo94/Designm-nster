public class Rectangle implements Shape {

    private Color color;

    @Override
    public void draw() {
        if (color == null) {
            System.out.println("You draw a rectangle");
        } else {
            System.out.println("You draw a rectangle with color " + color.toString());
        }
    }

    @Override
    public void fillWithColor(Color color) {
        this.color = color;
    }
}
