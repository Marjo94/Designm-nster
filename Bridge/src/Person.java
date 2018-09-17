public abstract class Person {

    protected Shirt shirt; //Current shirt of person
    protected String name; //Name of person

    public Person(Shirt shirt, String name){
        this.shirt = shirt;
        this.name = name;
    }

    abstract public void putOnShirt();

}
