import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            int result = getLargestPrime(number);
            if (result == -1) {
                System.out.println("Invalid Value");
            } else {
                System.out.println("Largest prime factor of " + number + " is " + result);
            }

            sc.nextLine();
            sc.nextLine();
            System.out.println();
        } while (true);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                if (isPrime(i)) {
                    largestPrime = i;
                }
            }
        }

        return largestPrime;
    }
}