
public class year {

    public static void leapYear(int year) {

        boolean leapYear = false;

        if (year % 4 == 0) {
            leapYear = true;

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    leapYear = true;
                else
                    leapYear = false;
            }
        } else
            leapYear = false;

        if (!leapYear)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }

    public static void main(String[] args) {
        leapYear(2200);

        leapYear(2002);
    }
}