package Arrays;

import java.util.Scanner;

public class DeletingElement {

    private static int[] D_element(int[] arr, int target){

        int targetMatchingNo = 0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == target){
                targetMatchingNo++;
            }
        }
        int[] temp = new int[arr.length-targetMatchingNo];
        int index = 0;
        int i = 0;
        while(i<arr.length){
            if(arr[i] == target){
                i++;
                continue;
            }
            temp[index] = arr[i];
            index++;
            i++;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println("Program for deleting a particular element from array");
        int[] arr = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter target : ");
        int target = input.nextInt();

        int[] newArray = D_element(arr,target);
        System.out.print("Array after deletion : ");
        for (int i = 0; i <newArray.length ; i++) {
            System.out.print(newArray[i] + " ");
        }




    }
}
