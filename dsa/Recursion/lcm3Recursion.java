package Recursion;

import java.util.*;
class lcm3Recursion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(findlcmABC(a,b,c));
        sc.close();
    }
    public static int findgcd(int a,int b){
        if(b==0) return a;
        return findgcd(b,a%b);
    }
    public static int findlcmAB(int a,int b){
        return (a*b)/findgcd(a,b);
    }
    public static int findlcmABC(int a,int b,int c){
        int lcmAB=findlcmAB(a,b);
        return (lcmAB*c)/findgcd(lcmAB,c);
    }
}