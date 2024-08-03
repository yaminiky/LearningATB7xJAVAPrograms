package P_Classes.Day9;

public class SringComparison {
    public static void main(String[] args) {

        //Case 1
        System.out.println("******* Case 1  ******");
        String s1 = "Welcome";
        String s2 = "welcome";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        //Case 2
        System.out.println("******* Case 2  ******");
        String str1 = new String("Computer");
        String str2 = new String("Computer");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2);         //False    //Use to compare the Object
        System.out.println(str1.equals(str2));  //True  // Use to compare the values of the Objects
        //Both are  not same


        //Case 3
        System.out.println("******* Case 3  ******");
        String ss1 = "abc";
        String ss2 = new String("abc");
        System.out.println(ss1 == ss2);         //False
        System.out.println(ss1.equals(ss2));  //True

        //Case  4
        System.out.println("******* Case 4  ******");
        String st1 = "abc";
        String st2 = new String(("abc"));
        String st3=st2;

        System.out.println(st1==st2);
        System.out.println(st1.equals(st2));

        System.out.println(st2==st3);
        System.out.println(st2.equals(st3));

        System.out.println(st1==st3);
        System.out.println(st1.equals(st3));
    }
}