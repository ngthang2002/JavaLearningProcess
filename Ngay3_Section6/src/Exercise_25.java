import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter big flour bag: ");
            int bigCount = sc.nextInt();
            System.out.print("Enter small flour bag: ");
            int smallCount = sc.nextInt();
            System.out.print("Enter goal: ");
            int goal = sc.nextInt();
            canPack(bigCount, smallCount, goal);

            sc.nextLine();
            sc.nextLine();
            System.out.println();
        } while (true);
    }

    public static void canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            System.out.println("Invalid Value");
        }

        int totalKilos = bigCount * 5 + smallCount;
        if (totalKilos >= goal) {
            int bigKilosUsed = 0;
            int smallKilosUsed = 0;

            while (bigCount > 0 && goal >= 5) {
                goal -= 5;
                bigCount -= 1;
                bigKilosUsed++;
            }

            while (smallCount > 0 && goal > 0) {
                goal--;
                smallCount--;
                smallKilosUsed++;
            }

            if (goal == 0) {
                System.out.println("Can pack " + bigKilosUsed + " big bags and " + smallKilosUsed + " small bags");
            } else {
                System.out.println("Can't pack");
            }
        }
    }
}