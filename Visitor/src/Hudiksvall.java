public class Hudiksvall implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getHudiksvall(){
        return "Hudiksvall";
    }
}
