import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter numbers: ");
            int number1 = sc.nextInt();
            isPerfectNumber(number1);

            sc.nextLine();
            sc.nextLine();
            System.out.println();
        } while (true);
    }

    public static void isPerfectNumber(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if(sum == number) {
                System.out.println(number + " is a perfect number");
            } else {
                System.out.println(number + " is not a perfect number");
            }
        }
    }
}