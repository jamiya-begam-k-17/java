package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class combinations {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to generate all combinations of numbers from 1 to n: ");
        int n=sc.nextInt();

        List<List<Integer>> res=new ArrayList<>();
        
        backtrack(n,0,new ArrayList<>(),res,1);

        System.out.println("The combinations for the number "+n+" is ");
        System.out.println(res);

        sc.close();
    }

    public static void backtrack(int n,int cursum,ArrayList<Integer> path,List<List<Integer>> res,int start){
        if(n==cursum){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i=start;i<=n-cursum;i++){
            path.add(i);
            backtrack(n,cursum+i,path,res,i);
            path.remove(path.size()-1);
        }
    }
}
