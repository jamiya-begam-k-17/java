package Backtracking;

// import java.util.Scanner;

// public class sudoku {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int[][] mat=new int[9][9];

//         for(int i=0;i<9;i++){
//             for(int j=0;j<9;j++){
//                 mat[i][j]=sc.nextInt();
//             }
//         }

//         //sample input
//         // 3 0 6 5 0 8 4 0 0
//         // 5 2 0 0 0 0 0 0 0
//         // 0 8 7 0 0 0 0 3 1
//         // 0 0 3 0 1 0 0 8 0
//         // 9 0 0 8 6 3 0 0 5
//         // 0 5 0 0 9 0 6 0 0
//         // 1 3 0 0 0 0 2 5 0
//         // 0 0 0 0 0 0 0 7 4
//         // 0 0 5 2 0 6 3 0 0

//         //sample output
//         // 3 1 6 5 7 8 4 9 2
//         // 5 2 9 1 3 4 7 6 8
//         // 4 8 7 6 2 9 5 3 1
//         // 2 6 3 4 1 5 9 8 7
//         // 9 7 4 8 6 3 1 2 5
//         // 8 5 1 7 9 2 6 4 3
//         // 1 3 8 9 4 7 2 5 6
//         // 6 9 2 3 5 1 8 7 4
//         // 7 4 5 2 8 6 3 1 9
//         if(solve(mat,0,0)){
//             for(int i=0;i<9;i++){
//                 for(int j=0;j<9;j++){
//                     System.out.print(mat[i][j]+" ");
//                 }
//                 System.out.println();
//             }
//         } else{
//             System.out.println("No Solution exists");
//         }
//         sc.close();
//     }
//     public static boolean solve(int[][] mat,int x,int y){
//         if(y==9){
//             x++;
//             y=0;
//         }

//         if(x==9){
//             return true;
//         }

//         if(mat[x][y]!=0){
//             return solve(mat,x,y+1);
//         }

//         for(int i=1;i<=9;i++){
//             if(safe(i,mat,x,y)){
//                 mat[x][y]=i;
//                 if(solve(mat,x,y+1)){
//                     return true;
//                 }
//                 mat[x][y]=0;
//             }
//         }
//         return false;
//     }
//     public static boolean safe(int num,int[][]mat,int x,int y){
//         for(int i=0;i<9;i++){
//             if(mat[x][i]==num){
//                 return false;
//             }
//         }

//         for(int i=0;i<9;i++){
//             if(mat[i][y]==num){
//                 return false;
//             }
//         }

//         int row=x-x%3;
//         int col=y-y%3;
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 if(mat[row+i][col+j]==num){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }
// // here is sudoku problem with '.' instead of 0
// // You are using Java
// import java.util.*;
// public class sudoku{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         char mat[][]=new char[9][9];
//         for(int i=0;i<9;i++){
//             for(int j=0;j<9;j++){
//                 mat[i][j]=sc.next().charAt(0);
//             }
//         }
//         if(solve(mat,0,0)){
//             printmat(mat);
//         } else{
//             System.out.println("No solution exists");
//         }
//     }
//     public static void printmat(char [][] mat){
//         for(int i=0;i<9;i++){
//             for(int j=0;j<9;j++){
//                 System.out.print(mat[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static boolean solve(char mat[][],int x,int y){
//         if(y==9){
//             x++;
//             y=0;
//         }
//         if(x==9){
//             return true;
//         }
//         if(mat[x][y]!='.'){
//             return solve(mat,x,y+1);
//         }
//         for(int i=1;i<=9;i++){
//             if(safe(mat,i,x,y)){
//                 mat[x][y]=(char)(i+'0');
//                 if(solve(mat,x,y+1)){
//                     return true;
//                 }
//                 mat[x][y]='.';//back
//             }
//         }
//         return false;
//     }
//     public static boolean safe(char[][] mat,int num,int x,int y){
        
//         char c=(char)(num+'0');
//         for(int i=0;i<9;i++){
//             if(mat[x][i]==c){
//                 return false;
//             }
//         }
//         for(int i=0;i<9;i++){
//             if(mat[i][y]==c){
//                 return false;
//             }
//         }
        
//         int row=x-x%3;
//         int col=y-y%3;
        
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 if(mat[row+i][col+j]==c){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }