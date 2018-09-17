public class TemplateDemo {

    public static void main(String[] args){

        Color green = new Green();
        Color red = new Red();

        Shape square = new Square(2, 4);
        Shape rectangle = new Rectangle(4, 8);
        Shape circle = new Circle(4, 4);

        square.setColor(green);
        rectangle.setColor(red);
        circle.setColor(red);

        System.out.println(square.calculcateArea());
        System.out.println(rectangle.calculcateArea());
        System.out.println(circle.calculcateArea());

        System.out.println(square.getColor().getColor());
        System.out.println(rectangle.getColor().getColor());
        System.out.println(circle.getColor().getColor());


    }

}
