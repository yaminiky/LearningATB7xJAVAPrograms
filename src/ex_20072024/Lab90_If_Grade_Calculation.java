package ex_20072024;

import java.util.Scanner;

public class Lab90_If_Grade_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        char grade = 'F';
        if(score<0|| score>100)
        {
        if (score>=90 && score <=100)
        {
            grade ='O';
        } else if (score >=80 && score <90) {
            grade = 'A';
        } else if (score >=70 && score <80)
        {
            grade = 'B';
        } else if (score >=60 && score <70)
        {
            grade = 'C';
        } else if (score >=50 && score <60)
        {
            grade = 'D';
        }
        else {
            grade = 'F';

        }
        System.out.println("the student got   " + grade  );
    }
        System.out.println("out of range");
    }

}
