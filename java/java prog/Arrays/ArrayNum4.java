public class ArrayNum4 {
    public static void main(String[] args) {
        int num = 15;
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }

    }

}
