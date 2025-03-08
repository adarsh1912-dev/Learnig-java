package Arrays;

import java.util.Scanner;

public class noOfOccurrences {
    public static void main(String[] args) {
        System.out.println("Program for finding number of Occurrences");
        int[] arr = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter element whose occurrence you want to find : ");
        int n = input.nextInt();
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == n){
                count++;
            }
        }
        System.out.println(n + " occurred " + count + " times" );
    }
}
