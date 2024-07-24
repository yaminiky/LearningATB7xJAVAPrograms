package ex_20072024;

import java.util.Scanner;

public class Lab088_IF_Max_Number {
    public static void main(String[] args) {
        //Max number in two inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter the Number 2");
        int num2 = sc.nextInt();
       // System.out.println("the max number is "+Math.max(num1,num2));
        if(num1>num2)
        {
            System.out.println("the max number"+num1);
        }else if (num2>num1){
            System.out.println("the max number is"+num2);
        } else
        {
            System.out.println("Both are equal");
        }
    }
}
