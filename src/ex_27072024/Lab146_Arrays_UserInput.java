package ex_27072024;

import java.util.Scanner;

public class Lab146_Arrays_UserInput {
    public static void main(String[] args) {
        // Where we take the user input of the 5 subjects - AVG of the subjects.
        // Figure inputs -- float  using Scanner Class

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the marks of the Sub 1");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the marks of the Sub 2");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the marks of the Sub 3");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the marks of the Sub 4");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the marks of the Sub 5");
        marks[4] = sc.nextFloat();

        float avg =(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Avg is  --> "+avg);
    }
}
