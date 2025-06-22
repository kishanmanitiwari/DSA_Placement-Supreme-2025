package Bank;

public class Bank {
    public String accountHolderName;  // Public: available anywhere
    protected String accountType;     // Protected: available to subclasses + Pakage
    double interestRate;              // Default: available only in same package
    @SuppressWarnings("unused")
    private double balance;           // Private: only inside BankAccount class
}

class InnerBank {

    public static void main(String[] args) {
        Bank hdfc = new Bank();
        hdfc.accountHolderName = "Rohan";
        System.out.println(hdfc.accountHolderName);
    }
}
