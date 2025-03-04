public class Exercise_5 {
    public static void main(String[] args) {
        int[] years = {2000, 2001, 2004, 1900, 2020, 2024, 2028, 2032, 2033, 1834, 2044, 2048, 2052, 2051, 2049, 2064, 3048, 2072, 2076, 2080};

        for (int year : years) {
            System.out.println(year + " is a leap year: " + isLeapYear(year));
        }
    }

    public static boolean isLeapYear(int year) {

//        if (year < 1 || year > 9999) {
//            System.out.println("Invalid Value");
//        } else {
//            System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
//        }

        return (year < 1 || year > 9999) ? false :
                ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}