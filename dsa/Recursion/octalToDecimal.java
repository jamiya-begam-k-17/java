package Recursion;

import java.util.Scanner;

public class octalToDecimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(find(n));
        sc.close();
    }
    public static int find(int n){
        if(n==0) 
        return 0;
        return n%8 + (10*find(n/8));
    }
}