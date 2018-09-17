public class Main {

    public static void main(String[] args) {

        Package pkg1 = new DHLDecorator(new PackageImpl());
        System.out.println(pkg1.decorate());

        Package pkg2 = new FedExDecorator(new PackageImpl());
        System.out.println(pkg2.decorate());

    }

}
