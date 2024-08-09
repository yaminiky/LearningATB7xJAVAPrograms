package aug.ex_04082024;

public class ATBPerson {

    String name;
    long phone;

    // Default constructor


    ATBPerson() {
        System.out.println("Object is created");
    }
    ATBPerson(String nameGiven)
    {
        this.name=nameGiven;
    }
}
