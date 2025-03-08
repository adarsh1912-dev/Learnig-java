package Arrays;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            arr[i] = input.nextInt();
        }
        long sum = 0;
        for (int i = 0; i <10 ; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum of all elements : " + sum);
        System.out.println("Average of all elements : " + ((double)sum/10));
    }
}
