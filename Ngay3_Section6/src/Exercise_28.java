import java.util.Scanner;

public class Exercise_28 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long average = 0;
        System.out.println("Enter numbers:");
        while (true) {
            try {
                int number = sc.nextInt();
                sum += number;
                count++;
            } catch (Exception e) {
                break;
            }
            sc.nextLine();
        }
        average = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}