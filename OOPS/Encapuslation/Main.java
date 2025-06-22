import Secrets.Secret;

public class Main {
    public static void main(String[] args) {
        Secret secret = new Secret("12345");
        
        //I cannot directly access my private member

        //I can access my private member using getter method
        System.out.println("Secret Key: " + secret.getSecretKey());

        //I can change my private member using setter method
        secret.setSecretKey("678134"); //new secret key

        System.out.println("Secret Key: " + secret.getSecretKey()); //Updated


    }
}
