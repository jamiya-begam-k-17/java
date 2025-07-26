package Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class permutations {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number to generate all permutations of numbers from 1 to n: ");
        int n=sc.nextInt();

        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        boolean[] used=new boolean[n+1];

        backtrack(n,new ArrayList<>(),res,used);

        System.out.println("The permutations of allnumbers from 1 to "+n+" is ");
        System.out.println(res);
        sc.close();
    }

    public static void backtrack(int n, ArrayList<Integer> path,ArrayList<ArrayList<Integer>> res,boolean used[]){
        if(path.size()==n){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i=1;i<=n;i++){
            if(!used[i]){
                path.add(i);
                used[i]=true;
                backtrack(n,path,res,used);
                used[i]=false;
                path.remove(path.size()-1);
            }
        }
    }
}
