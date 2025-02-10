import java.util.Scanner;

public class Month {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int month = sc.nextInt();

        if (month == 2) {
            System.out.println("28 days"); // Default for February
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month >= 1 && month <= 12) {
            System.out.println("30 days");
        } else {
            System.out.println("Invalid month number");
        }
    }
}
