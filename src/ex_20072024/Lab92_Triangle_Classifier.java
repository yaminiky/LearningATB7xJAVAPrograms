package ex_20072024;

import java.util.Scanner;

public class Lab92_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of L1");
        int L1 = sc.nextInt();
        System.out.println("Enter the value of L2");
        int L2 = sc.nextInt();
        System.out.println("Enter the value of L3");
        int L3 = sc.nextInt();

        if((L1==L3) && (L2==L3))
        {
            System.out.println("All Sides in the Triangle are equal     EQUILATERAL   ");
        }else if((L1==L2 || L2==L3 || L1==L3))
        {
            System.out.println("Two Sides are equal in a triangle     ISOSCELES     ");
        } else
        {
            System.out.println("All sides are not equal in a triangle      SCALENE    ");
        }

    }
}
