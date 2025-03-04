public class Exercise_3 {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(1059);
        printMegaBytesAndKiloBytes(2048);
        printMegaBytesAndKiloBytes(900);
        printMegaBytesAndKiloBytes(102498214);
        printMegaBytesAndKiloBytes(1);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(-1287);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        System.out.println((kiloBytes < 0) ? "Invalid Value" :
                kiloBytes + " KB = " + kiloBytes / 1024 + " MB" +
                        ((kiloBytes % 1024 == 0) ? "" :
                                " and " + kiloBytes % 1024 + " KB"));
    }
}
