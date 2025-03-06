import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println(number + " -> " + getEvenDigitSum(number));

            sc.nextLine();
            sc.nextLine();
            System.out.println();
        } while (true);
    }

    public static String getEvenDigitSum(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        int sum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number /= 10;
        }
        return Integer.toString(sum);
    }
}