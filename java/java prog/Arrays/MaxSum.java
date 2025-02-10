import java.util.Scanner;

public class MaxSum {
    public static int maximumSum(int numbers[], int size) {
        if (size < 0) {
            System.out.println("Invalid array size");
            return -1;
        }

        int evenSum = 0, oddSum = 0;

        for (int num : numbers) {
            if (num < 0) {
                System.out.println("Invalid input");
                return -1;
            }
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        return Math.max(evenSum, oddSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid array size");
            return;
        }

        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] < 0) {
                System.out.println("Invalid input");
                return;
            }
        }

        sc.close();

        int maxSum = maximumSum(numbers, n);
        if (maxSum >= 0) {
            System.out.println("Maximum sum: " + maxSum);

        }
    }
}
