package ex_20072024;

import java.util.Scanner;

public class Lab093_SwitchCase_Browser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name to execute the code!!,");
        String broserName = sc.next();
        broserName = broserName.toLowerCase();
        switch (broserName)
        {
            case "chrome" :
                System.out.println("Starting the chrome browser");
                break;
            case "firefox" :
                System.out.println("Starting the firefox browser");
                break;
            case "edge" :
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("The given browser is not valid");
                break;
        }
    }
}
