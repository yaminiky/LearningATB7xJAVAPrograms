package ex_20072024;

import java.util.Scanner;

public class Lab094_Switch_Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char to find the vowel or not !");
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        switch (ch)
        {
            case 'a' :
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i' :
                System.out.println("Vowel");
                break;
            case 'o' :
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("the given input is consonent");
        }

    }
}
