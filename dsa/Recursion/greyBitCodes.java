package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class greyBitCodes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<String> binarycodes=solve(n);

        ArrayList<Integer> decimal=new ArrayList<>();

        System.out.println("The binary format\n"+binarycodes);
        
        for(String codes: binarycodes){
            decimal.add(Integer.parseInt(codes,2));
        }
        
        System.out.println("The decimal format in arrayList\n"+decimal);

        System.out.println("In decimal format as Integers");
        for(int num: decimal){
            System.out.print(num+" ");
        }
        sc.close();
    }

    public static ArrayList<String> solve(int n){
        ArrayList<String> res=new ArrayList<>();
        if(n==0){
            res.add("0");
            return res;
        }
        if(n==1){
            res.add("0");
            res.add("1");
            return res;
        }
        ArrayList<String> temp=solve(n-1);

        for(int i=0;i<temp.size()-1;i++){
            res.add("0"+temp.get(i));
        }
        for(int i=temp.size()-1;i>=0;i--){
            res.add("1"+temp.get(i));
        }
        return res;
    }
}
