package ex_20072024;

import java.util.Scanner;

public class Lab092_SwitchCase_Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 0 , Tell What day it is");

        int day = sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("the enter day is Sunday");
                break;
            case 2:
                System.out.println("the enter day is Monday");
                break;
            case 3:
                System.out.println("the enter day is Tuesday");
                break;
            case 4:
                System.out.println("the enter day is Wednesday");
                break;
            case 5:
                System.out.println("the enter day is thursday");
                break;
            case 6:
                System.out.println("the enter day is Friday");
                break;
            case 7:
                System.out.println("the enter day is Saturday");
                break;
            default:
                System.out.println("No Idea what DAY it is");

        }
        System.out.println("Out of the Switch Loop");
    }
}
