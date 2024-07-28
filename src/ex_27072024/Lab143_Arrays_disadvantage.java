package ex_27072024;

public class Lab143_Arrays_disadvantage {
    public static void main(String[] args) {
        final float pi = 3.14f;

        //Disadvantage of Array

        //1.  Fixed Data Type (homo)
        //2.  Fixed Length.
        //3.  Wastage of memory

        int [] ages = new int[100];
        ages[1]=99;
        System.out.println(ages[1]);
        System.out.println(pi);

    }
}
