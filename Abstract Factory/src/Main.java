public class Main {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color red = colorFactory.getColor("RED");
        Color orange = colorFactory.getColor("ORANGE");
        Color blue = colorFactory.getColor("BLUE");

        red.fill();
        orange.fill();
        blue.fill();

        Shape circle = shapeFactory.getShape("CIRCLE");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Shape square = shapeFactory.getShape("SQUARE");


        circle.fillWithColor(red);
        rectangle.fillWithColor(orange);
        square.fillWithColor(blue);

        circle.draw();
        rectangle.draw();
        square.draw();

    }

}
