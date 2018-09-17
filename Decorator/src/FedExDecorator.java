public class FedExDecorator extends PackageDecorator {

    public FedExDecorator(Package pkg) {
        super(pkg);
    }

    public String decorate() {
        return super.decorate() + shippingWith();
    }

    private String shippingWith() {
        return " shipping with Fedex";
    }
}
