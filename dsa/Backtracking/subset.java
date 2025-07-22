package Backtracking;

import java.util.*;

public class subset {
    static int count=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int target=sc.nextInt();

        sc.close();

        solve(0,arr,target,n);
        System.out.println(count);
    }

    public static void solve(int i,int[]arr,int target,int n){
        if(target==0){
            count++;
            return;
        }
        if(target<0 || i>=n){
            return;
        }
        solve(i+1,arr,target-arr[i],n);
        solve(i+1,arr,target,n);
    }
}
