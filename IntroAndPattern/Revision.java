package IntroAndPattern;
public class Revision {
    public static void main(String[] args) {
        int[] array = {12,2,3};


         boolean found = false;
        for (var f : array) {
          if (f==2) {
            found = true;
          }
        }

        if (found) {
            System.out.println("mil gya");
        } else {
            System.out.println("nhi mila");
        }

    }
}
