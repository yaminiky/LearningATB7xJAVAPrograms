package aug.ex_04082024;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;  // Instance variable

    // Default Constructor

    BankAccount()
    {
        bankName = "SBI";
        balance = 299;
        bankCode = "SBI00032";
    }

    // Parameteraized Constructor

    BankAccount( String bName, int bal, String bCode)
    {
       this.bankName=bName;
       this.balance=bal;
       this.bankCode= bCode;
    }
    //with 2 arguments

    BankAccount(String bName, int bal)
    {
        this.bankName = bName;
        this.balance =bal;
    }

    // with One Arguments
    BankAccount(String bName)
    {
        this.bankName = bName;

    }
    void printdetails()
    {
        System.out.println("Bank Name  -> "+bankName);
        System.out.println("Bank Code  ->  "+bankCode);
        System.out.println("Balance  ->  "+balance);

    }
}
