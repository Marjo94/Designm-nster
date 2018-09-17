public class Main {

    public static void main(String[] args){
        //Create a person and give a new Shirt and Name as parameter.
        Person janne = new Male(new BlueShirt(), "Janne");
        janne.putOnShirt(); //Call putOnShirt which comes from abstract class Person.

        Person jenny = new Female(new RedShirt(), "Jenny");
        jenny.putOnShirt();

    }

}
