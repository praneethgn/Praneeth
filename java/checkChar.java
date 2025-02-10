import java.util.Scanner;

public class checkChar {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the temperature in centigrade : ");
        ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("This is an alphabet.\n");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("This is a digit.\n");
        } else {
            System.out.println("This is a special character.\n");
        }
    }
}
