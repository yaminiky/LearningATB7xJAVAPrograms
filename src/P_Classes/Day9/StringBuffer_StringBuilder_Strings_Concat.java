package P_Classes.Day9;

public class StringBuffer_StringBuilder_Strings_Concat {
    public static void main(String[] args) {
        //String  - immutable
        String s ="Welcome";
        s.concat("to java");
        System.out.println(s);

        //StringBuffer - Mutable
        StringBuffer s1 = new StringBuffer("Welcome");
        s1.append("  to JAVA");
        System.out.println(s1);

        //StringBuilder   - Mutable

        StringBuilder s2 = new StringBuilder("Welcome");
        s2.append(" to JAVA");
        System.out.println(s2);
    }
}