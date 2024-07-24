package ex_20072024;

import java.util.Scanner;

public class Lab090_IF_Grade_Calculation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Marks Obtained by the student:");

        int score = sc.nextInt();



        if (score >= 0 && score <= 100) {



            if (score >= 90 && score <= 100) {

                System.out.println("Grade: O");



            } else if (score >= 80 && score < 90) {

                System.out.println("Grade: A");



            } else if (score >= 70 && score < 80) {

                System.out.println("Grade: B");



            } else if (score >= 60 && score < 70) {

                System.out.println("Grade: C");

            } else if (score >= 50 && score < 60) {

                System.out.println("Grade: D");



            } else if (score >= 0 && score < 50) {

                System.out.println("Grade: F");



            }

        } else {

            System.out.println("Score entered is out of range");

        }
    }
}
