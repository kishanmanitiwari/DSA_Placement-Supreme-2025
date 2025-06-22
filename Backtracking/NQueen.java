package Backtracking;

import java.util.ArrayList;

public class NQueen {
    public static void main(String[] args) {
        int n =4;
    ArrayList<Integer> positions = new ArrayList<>();
    solve(0,n,positions);
        }
    
    private static void solve(int row, int n, ArrayList<Integer> positions) {
           //base case
           // row = 4 , current row = 4
           // board ke bahar ya row<0 
           if(row==n){
            System.out.println("Solution: " + positions);
            return;
           }
           
           for (int col = 0; col < n; col++) {
            //queen place
            //queen place - safe
            //safe hai - go to next row
            //safe nahi hai - backtarack

            //choose
            int choiceColumn = col;
            
            if(isSafe(row,choiceColumn,positions)==true){
                            //queen safe - place
                            positions.add(choiceColumn);
                            //agle row
                            //explore
                            solve(row+1, n, positions);
                              
                            //backtrack
                        positions.remove(positions.size()-1);
                        }
                      
            
            
            
                       }
                    
                    }
                   
    private static boolean isSafe(int row, int col, ArrayList<Integer> positions) {
       
        for (int prevRow = 0; prevRow < row; prevRow++) {
            int prevCol = positions.get(prevRow);
            

            // ❌ Same column
            if (prevCol == col) return false;

            // ❌ Same diagonal
            if (Math.abs(prevRow - row) == Math.abs(prevCol - col)) return false;
        }
        return true;
    }
                    

}

    
