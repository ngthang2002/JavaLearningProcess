import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a month: ");
            int month = sc.nextInt();
            System.out.print("Enter a year: ");
            int year = sc.nextInt();

            if (month < 1 || month > 12 || year < 1 || year > 9999)
                System.out.println("Invalid input");
            else
                System.out.println("Number of days in month " + month + " of year " + year + " is " + getDaysInMonth(month, year));

            sc.nextLine();
            sc.nextLine();
        } while (true);
    }

    public static boolean isLeepYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                return isLeepYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }
}