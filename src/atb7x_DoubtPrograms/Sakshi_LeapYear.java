package atb7x_DoubtPrograms;

import java.util.Scanner;

public class Sakshi_LeapYear {
    public static void main(String[] args) {
        System.out.println("--------Enter year---------");

        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

//float y =1990;

        do {

            System.out.println("*****Is not a leap yaer******" + y);

        }

        while (y % 4 == 0 && y % 400 == 0 && y % 100 == 0);

        {

            System.out.println("*****leap yaer******");
        }
    }
}