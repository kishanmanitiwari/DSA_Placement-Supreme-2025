package Backtracking;

//Puzzle
// 1 1
// 1 1
public class puzzle {
     private static void findPaths(int row,int col,String path,int[][] maze, boolean[][] visited) {
        int n = maze.length;

        //Edge case
        if (row>=n || col >=n || row<0 || col <0 || visited[row][col] == true || maze[row][col]==0) {
            return; //backtrack
        }

        //Goal
        if (row==n-1 && col == n-1) {
            System.out.println("Path: " + path);
            return;
        }

        //Choose
        visited[row][col] = true; //infinite loop
        //Explore
        // up - right - down - left
        findPaths(row-1, col, path+"U", maze, visited); //up
        findPaths(row, col+1, path + "R", maze, visited); //right
        findPaths(row+1, col, path + "D", maze, visited); //down
        findPaths(row, col-1, path + "L", maze, visited); //left
        //Backtrack

        visited[row][col] = false;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1,1},
            {1,1}
        };
        int n = arr.length;
        boolean[][] visited = new boolean[n][n];
        findPaths(0,0,"",arr,visited);
     }
        
           
    
}