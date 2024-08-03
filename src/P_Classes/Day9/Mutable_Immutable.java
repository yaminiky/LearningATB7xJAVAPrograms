package P_Classes.Day9;

import java.util.Arrays;

public class Mutable_Immutable {
    public static void main(String[] args) {

        //mutable = can change the values
        int a[]= {20,10,60,59,28,54};

        System.out.println(Arrays.toString(a));

        Arrays.sort(a);  //Mutable

        System.out.println(Arrays.toString(a));
    }
}
