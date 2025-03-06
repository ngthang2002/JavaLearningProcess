import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("%-30s","Sum range of numbers: ");
            int start = sc.nextInt();
            System.out.printf("%-30s"," -> ");
            int end = sc.nextInt();

            System.out.printf("%-30s"," is ");
            sumOdd(start, end);

            sc.nextLine(); // Consume the remaining newline
            sc.nextLine(); // Wait for Enter
            System.out.println();
        } while (true);
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void sumOdd(int start, int end) {
        if (start < 1 || end < 1 || start > end) {
            System.out.println("Invalid input");
            return;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}