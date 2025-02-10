
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[][] a = new int[20][20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value on row and column 9 values:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
