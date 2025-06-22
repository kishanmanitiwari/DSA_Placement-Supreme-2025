package Customer;

import Bank.HDFC;

public class Customer {
    public static void main(String[] args) {
        HDFC kishan = new HDFC();
        kishan.accountHolderName = "kishan";
        System.out.println(kishan.accountHolderName);
    }
}
