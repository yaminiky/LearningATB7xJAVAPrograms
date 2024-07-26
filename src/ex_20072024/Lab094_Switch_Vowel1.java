package ex_20072024;

import java.util.Scanner;

public class Lab094_Switch_Vowel1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char to find the vowel or not !");
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        switch(ch)
        {
            case 'a','e','i','o','u' :
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not  a Vowel , It is Consonents");
        }
    }
}
