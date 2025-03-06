import java.util.Scanner;

public class Exercise_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width, height, areaPerBucket;
        int extraBuckets;

       do {
           System.out.println("\n=== Paint Bucket Calculator ===");
           System.out.println("1. Calculate with extra buckets");
           System.out.println("2. Calculate without extra buckets");
           System.out.println("3. Calculate with area only");
           System.out.println("0. Exit");
           System.out.print("Choose an option: ");

           int choice = sc.nextInt();

           if (choice == 0) break;

           switch (choice) {
               case 1:
                   System.out.print("Enter width: ");
                   width = sc.nextDouble();
                   System.out.print("Enter height: ");
                   height = sc.nextDouble();
                   System.out.print("Enter area per bucket: ");
                   areaPerBucket = sc.nextDouble();
                   System.out.print("Enter extra buckets: ");
                   extraBuckets = sc.nextInt();
                   System.out.println("Buckets needed: " + getBucketCount(width, height, areaPerBucket, extraBuckets));
                   break;

               case 2:
                   System.out.print("Enter width: ");
                   width = sc.nextDouble();
                   System.out.print("Enter height: ");
                   height = sc.nextDouble();
                   System.out.print("Enter area per bucket: ");
                   areaPerBucket = sc.nextDouble();
                   System.out.println("Buckets needed: " + getBucketCount(width, height, areaPerBucket));
                   break;

               case 3:
                   System.out.print("Enter area: ");
                   double area = sc.nextDouble();
                   System.out.print("Enter area per bucket: ");
                   areaPerBucket = sc.nextDouble();
                   System.out.println("Buckets needed: " + getBucketCount(area, areaPerBucket));
                   break;

               default:
                   System.out.println("Invalid option!");
           }

           sc.nextLine();
           System.out.println("\nPress Enter to continue...");
           sc.nextLine();
       } while (true);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double bucketsNeeded = Math.ceil(area / areaPerBucket);
        return (int) (bucketsNeeded - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double bucketsNeeded = Math.ceil(area / areaPerBucket);
        return (int) bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double bucketsNeeded = Math.ceil(area / areaPerBucket);
        return (int) bucketsNeeded;
    }
}