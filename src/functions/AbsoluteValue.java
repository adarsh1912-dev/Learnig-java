package functions;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program for calculating the absolute value of a given number");
        System.out.print("Enter number : ");
        int a = input.nextInt();
        if(a<0){
            a*=-1;
            System.out.println("Absolute value : " + a);
        }
        else {
            System.out.println("Absolute value : " + a);
        }
    }

}
