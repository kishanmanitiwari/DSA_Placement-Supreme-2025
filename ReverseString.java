import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();

        reverseInputString(name);
        input.close();
            }
        
    static void reverseInputString(String name) {
        int n = name.length();
        String ans = "";
        //Loop
        for(int i=(n-1);i>=0;i--){
            ans+=name.charAt(i);
        }

        System.out.println(ans);
    }
}
