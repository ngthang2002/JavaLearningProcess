import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SortArray {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] array = new Integer[random.nextInt(100)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
//        Arrays.sort(array);
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}