package Backtracking;

import java.util.Scanner;

public class nqueens {

    static int count=0;

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[][] mat=new int[n][n];

        solve(mat,0,n);
        System.out.println(count);

        sc.close();
    }

    public static void solve(int[][] mat,int col,int n){
        if(col==n){
            count++;
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(mat,row,col,n)){
                mat[row][col]=1;
                solve(mat,col+1,n);
                mat[row][col]=0;
            }
        }
    }

    public static boolean isSafe(int[][] mat,int row,int col,int n){
        for(int j=0;j<col;j++){
            if(mat[row][j]==1){
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(mat[i][j]==1){
                return false;
            }
        }

        for(int i=row+1,j=col-1;i<n&&j>=0;i++,j--){
            if(mat[i][j]==1){
                return false;
            }
        }
        return true;
    }
}
