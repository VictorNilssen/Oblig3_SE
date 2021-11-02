public class leapyear {

    public static boolean isLeapYear(int year) {

        boolean a;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    a = true;
                else
                    a = false;
            }
            else a = true;
        }
        else a = false;

    return a;
}
}
