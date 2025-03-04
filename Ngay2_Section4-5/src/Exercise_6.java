public class Exercise_6 {
    public static void main(String[] args) {
        double[][] testData = {
                {3.123, 3.124},    // false
                {2.000, 2.000},    // true
                {-3.123, -3.124},  // false
                {4.567, 4.567},    // true
                {5.678, 5.679},    // false
                {-1.234, -1.234},  // true
                {7.000, 7.001},    // false
                {8.120, 8.120},    // true
                {9.999, 9.998},    // false
                {10.234, 10.234},  // true
                {-2.499, -2.498},  // false
                {3.000, 3.000},    // true
                {4.123, 4.1241},    // false
                {5.876, 5.876},    // true
                {2, 6.001},    // false
                {7.432, 7.4322},    // true
                {8.123, 8.124},    // false
                {9.8763, 9.876},    // true
                {11.1112, 11.112},  // false
                {12.345, 12.345}   // true
        };

        for (double[] data : testData) {
           System.out.printf("%-30s%b%n", "{" + data[0] + ", " + data[1] + "}:", areEqualByThreeDecimalPlaces(data[0], data[1]));
        }
    }


    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        return (int) (num1 * 1000) == (int) (num2 * 1000);
    }
}