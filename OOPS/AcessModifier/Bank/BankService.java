package Bank;

public class BankService {
   //public
   //protected
   //default
   //private

   

    public String publicBankName = "HDFC";

    protected String protectedIFSC = "HDFC1000";

    private int internalFunds = 10000000;

    String defaultManager = "Mr. Sharma"; // default access - subclass

   public void displayInternalDetails() {
    System.out.println("Bank: " + publicBankName);
    System.out.println("IFSC: " + protectedIFSC);
    System.out.println("Manager: " + defaultManager);
    System.out.println("Internal Funds: " + internalFunds);

   


   }

   // public static void main(String[] args) {
   //  BankService hdfc = new BankService();
   //  System.out.println(hdfc.publicBankName);
   //  System.out.println(hdfc.protectedIFSC);
   // }

  
}
