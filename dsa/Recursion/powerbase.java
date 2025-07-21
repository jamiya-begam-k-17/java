package Recursion;

import java.util.*;
public class powerbase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        int b=sc.nextInt();
        //using normal loop
        long c=1;
        for(int i=0;i<b;i++){
            c*=a;
        }
        System.out.println("Power found using normal loop "+c);
        long res=findpow(a,b);
        System.out.println("Power found using recursion "+res);
        sc.close();
    }
    public static long findpow(long a,int b){
        if(b==0) return 1;
        return a*findpow(a,--b);
    }
}