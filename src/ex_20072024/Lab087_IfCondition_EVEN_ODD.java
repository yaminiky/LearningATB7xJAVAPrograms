package ex_20072024;

import java.util.Scanner;

public class Lab087_IfCondition_EVEN_ODD {
    public static void main(String[] args) {
        //Take a User input and find the given number is EVEN or ODD

        // Logic Building
        // 1. Figure out the inputs
                // Data type ---- int
        // How to take input in the Java ----- Scanner -- class
        // Which function we have use ----- nexInt()   ---> input
        // 2. Data Type
        // Do we need conversion or directly

        // Rough logic --  num%2==0 ---- even or odd

        // Optimize

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int user_input = sc.nextInt();
        System.out.println(user_input);
        if(user_input%2 == 0)
        {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }


    }
}
