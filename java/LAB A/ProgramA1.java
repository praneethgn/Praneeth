import java.io.*;
import java.lang.*;
import java.util.Scanner;

enum Digit {
    ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8),
    NINE(9);

    public int p;

    Digit(int i) {
        p = i;
    }
}

enum Two {
    N(0), TEN(10), ELEVEN(11), TWELVE(12), THIRTEEN(13), FOURTEEN(14), FIFTEEN(15),
    SIXTEEN(16), SEVENTEEN(17),
    EIGHTEEN(18), NINTEEN(19);

    public int p;

    Two(int i) {
        p = i;
    }
}

enum Ten {
    N(0), NL(0), TWENTY(20), THIRTY(30), FORTY(40), FIFTY(50), SIXTY(60), SEVENTY(70),
    EIGHTY(80), NINTY(90);

    public int p;

    Ten(int i) {
        p = i;
    }
}

class ProgramA1 {
    public static void main(String args[]) throws IOException {
        int num;
        Scanner in = new Scanner(System.in);
        while (true) {
            String str = "";
            System.out.println("Enter the Number:");
            num = in.nextInt();
            if (num < 0 || num > 99999)
                System.out.println("Enter Valid Number");
            else if (num == 0)
                System.out.println(num + " ZERO");
            else {
                if (num / 10000 != 0 && num / 10000 == 1) {
                    for (Two d : Two.values()) {
                        if (d.ordinal() == (num / 10000 + ((num / 1000) % 10)))
                            str = str + d + " THOUSAND ";
                    }
                    num = num % 1000;
                }
                if (num / 10000 != 0 && num / 10000 != 1) {
                    for (Ten d : Ten.values()) {
                        if (d.ordinal() == (num / 10000))
                            str = str + d + " ";
                    }
                    if (((num / 1000) % 10) != 0) {
                        for (Digit d : Digit.values()) {
                            if (d.ordinal() == (num / 1000) % 10)
                                str = str + d;
                        }
                    }
                    str = str + " THOUSAND ";
                    num = num % 1000;
                }
                if (num / 1000 != 0) {
                    for (Digit d : Digit.values()) {
                        if (d.ordinal() == num / 1000)
                            str = str + d + " THOUSAND ";
                    }
                    num = num % 1000;
                }
                if (num / 100 != 0) {
                    for (Digit d : Digit.values()) {
                        if (d.ordinal() == num / 100)
                            str = str + d + " HUNDRED ";
                    }
                    num = num % 100;
                }
                if (num / 10 != 0 && num / 10 == 1) {
                    for (Two d : Two.values()) {
                        if (d.ordinal() == (num / 10 + num % 10))
                            str = str + d;
                    }
                    num = 0;
                }
                if (num / 10 != 0 && num / 10 != 1) {
                    for (Ten d : Ten.values()) {
                        if (d.ordinal() == (num / 10))
                            str = str + d + " ";
                    }
                    num = num % 10;
                }
                if (num != 0) {
                    for (Digit d : Digit.values()) {
                        if (d.p == (num))
                            str = str + d;
                    }
                }
                System.out.println(" " + str);
            }
        }
    }
}