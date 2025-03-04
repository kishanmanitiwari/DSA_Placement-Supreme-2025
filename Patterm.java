import java.util.Scanner;

public class Patterm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inp = input.nextInt();
        printPattern(inp);
        input.close();
    }

    static void printPattern(int n){
        //Row - N
        int space = n-1;
        int star = 1;

        for(int i=1;i<=n;i++){ //Row wise
            //Spcae Print
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            space--;
            //Star Print
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            star+=2;

            //Next Row mein chala jayega
            System.out.println();


        }
    }
}
