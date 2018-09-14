public class Main {
    public static void main(String[] args) {


        ShapeCalculatorMaker calculator = new ShapeCalculatorMaker();

        Square square = new Square(2,2);

        float squareArea = calculator.getAreaOfObject(square);

        System.out.println(squareArea);

    }
}
