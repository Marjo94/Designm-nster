public class WhitespaceRemovalCommand implements Command {

    private String text;

    public WhitespaceRemovalCommand(String text){
        this.text = text;
    }


    @Override
    public void execute() {
        System.out.println("Whitespace removal: " + text.replaceAll("\\s", ""));
    }
}
