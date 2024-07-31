package ex_27072024;

public class Lab151_Strings {
    public static void main(String[] args) {
        // String  - Bunch of Chars.
        //
        String s1= new String ("Tirupati"); //Heap Area
        String s2 = "Tirupati"; //String constant pool

        //boolean  s =s1.compareTo(s2.toLowerCase());
        // String - Immutable in nature.
        System.out.println(s1.length());
        System.out.println(s1.indexOf("p"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.compareTo(s2));
    }
}
