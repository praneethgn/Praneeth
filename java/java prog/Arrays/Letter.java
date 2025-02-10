import java.util.Scanner;

public class Letter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch >= 97 && ch <= 122) {
                System.out.print(ch + " ");
            }
        }
    }
}