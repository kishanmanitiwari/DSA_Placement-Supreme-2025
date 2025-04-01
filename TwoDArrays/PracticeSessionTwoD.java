package TwoDArrays;
import java.util.Arrays;

public class PracticeSessionTwoD {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };
        //rowSum(arr);
        //System.out.println(maxRowCol(arr));
        //printSpiral(arr);
       // wavePrint(arr);
       transpose(arr);
    }
        
            private static void rowSum(int[][] matrix) {
                int n = matrix.length;
                for(int row=0;row<n;row++){
                    int sum = 0;
                    for(int col=0;col<matrix[0].length;col++){
                        sum+=matrix[row][col];
                    }
                    System.out.println("The sum of row "+row+" is "+sum);
                }
            }

            private static int maxRowCol(int[][] matrix){
                //row wise
                //col wise
                int n = matrix.length;
                int maxi = -1;
                //row wise
                for(int row=0;row<n;row++){
                    int sum = 0;
                    for(int col=0;col<matrix[0].length;col++){
                        sum+=matrix[row][col];
                    }
                    maxi = Math.max(sum,maxi);
                }
                //col wise

                for(int row=0;row<n;row++){
                    int sum = 0;
                    for(int col=0;col<matrix[0].length;col++){
                        sum+=matrix[col][row];
                    }
                    maxi = Math.max(sum,maxi);
                }

                return maxi;
            }

            static void printSpiral(int[][] matrix){
                int row = matrix.length;
                int col = matrix[0].length;
                int top = 0;
                int left = 0;
                int right = col-1;
                int bottom = row-1;

                while (top<=bottom && left<=right) {
                    //right
                    for(int i=left;i<=right;i++){
                        System.out.println(matrix[top][i]);
                    }
                    top++;


                    //bottom
                    for(int i=top;i<=bottom;i++){
                        System.out.println(matrix[i][right]);
                    }
                    right--;

                    if(top<=bottom){
                          //left
                    for(int i=right;i>=left;i--){
                        System.out.println(matrix[bottom][i]);
                    }
                    }
                  
                    bottom--;

                    if(left<=right){
                          //top
                    for(int i=bottom;i>=top;i--){
                        System.out.println(matrix[i][left]);
                    }
                    }
                  
                    left++;
                }

            }
            
            static void wavePrint(int[][] matrix){
                int row =matrix.length;
                int col = matrix[0].length;

                for(int j=0;j<col;j++){
                    if(j%2==0){
                        //even - Niche jayenge
                        for(int i=0;i<row;i++){
                            System.out.println(matrix[i][j]);
                        }
                    }else{
                        //odd hai - upar jayenge
                        for(int i=row-1;i>=0;i--){
                            System.out.println(matrix[i][j]);
                        }

                    }
                }
            }

            static void transpose(int[][] matrix){
                int row = matrix.length;
                int col = matrix[0].length;
              //  if(row!=col) return; //transpose row=col

                int[][] transpose = new int[col][row];

                for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        transpose[i][j] = matrix[j][i];
                    }
                }
                
                for(var rows:transpose){
                    System.out.println(Arrays.toString(rows));
                }
            }
        }
