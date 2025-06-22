public class Fibonacci {
    static int fibonacci(int n){
        //recursoion
        //1) base
        //2) recursive case
        //3)Kuch Kaam

        //1) Multiple base cases
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            ///MAde multiple recursive call
            int nMinusOne = fibonacci(n-1);
            int nMinusTwo = fibonacci(n-2);
            int fn = nMinusOne + nMinusTwo; //Addd - Step 3 - Some work

            return fn; //Step 3 - Some work
    }
}
    

static int climb(int n) {
  if (n == 0) return 1;  // One valid way
  if (n < 0) return 0;    // No way if negative
  return climb(n - 1) + climb(n - 2);
}

static void printAsc(int n) {
  if (n == 0) return;
  printAsc(n - 1);
 System.out.println(n);
}

static void printDesc(int n) {
  if (n == 0) return;
 System.out.println(n);
  printDesc(n - 1);
}


    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        // 0 1 1 2 3 5 8 13 21 34 55 89 144    

        System.out.println(climb(3)); 

        printAsc(5);

        printDesc(5);
    }
}
