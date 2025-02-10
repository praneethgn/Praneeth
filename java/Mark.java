import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Details:");

        System.out.println("Enter the Student Name:");
        String name = sc.nextLine();
        System.out.println("Enter the Student Roll No. :");
        int rno = sc.nextInt();
        System.out.println("Enter the Marks in Physics:");
        int m1 = sc.nextInt();
        System.out.println("Enter the Student Chemistry:");
        int m2 = sc.nextInt();
        System.out.println("Enter the Student Computer Aplication :");
        int m3 = sc.nextInt();
        Calculate(name, rno, m1, m2, m3);
    }

    static void Calculate(String name, int rno, int m1, int m2, int m3) {

        String n = name;
        int r = rno;

        int t = m1 + m2 + m3;
        double p = t / 3;

        Display(n, r, m1, m2, m3, t, p);

    }

    static void Display(String n, int r, int m1, int m2, int m3, int t, double p) {

        System.out.println("Roll No : " + r);
        System.out.println("Name of Student :" + n);
        System.out.println("Marks in Physics  :" + m1);
        System.out.println("Marks in Chemistry  :" + m3);
        System.out.println("Marks in Computer Application  :" + m3);
        System.out.println("Total Marks  :" + t);
        System.out.println("Percentage:" + p + "%");
        if (p >= 90) {
            System.out.println("Division = Dict:");
        } else if (p >= 80) {
            System.out.println("Division = First:");
        } else if (p >= 60) {
            System.out.println("Division = Secend:");
        } else if (p >= 35) {
            System.out.println("Division = Third:");
        } else if (p == 35) {
            System.out.println("Division = Just pass:");
        } else {
            System.out.println("Division = Fial:");
        }
    }
}
