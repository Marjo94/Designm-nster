public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("You fill the color red");
    }

    @Override
    public String toString() {
        return "Red";
    }
}
