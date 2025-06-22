import Bank.BankService;
import Customer.CustomerProfile;


public class Main {
    public static void main(String[] args) {
        BankService bank = new BankService();
        bank.displayInternalDetails();

        CustomerProfile rahul = new CustomerProfile();
        rahul.displayCustomerView();

       
    }
}
