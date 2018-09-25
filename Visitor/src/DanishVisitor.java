public class DanishVisitor implements Visitor {
    @Override
    public void visit(Hudiksvall hudiksvall) {
        System.out.println("The Danish visitor visited " + hudiksvall.getHudiksvall());
    }

    @Override
    public void visit(Karlstad karlstad) {
        System.out.println("The Danish visitor visited " + karlstad.getKarlstad());
    }

    @Override
    public void visit(Stockholm stockholm) {
        System.out.println("The Danish visitor visited " + stockholm.getStockholm());
    }
}
