import java.util.Scanner;

public class Salary {

    public static int count(int[] arr, int size) {
        if (size < 0) {
            System.out.println("Invalid Input");
            return -1;
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                System.out.println("Invalid Input");
                return -1;
            }
        }

        int repeaterCount = 0;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    repeaterCount++;
                    break; // Once a repeated salary is found, no need to check again
                }
            }
        }

        return repeaterCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 1 || n > 20) {
            System.out.println("Invalid Input");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = count(arr, n);

        if (result != -1) {
            System.out.println(result);
        }
    }
}
