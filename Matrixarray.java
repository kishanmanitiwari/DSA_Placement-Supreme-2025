import java.util.Scanner;

class Matrixarray{

    static int findMaxInMatrix(int[][] matrix){
        int maxi = -1;

        for (int rows = 0; rows < matrix.length; rows++) { //rows
            for(int cols=0;cols<matrix[rows].length;cols++){ //cols
                System.out.println("The row is "+rows +" The col is "+cols);
                int val = matrix[rows][cols];
                if (val>maxi) { //compare
                    maxi = val;
                }
            }
        }
        
        return maxi; //return
    }

    public static void main(String[] args) {
        //2d array - decalre and initialise
        int[][] twoDArr = new int[3][3];
        twoDArr[0][0] = 1;
        twoDArr[0][1] = 2;
        twoDArr[0][2] = 2;
        twoDArr[1][0] = 2;
        twoDArr[1][1] = 2;
        twoDArr[1][2] = 2;
        twoDArr[2][0] = 2;
        twoDArr[2][1] = 2;
        twoDArr[2][2] = 2;

        int[][] newMatrix = {
            {1,2,3},
            {4,5,6,10,11},
            {7,8,9}
        };

        // // System.out.println(newMatrix[0][1]); //acess
        // // newMatrix[1][1] = 10;
        // Scanner input = new Scanner(System.in);
        // int[][] newInputMatrix = new int[3][3];

        // for(int row=0;row<3;row++){
        //     for(int col=0;col<3;col++){
        //         newInputMatrix[row][col] = input.nextInt();
        //     }
        // }

        // for (int[] row : newInputMatrix) {
        //     for (int val : row) {
        //         System.out.print(val +" ");
        //     }
        //     System.out.println();
        // }

        // input.close();

        System.out.println("The maximum element is " + findMaxInMatrix(newMatrix));

    }
}