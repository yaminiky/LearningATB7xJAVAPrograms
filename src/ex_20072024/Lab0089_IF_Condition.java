package ex_20072024;

import java.util.Scanner;

public class Lab0089_IF_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age >18)
        {
            System.out.println("eligible for vote");

        }else {
            System.out.println("Unger age Not eligible for vote");
        }
    }
}
