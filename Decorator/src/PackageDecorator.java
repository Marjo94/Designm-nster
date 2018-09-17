public abstract class PackageDecorator implements Package {

    private Package pkg;

    public PackageDecorator(Package pkg) {
        this.pkg = pkg;
    }


    @Override
    public String decorate() {
        return pkg.decorate();
    }
}
