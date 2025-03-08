package functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program for finding Even or Odd number");
        System.out.print("Enter number : ");
        int a = input.nextInt();
        if(a%2 == 0){
            System.out.println("Given number is Even");
        }
        else{
            System.out.println("Given number is Odd");
        }
    }
}
