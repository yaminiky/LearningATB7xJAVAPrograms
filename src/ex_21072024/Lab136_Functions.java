package ex_21072024;

public class Lab136_Functions {
    public static void main(String[] args) {
        /*

        Functions
        Block of code which we can reuse.
        Functions are two types
            1. Pre-Build Functions  -- Math.max()
            2. User Defined / Created

            Two Components of the functions
                1. Define
                2. Call the function

           Defining Functions

           1.  Without Parameter and Without Return Type
           2.  WithOut Parameter and With Return Type
           3.  With Parameter and Without Return Type
           4.  With Parameter and With Return Type
                 */
        System.out.println("-------------------------------");

        //1.  Without Parameter and Without Return Type
            function_type1();

        System.out.println("-------------------------------");

        //2.  WithOut Parameter and With Return Type
            String name = function_type2();
            System.out.println(name);
        System.out.println("-------------------------------");

        //3.  With Parameter and Without Return Type
        function_type3("Suresh");
        System.out.println("-------------------------------");

        //4.  With Parameter and With Return Type
       int result= function_type4(10,20);
        System.out.println("The Output is "+result);

    }




    //1.  Without Parameter and Without Return Type
    static void function_type1()
    {
        System.out.println("Without Parameter and Without Return Type");
    }

    //2.  WithOut Parameter and With Return Type
    static String function_type2()
    {
        System.out.println("Without Parameter and With Return Type");
            return "Welcome";
    }

    //3.  With Parameter and Without Return Type

    static void function_type3(String name)
    {
        System.out.println("You have shared  ---> "+name);
    }

    //4.  With Parameter and With Return Type

    static int function_type4(int a, int b)
    {
        return a+b;
    }
}
