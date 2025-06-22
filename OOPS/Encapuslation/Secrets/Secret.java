package Secrets;

public class Secret {
   //We have secret
   private String secretKey;

   //Constructor
    public Secret(String secretKey) {
        this.secretKey = secretKey;
    }
    
    //getter and setters
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        //Change secret only is the length is greater tha 5 digit
        if(secretKey.length() > 5){
            this.secretKey = secretKey;
            System.out.println("Secret key changed successfully");
        }
        else
            System.out.println("Secret key must be greater than 5 digits");
        
    }
   
}