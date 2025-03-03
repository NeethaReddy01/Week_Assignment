package day6Tasks;

public class Program5 {
    public static void main(String[] args) {
        String sentence = "Hello Ig, Good Morning!";
        String result = getLastLetter(sentence);
        System.out.println(result);
    }

    public static String getLastLetter(String str) {
        String[] words = str.split("\\s+");
        StringBuilder lastLetters = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                char lastLetter = word.charAt(word.length() - 1);
                lastLetters.append(Character.toUpperCase(lastLetter));
            }
        }

        return lastLetters.toString();
    }
}
