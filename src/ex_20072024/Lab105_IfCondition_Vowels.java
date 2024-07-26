package ex_20072024;

import java.util.Scanner;

public class Lab105_IfCondition_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.next().charAt(0);
        char cha ='a';
        if (ch == 'a' || ch == 'e' || ch =='i' || ch =='o' ||ch =='u')
        {
            System.out.println("Vowel");
        }else
        {
            System.out.println("Consonent");
        }
    }
}
