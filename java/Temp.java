
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        int tmp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the temperature in centigrade : ");
        tmp = sc.nextInt();
        if (tmp < 0)
            System.out.println("Freezing weather.\n");
        else if (tmp < 10)
            System.out.println("Very cold weather.\n");
        else if (tmp < 20)
            System.out.println("Cold weather.\n");
        else if (tmp < 30)
            System.out.println("Normal in temp.\n");
        else if (tmp < 40)
            System.out.println("Its Hot.\n");
        else
            System.out.println("Its very hot.\n");
    }
}
