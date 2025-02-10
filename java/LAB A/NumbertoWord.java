
import java.util.Scanner;

public class NumbertoWord {
    public enum Number {
        ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), ELEVEN(11),
        TWELVE(12), THIRTEEN(13), FOURTEEN(14), FIFTEEN(15), SIXTEEN(16), SEVENTEEN(17), EIGHTEEN(18), NINETEEN(19),
        TWENTY(20), THIRTY(30), FORTY(40), FIFTY(50), SIXTY(60), SEVENTY(70), EIGHTY(80), NINETY(90), ONEHUNDRED(100),
        ONETHOUSAND(1000);

        private int value;

        Number(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static String getWord(int n) {
            return Number.values()[n] + "";
        }
    }

    public static String convert(int n) {
        if (n < 0) {
            return "NEGATIVE" + convert(-n);
        }
        if (n == 0) {
            return Number.getWord(n);
        }
        if (n > 99999) {
            return "ERROR :Out of Range!";
        }
        String result = "";
        if (n >= 20000) {
            result += " " + Number.getWord(n / 10000) + " ";
            n = n % 10000;
        }
        if (n >= 1000) {
            result += " " + Number.getWord(n / 1000) + "THOUSAND";
            n = n % 1000;
        }
        if (n >= 100) {
            result += " " + Number.getWord(n / 100) + "HUNDRED";
            n = n % 100;
        }
        if (n >= 20) {
            result += " " + Number.getWord(18 + (n / 10)) + " ";
            n = n % 10;
        }
        if (n > 0) {
            result += " " + Number.getWord(n);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Enter a number");
            n = in.nextInt();
            System.out.println(convert(n));
        }

    }
}
