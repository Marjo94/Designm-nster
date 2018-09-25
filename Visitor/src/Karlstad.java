public class Karlstad implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getKarlstad(){
        return "Karlstad";
    }
}
