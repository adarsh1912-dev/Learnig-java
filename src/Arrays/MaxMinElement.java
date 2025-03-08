package Arrays;

import java.util.Scanner;

public class MaxMinElement {
    public static void main(String[] args) {
        System.out.println("Program for finding maximum and minimum element in given array");
        int[] arr = ArrayUtility.inputArray();
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i <5 ; i++) {
            maxi = Math.max(maxi,arr[i]);
            mini = Math.min(mini,arr[i]);
        }

        System.out.println("Maximum Element : " + maxi);
        System.out.println("Minimum Element : "+ mini);


    }
}
