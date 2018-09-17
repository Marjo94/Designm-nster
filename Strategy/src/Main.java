public class Main {

    public static void main(String[] args){
        //Get area of Square
        Context context = new Context(new OperationAreaOfSquare());
        System.out.println("Square area with width 5 and height 10: " + context.executeStrategy(5, 10));

        context = new Context(new OperationAreaOfTriangle());
        System.out.println("Triangle area with width 5 and height 10: " + context.executeStrategy(5, 10));

        context = new Context(new OperationAreaOfParallelogram());
        System.out.println("Parallelogram area with width 5 and height 10: " + context.executeStrategy(5, 10));

    }

}
