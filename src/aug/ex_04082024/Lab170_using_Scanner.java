package aug.ex_04082024;

import java.util.Scanner;

public class Lab170_using_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Bank Name");
        String bName = sc.next();
        System.out.println("Enter the Balance");
        int balance = sc.nextInt();
        System.out.println("Enter the Bank Code");
        String bCode = sc.next();
        BankAccount baicici= new BankAccount(bName,balance,bCode);
        baicici.printdetails();
        sc.close();
    }

}
