public class Exercise_1 {
    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(0);
        checkNumber(-1);
        checkNumber(8);
        checkNumber(200);
    }

    public static void checkNumber(int number) {
        System.out.println((number > 0) ? "positive" : (number < 0) ? "negative" : "zero");
    }
}