import java.util.*;

public class Exercise_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter three numbers: ");
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            int number3 = sc.nextInt();
            // Tra ket qua Yes, No
            System.out.println(hasSameLastDigit(number1, number2, number3));

            // Tra ket qua Yes, No va in ra cac so co chu so cuoi giong nhau
            System.out.println(hasSameLastDigit2(number1, number2, number3));

            sc.nextLine();
            sc.nextLine();
            System.out.println();
        } while (true);
    }

    public static boolean isValid(int number) {
        return number < 10 || number > 1000;
    }

    public static String hasSameLastDigit(int number1, int number2, int number3) {
        if (isValid(number1) || isValid(number2) || isValid(number3)) {
            return "Invalid input";
        }

        int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
        int lastDigit3 = number3 % 10;

        return (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3 ? "Yes" : "No");
    }

    public static String hasSameLastDigit2(int number1, int number2, int number3) {
        if (isValid(number1) || isValid(number2) || isValid(number3)) {
            return "Invalid input";
        }

        List<Number> numbers = new ArrayList<>();
        numbers.add(new Number(number1, number1 % 10, false));
        numbers.add(new Number(number2, number2 % 10, false));
        numbers.add(new Number(number3, number3 % 10, false));

        boolean isSameLast = false;

        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i).lastDigit == numbers.get(j).lastDigit) {
                    numbers.get(i).isSameLast = true;
                    numbers.get(j).isSameLast = true;
                    isSameLast = true;
                }
            }
        }

        if (isSameLast) {
            StringBuilder result = new StringBuilder("Yes: ");
            for (Number number : numbers) {
                if (number.isSameLast) {
                    result.append(number.number).append(" ");
                }
            }
            return result.toString();
        } else {
            return "No";
        }
    }

}

class Number {
    int number;
    int lastDigit;
    boolean isSameLast;

    public Number(int number, int lastDigit, boolean isSameLast) {
        this.number = number;
        this.lastDigit = lastDigit;
        this.isSameLast = isSameLast;
    }
}