public class DHLDecorator extends PackageDecorator {

    public DHLDecorator(Package pkg) {
        super(pkg);
    }

    public String decorate() {
        return super.decorate() + shippingWith();
    }

    private String shippingWith() {
        return " shipping with DHL";
    }

}
