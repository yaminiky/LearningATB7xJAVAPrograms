package ex_27072024;

public class Lab139_Array_intro1 {
    public static void main(String[] args) {
        // Arrays --> new keyword

        int[] marks = new int[3];   //length =1 to 3  Index = 0 to 2

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        marks[0] =91;
        marks[1] =80;
        marks[2] =70;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        boolean[] is_married ={true, false, true};

        for(int i=0; i<marks.length; i++)
        {
            System.out.println(i+"  -> "+marks[i]);
        }
        String weekDays[] = {"Sunday","Monday","Tuesday","Wednessday","Thursday","Friday","Saturday"};
        for(int i =0; i<weekDays.length; i++)
        {
            System.out.println(weekDays[i]);
        }
    }
}
