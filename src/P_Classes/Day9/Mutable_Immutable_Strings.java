package P_Classes.Day9;

public class Mutable_Immutable_Strings {
    public static void main(String[] args) {

        //immutable
        String s = new String("Welcome");
        System.out.println(s);   //Welcome
        s.concat("to java");
        System.out.println(s);   //Welcome

        //Here in this program both are Welcome. s.contact function will not change the value of the s.
        // if we want to change the value we have to store in another variable

        String s_concat = s.concat("  to JAVA");
        System.out.println(s_concat);
    }
}
