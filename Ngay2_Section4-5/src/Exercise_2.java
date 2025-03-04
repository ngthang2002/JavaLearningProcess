public class Exercise_2 {
    public static void main(String[] args) {
        printConversion(10.25);
    }

    public static int toMilesPerHour(double kilometersPerHour) {
        return (kilometersPerHour < 0) ? -1 : (int) Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        int milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println((milesPerHour < 0) ? "Invalid" : kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}