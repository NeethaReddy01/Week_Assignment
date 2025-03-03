package day6Tasks;
public class Program1 {
    public static void main(String[] args) {
        String input = "hello, good morning!!";
        String result = getCapitalized(input);
        System.out.println(result);
    }
    public static String getCapitalized(String str) {
        String[] words = str.split("\\s+");
        StringBuilder capitalizedString = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalizedString.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        
        return capitalizedString.toString().trim();
    }
}

