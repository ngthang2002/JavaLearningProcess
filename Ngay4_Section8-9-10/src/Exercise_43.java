import java.util.Arrays;
import java.util.Scanner;

public class Exercise_43 {
    public static void main(String[] args) {
        int number = readInteger();
        int[] elements = readElements(number);
        System.out.println("The reversed array is: " + Arrays.toString(reverse(elements)));

    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            return scanner.nextInt();
        }
    }

    public static int[] readElements(int number) {
        int[] array = new int[number];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + number + " integers:");
        int i = 0;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        } while (++i < number);
        return array;
    }

    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
}