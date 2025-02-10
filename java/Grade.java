import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Test Data :- ");
        System.out.println("Input the grade: ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'E':
                System.out.println("Excellent");

                break;
            case 'F':
                System.out.println("Fail");

                break;
            case 'V':
                System.out.println("Very Good");

                break;
            case 'G':
                System.out.println("Good");

                break;
            case 'A':
                System.out.println("Average");

                break;
            default:
                System.out.println("Invalid");
                break;

        }
    }
}
