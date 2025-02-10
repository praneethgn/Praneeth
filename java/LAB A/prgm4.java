import java.util.Scanner;

public class prgm4 {
    public static String toggleCharacters(String str) {
        StringBuilder toggledString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c));
            } else {
                toggledString.append(c);
            }
        }
        return toggledString.toString();
    }

    public static String swapEvenWords(String str) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                for (int i = 0; i < word.length(); i += 2) {
                    if (i + 1 < word.length()) {
                        result.append(word.charAt(i + 1));
                        result.append(word.charAt(i));
                    } else {
                        result.append(word.charAt(i));
                    }
                }
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input String");
        String inputString = s.nextLine();

        System.out.println("Original String: " + inputString);

        String toggledString = toggleCharacters(inputString);
        System.out.println("Toggled String: " + toggledString);

        String swappedString = swapEvenWords(inputString);
        System.out.println(" Swapped String: " + swappedString);
    }
}
