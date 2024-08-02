package P_Classes.Day9;

public class Reverse_String1 {
    public static void main(String[] args) {
        //with out using string methods

        String st = "Welcome";
        String rev= "";
        char ch[] = st.toCharArray();

        for ( int i=ch.length-1;i>=0; i--)
        {
            rev = rev+ch[i];
        }
        System.out.println(rev);

    }
}
