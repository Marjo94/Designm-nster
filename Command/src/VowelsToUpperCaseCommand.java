public class VowelsToUpperCaseCommand implements Command {

    private String text;

    public VowelsToUpperCaseCommand(String text) {
        this.text = text;
    }


    @Override
    public void execute() {
        StringBuilder result = new StringBuilder(text);
        for (int i = 0; i < text.length(); i++)
        {
            char vowel = text.charAt(i);
            switch (vowel) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    result.setCharAt(i, Character.toUpperCase(vowel));
                    break;
            }
        }

        text = result.toString();
        System.out.println("Vowels to uppercase: " + text);

    }
}
