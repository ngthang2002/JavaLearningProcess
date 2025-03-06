import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println(number + " -> " + sumFirstAndLastDigit(number));

            sc.nextLine();
            sc.nextLine();
            System.out.println();
        } while (true);
    }

    public static String sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        int lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        return Integer.toString(number + lastDigit);
    }
}