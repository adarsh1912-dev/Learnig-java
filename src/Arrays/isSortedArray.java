package Arrays;

public class isSortedArray {

    private static boolean isSorted(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println("program for checking whether the array is sorted or not");
        int[] arr = ArrayUtility.inputArray();
        if(isSorted(arr)){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

    }
}
