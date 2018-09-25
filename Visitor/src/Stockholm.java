public class Stockholm implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getStockholm(){
        return "Stockholm";
    }
}
