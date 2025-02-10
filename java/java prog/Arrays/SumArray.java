
public class SumArray {
    public static void main(String[] args) {
        int size = 5;
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 5, 4, 3, 2, 1 };
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        System.out.println("Sum of Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
    }
}