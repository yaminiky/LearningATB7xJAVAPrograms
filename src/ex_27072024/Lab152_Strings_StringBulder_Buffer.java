package ex_27072024;

public class Lab152_Strings_StringBulder_Buffer {
    public static void main(String[] args) {
        // Strings - imutable in nature
        // StringBuilder, StringBuffer
        String s1 ="TIRUPATI";
        s1 = "TIRUMALA";

        StringBuffer stringBuffer = new StringBuffer("Bobby");

        //Change the value of string - Buffer

        stringBuffer.append("Bunty");  //BobbyBunty

        StringBuilder stringBuilder = new StringBuilder("Prabhandh");
        stringBuilder.append("Venkat");

        //Thread Safty

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

    }
}
