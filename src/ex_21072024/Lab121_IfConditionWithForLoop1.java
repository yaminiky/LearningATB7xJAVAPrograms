package ex_21072024;

public class Lab121_IfConditionWithForLoop1 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++)
        {
            System.out.println(i);
            if(i%2==0 || i%3==0 || i%4==0)
            {
                continue;
            }
            System.out.println("After !!");
        }
    }
}
