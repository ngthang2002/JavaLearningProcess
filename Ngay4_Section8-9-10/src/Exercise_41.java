import java.util.Scanner;

public class Exercise_41 {
    public static void main(String[] args) {
//        printArray(sortArray(getIntegers(10)));
        int[] myIntegers = getIntegers(10);
        sortArray(myIntegers);
        printArray(myIntegers);
    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + number + " integers:");
        for (int i = 0; i < number; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void sortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {  // Changed from > to < for descending order
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " content " + array[i]);
        }
    }
}