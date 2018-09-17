import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

        ArrayList<Command> process = new ArrayList<>();

        process.add(new VowelsToUpperCaseCommand(text));
        process.add(new ConsonantsToUpperCaseCommand(text));
        process.add(new WhitespaceRemovalCommand(text));
        process.add(new VowelsToWhitespaceCommand(text));

        process.forEach(Command::execute);

    }
}
