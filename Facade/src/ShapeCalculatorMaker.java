public class ShapeCalculatorMaker {

    ShapeCalculator shapeCalculator = new ShapeCalculator();

    public float getAreaOfObject(Object object){

        float returnValue = 0;

        switch(object.getClass().getCanonicalName()){
            case "Square":
                returnValue = shapeCalculator.getAreaOfSquare(object);
                break;
            case "Parallelogram":
                returnValue = shapeCalculator.getAreaOfParallelogram(object);
                break;
            case "Rectangle":
                returnValue = shapeCalculator.getAreaOfRectangle(object);
                break;
        }
        return returnValue;
    }

}
