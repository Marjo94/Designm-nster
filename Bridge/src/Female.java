public class Female extends Person {

    public Female(Shirt shirt, String name) {
        super(shirt, name);
    }

    @Override
    public void putOnShirt() {
        System.out.print("Puts shirt with color ");
        shirt.putOnShirt();
    }
}