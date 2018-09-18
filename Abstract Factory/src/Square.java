public class Square implements Shape {

    private Color color;

    @Override
    public void draw() {
        if (color == null) {
            System.out.println("You draw a square");
        } else {
            System.out.println("You draw a square with color " + color.toString());
        }
    }

    @Override
    public void fillWithColor(Color color) {
        this.color = color;
    }
}
