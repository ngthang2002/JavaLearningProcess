public class Exercise_4 {
    public static void main(String[] args) {
        test(true, 1, true, "Dog barking at 1AM");
        test(true, 7, true, "Dog barking at 7AM");
        test(true, 23, true, "Dog barking at 11PM");

        test(true, 8, false, "Dog barking at 8AM");
        test(true, 15, false, "Dog barking at 3PM");
        test(true, 22, false, "Dog barking at 10PM");

        test(false, 3, false, "Dog not barking at 3AM");
        test(false, 13, false, "Dog not barking at 1PM");

        test(true, -1, false, "Dog barking at invalid hour (-1)");
        test(true, 24, false, "Dog barking at invalid hour (24)");
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return barking && hourOfDay >= 0 && hourOfDay < 24 && (hourOfDay < 8 || hourOfDay > 22);
    }

    private static void test(boolean barking, int hourOfDay, boolean expected, String description) {
        boolean result = shouldWakeUp(barking, hourOfDay);
        System.out.println(description + ": " +
                           (result == expected ? "PASS" : "FAIL") +
                           " (Got: " + result + ", Expected: " + expected + ")");
    }
}