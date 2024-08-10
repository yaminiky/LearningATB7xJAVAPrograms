package aug.ex_04082024;

public class Lab170_Constructor7 {
    public static void main(String[] args) {
        BankAccount ba1= new BankAccount();
        System.out.println(ba1.bankName);
        System.out.println(ba1.balance);
        System.out.println(ba1.bankCode);

        //Constructor with 3 Arguments
        BankAccount baicici = new BankAccount("ICICI", 100, "ICICI0023");
        System.out.println(baicici.bankName);
        System.out.println(baicici.balance);
        System.out.println(baicici.bankCode);

        System.out.println("*******   2 parameter constructor  ********");
        BankAccount Union = new BankAccount("Union Bank", 10000);
        System.out.println(Union.bankName);
        System.out.println(Union.balance);

        System.out.println("*******   1 parameter constructor  ********");
        BankAccount Iob = new BankAccount("IOB Bank");
        System.out.println(Union.bankName);


    }
}
