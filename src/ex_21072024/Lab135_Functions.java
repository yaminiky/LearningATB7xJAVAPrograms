package ex_21072024;

public class Lab135_Functions {
    public static void main(String[] args) {
        // Functions
        // Block of code which we can reuse.
        //1. Pre-buit --Math.max()
        //2. User created / defined

        // Two component of the fncions
        //1. Define
        //2. Call the function
        for (int i = 0; i < 5; i++) {


            //Calling the function
            greet();
        }
        greet2();
    }
    //Definition part
   static void greet()
    {
        System.out.println("Hi, How are you");
    }
    static void greet2()
    {
        System.out.println("Greet2");
    }

}
