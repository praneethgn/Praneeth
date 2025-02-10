import java.util.*;
import java.util.Scanner;

public class prgm2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = s.nextInt();
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers.add(s.nextInt());
        }

        if (numbers.size() < 2) {
            System.out.println("Minimum and maximum cannot be found. Insufficient elements.");
            return;
        }
        Collections.sort(numbers);
        int secondMin = numbers.get(0);
        int secondMax = numbers.get(numbers.size() - 1);
        System.out.println("Second minimum: " + secondMin);
        System.out.println("Second maximum: " + secondMax);
    }
}
