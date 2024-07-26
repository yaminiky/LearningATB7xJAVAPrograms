package ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name= sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your Salary");
        double sal = sc.nextDouble();

        System.out.println("Your details are "+ name);
        System.out.println(("your age is "  + age));
        System.out.println("Your Salary is "+ sal);

        sc.close();
    }
}
