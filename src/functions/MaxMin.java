package functions;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program for finding minimum of two numbers");
        System.out.print("Enter fist number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();

        if(a<b){
            System.out.println(a + " is minimum");
        } else if (a == b) {
            System.out.println(a + " is equal to " + b);
        }
        else{
            System.out.println(b + " is minimum");
        }


    }
}
