import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter two numbers: ");
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            System.out.println(number1 + " and " + number2 + " have shared digits?\t" + hasSharedDigit(number1, number2));

            sc.nextLine();
            sc.nextLine();
            System.out.println();
        } while (true);
    }

    public static String hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return "Invalid input";
        }

        int firstDigitNum1 = number1 / 10;
        int secondDigitNum1 = number1 % 10;
        int firstDigitNum2 = number2 / 10;
        int secondDigitNum2 = number2 % 10;

        return (firstDigitNum1 == firstDigitNum2 ||
                firstDigitNum1 == secondDigitNum2 ||
                secondDigitNum1 == firstDigitNum2 ||
                secondDigitNum1 == secondDigitNum2) ? "Yes" : "No";
    }
}