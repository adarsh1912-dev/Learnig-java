package BasicInputOutput;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        //taking two number as input and printing their sum;
        System.out.println("Program for printing the sum of two numbers\n");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Sum of two numbers are : " + (a+b));
    }
}