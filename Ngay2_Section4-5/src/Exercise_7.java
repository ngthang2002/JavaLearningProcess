public class Exercise_7 {
    public static void main(String[] args) {
        int[][] testData = {
            {3, 1, 2},
            {2, 2, 4},
            {-3, -1, -4},
            {4, 2, 6},
            {5, 1, 8},
            {-1, -1, -2},
            {7, 3, 10},
            {8, 2, 12},
            {9, 5, 14},
            {10, 7, 15},
            {-2, -1, -3},
            {3, 1, 4},
            {4, 2, 6},
            {5, 1, 7},
            {2, 2, 3},
            {7, 3, 10},
            {8, 9, 12},
            {9, 4, 13},
            {11, 5, 16},
            {12, 3, 18}
        };

        for (int[] data : testData) {
            System.out.printf("%-30s%b%n", "{" + data[0] + ", " + data[1] + ", " + data[2] + "}:", hasEqualSum(data[0], data[1], data[2]));
        }
    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        return num1 + num2 == num3;
    }
}