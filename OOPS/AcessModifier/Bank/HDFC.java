package Bank;



public class HDFC {
    public String accountHolderName;  // Public: available anywhere
    protected String accountType;     // Protected: available to subclasses + Pakage
    double interestRate;              // Default: available only in same package
    @SuppressWarnings("unused")
    private double balance;           // Private: only inside BankAccount class
    
}