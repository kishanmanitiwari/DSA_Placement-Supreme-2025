package Bank;

public class ProtectedPackage {
    public static void main(String[] args) {
        BankService hdfc = new BankService();
        System.out.println(hdfc.publicBankName);
        System.out.println(hdfc.protectedIFSC);
        System.out.println(hdfc.defaultManager);
      
    }
    }
   
