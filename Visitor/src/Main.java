public class Main {

    public static void main(String[] args){

        Element[] list = {new Hudiksvall(), new Karlstad(), new Stockholm()};

        DanishVisitor danishVisitor = new DanishVisitor();
        SwedishVisitor swedishVisitor = new SwedishVisitor();

        for(Element element : list){
            element.accept(swedishVisitor);
        }
        for(Element element : list){
            element.accept(danishVisitor);
        }

    }
}
