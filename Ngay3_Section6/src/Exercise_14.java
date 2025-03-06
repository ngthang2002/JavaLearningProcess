import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            printNumberInWord(number);
        } while (true);
    }

    public static void printNumberInWord(int number) {
        System.out.println("You entered " + number + " and it is a " +
                switch (number) {
                    case 0 -> "ZERO";
                    case 1 -> "ONE";
                    case 2 -> "TWO";
                    case 3 -> "THREE";
                    case 4 -> "FOUR";
                    case 5 -> "FIVE";
                    case 6 -> "SIX";
                    case 7 -> "SEVEN";
                    case 8 -> "EIGHT";
                    case 9 -> "NINE";
                    default -> "OTHER";
                }
                + "\n"
        );
    }
}