public class ConsonantsToUpperCaseCommand implements Command {

    private String text;

    public ConsonantsToUpperCaseCommand(String text) {
        this.text = text;
    }


    @Override
    public void execute() {
        StringBuilder result = new StringBuilder(text);
        for (int i = 0; i < text.length(); i++) {
            char consonant = text.charAt(i);
            switch (consonant) {
                case 'b':
                case 'c':
                case 'd':
                case 'f':
                case 'g':
                case 'h':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'v':
                case 'x':
                case 'z':
                    result.setCharAt(i, Character.toUpperCase(consonant));
                    break;
            }
        }

        text = result.toString();
        System.out.println("Consonants to uppercase: " + text);

    }
}
