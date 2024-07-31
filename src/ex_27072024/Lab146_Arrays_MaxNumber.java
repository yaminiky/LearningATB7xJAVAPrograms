package ex_27072024;

import java.util.Arrays;

public class Lab146_Arrays_MaxNumber {
    public static void main(String[] args) {

        //Find the Max in the Arrays
        //Find the Max Salary in the Array

        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        int max=1;
        int min=salaries[0];
        for(int i =0; i<salaries.length; i++)
        {
            if (salaries[i]>max)
            {
                max =salaries[i];
            }
            if(min>salaries[i])
            {
                min=salaries[i];
            }
        }
        System.out.println("The Maximum Salary is "+max);
        System.out.println("The Minimum Salary is "+min);

        //Using function
        //Sort and Find the last one

        Arrays.sort(salaries);
        System.out.println(salaries[salaries.length-1]);
    }
}
