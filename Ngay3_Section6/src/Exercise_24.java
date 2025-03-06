import java.util.Scanner;

import static java.lang.Integer.reverse;

public class Exercise_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter numbers: ");
            int number = sc.nextInt();
            numbersToWords(number);

            sc.nextLine();
            sc.nextLine();
            System.out.println();
        } while (true);
    }

    public static String numberToWord(char number) {
        return switch (number) {
            case '0' -> "Zero";
            case '1' -> "One";
            case '2' -> "Two";
            case '3' -> "Three";
            case '4' -> "Four";
            case '5' -> "Five";
            case '6' -> "Six";
            case '7' -> "Seven";
            case '8' -> "Eight";
            case '9' -> "Nine";
            default -> "Invalid Value";
        };
    }

    public static void numbersToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        String word = Integer.toString(number);
        for (int i = 0; i < word.length(); i++) {
            System.out.print(numberToWord(word.charAt(i)) + " ");
        }
    }
}