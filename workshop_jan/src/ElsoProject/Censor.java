package ElsoProject;

public class Censor {
    public static void main(String[] args) {

        Human firstHuman = new Human();
        System.out.println(firstHuman.name);
        firstHuman.writeMyName();
        System.out.println(firstHuman.age + " éves vagyok.");

    }
        /*String censoredText = censor("Menj a picsába!", "picsá", "*****");
        System.out.println(censoredText);
        }
    static String censor(String text, String wordToChange, String newWord){
        text = text.replaceAll(wordToChange, newWord);
        return text;

    }*/
}
