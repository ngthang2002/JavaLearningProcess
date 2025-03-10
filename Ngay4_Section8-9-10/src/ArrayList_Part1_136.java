import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Part1_136 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        menuArrayList(animals);
    }

    public static void menuArrayList(ArrayList<String> animals) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            if (choice != 0) {
                scanner.nextLine();
            }
            System.out.println("\n");
            System.out.println("--------Menu----------");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Print the list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the element to add: ");
                    String newAnimal = scanner.nextLine();
                    if (!animals.contains(newAnimal)) {
                        animals.add(newAnimal);
                    } else {
                        System.out.println("Animal already exists.");
                    }
                }

                case 2 -> {
                    System.out.print("Enter the element to remove: ");
                    String animalToRemove = scanner.nextLine();
                    if (animals.contains(animalToRemove)) {
                        animals.remove(animalToRemove);
                    } else {
                        System.out.println("Animal not found.");
                    }
                }

                case 3 -> {
                    System.out.println("Animals in the list:");
                    for (String animal : animals) {
                        System.out.println(animal);
                    }
                }

                case 4 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}