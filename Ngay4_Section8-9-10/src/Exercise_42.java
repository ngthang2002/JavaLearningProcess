import java.util.Scanner;

public class Exercise_42 {
    public static void main(String[] args) {
        int number = readInteger();
        int[] elements = readElements(number);
        System.out.println("The minimum value is: " + findMin(elements));
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
            System.out.println(i);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        } while (++i < number);
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}