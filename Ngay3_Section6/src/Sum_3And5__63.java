import java.util.Scanner;

import static java.lang.Math.random;

public class Sum_3And5__63 {
    public static void main(String[] args) {
        sum3And5();
    }

    public static void sum3And5(){
        int count = 0;
        int sum = 0;
        int loop = 0;
        System.out.print("[");
        while (count < 5){
            loop++;
            int number = (int)(Math.random() * 1000) + 1;
            if(number % 3 == 0 && number % 5 == 0){
                count++;
                sum += number;
                System.out.print(" " + number + (count==5 ? "": ","));
            }
        }

        System.out.println("] = " + sum + "\t with " + loop + " loops");
    }
}