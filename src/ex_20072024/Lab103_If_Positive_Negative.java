package ex_20072024;

import java.util.Scanner;

public class Lab103_If_Positive_Negative {
    public static void main(String[] args) {
        //Program to Check
        //If a Number is Positive, Nagative , Zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();

        if(num>0)
        {
            System.out.println("Positive Number");

        } else if (num<0)
        {
            System.out.println("Negative Number");
        } else
        {
            System.out.println("ZERO");
        }
    }
}
