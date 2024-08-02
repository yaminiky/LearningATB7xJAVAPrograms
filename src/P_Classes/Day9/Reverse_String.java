package P_Classes.Day9;

public class Reverse_String {
    public static void main(String[] args) {

        //Approach using length(), charAt() methods

        String st = "Welcome";
        String rev ="";

        for (int i=st.length()-1;i>=0;i--)
        {

            rev = rev+st.charAt(i);

        }
        System.out.println(rev);
    }
}
