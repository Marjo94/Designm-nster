public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("You fill the color blue");
    }

    @Override
    public String toString() {
        return "Blue";
    }
}
