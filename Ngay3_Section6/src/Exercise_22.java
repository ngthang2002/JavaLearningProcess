import java.util.Scanner;

public class Exercise_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter two numbers: ");
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            getGreatestCommonDivisor(number1, number2);

            sc.nextLine();
            sc.nextLine();
            System.out.println();
        } while (true);
    }

    public static void getGreatestCommonDivisor(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            System.out.println("Invalid input");
        }

        int gcd = 1;
        int min = Math.min(number1, number2);
        for (int i = 1; i <= min; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of ("+ number1 + ", " +number2+"): \t" + gcd);
    }
}