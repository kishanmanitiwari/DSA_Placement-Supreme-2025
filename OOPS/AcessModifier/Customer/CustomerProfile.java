package Customer;

import Bank.BankService;

public class CustomerProfile {
    public void displayCustomerView(){
        BankService bank = new BankService();
        System.out.println(bank.publicBankName);
       
    }
}
