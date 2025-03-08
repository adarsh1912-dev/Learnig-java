package Arrays;

import java.util.Scanner;

 class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of elements : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.print("Enter element " + (i+1) + " :");
            arr[i] = input.nextInt();
        }
        return arr;
    }
}
