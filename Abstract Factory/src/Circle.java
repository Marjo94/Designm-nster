public class Circle implements Shape {

    private Color color;

    @Override
    public void draw() {
        if (color == null) {
            System.out.println("You draw a circle");
        } else {
            System.out.println("You draw a circle with color " + color.toString());
        }
    }

    @Override
    public void fillWithColor(Color color) {
        this.color = color;
    }
}
