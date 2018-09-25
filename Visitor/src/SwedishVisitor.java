public class SwedishVisitor implements Visitor {
    @Override
    public void visit(Hudiksvall hudiksvall) {
        System.out.println("The Swedish visitor visited " + hudiksvall.getHudiksvall());
    }

    @Override
    public void visit(Karlstad karlstad) {
        System.out.println("The Swedish visitor visited " + karlstad.getKarlstad());
    }

    @Override
    public void visit(Stockholm stockholm) {
        System.out.println("The Swedish visitor visited " + stockholm.getStockholm());
    }
}
