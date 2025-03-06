import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println("Is " + number + " a palindrome? \t" + isPalindrome(number));

            sc.nextLine();
            sc.nextLine();
            System.out.println();
        } while (true);
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return originalNumber == reverse;
    }
}