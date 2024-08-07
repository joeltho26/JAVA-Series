public class NumberOfDaysInAMonthChallenge {
    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println("---------------");
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear (int year) {
        if (year>0 || year <10000) {
            if (((year%4==0) && (year%100==0) && (year%400==0))
                    || ((year%4==0) && (year%100!=0))) {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth (int month, int year) {
        if ((month<1 || month>12) || (year<1 || month>12)) {
            return -1;
        } else {
            return switch (month) {
                case 1,3,5,7,8,10,12 -> 31;
                case 4,6,9,11 -> 30;
                case 2 -> {
                    yield isLeapYear(year) ? 29:28;
                }
                default -> {
                    yield 0;
                }
            };
        }
    }
}
