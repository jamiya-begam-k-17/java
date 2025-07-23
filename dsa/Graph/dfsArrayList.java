package Graph;

import java.util.*;

public class dfsArrayList {
// You are using Java
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
        
        for(int tc=0;tc<t;tc++){
            
            int n=sc.nextInt();
            int e=sc.nextInt();

            ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
            for(int i=0;i<n;i++){
                adj.add(new ArrayList<>());
            }
            
            for(int i=0;i<e;i++){
                int x=sc.nextInt();
                int y=sc.nextInt();
                adj.get(x).add(y);
                adj.get(y).add(x);
            }
            boolean[] visited=new boolean[n];
            dfs(0,adj,visited);
            System.out.println();
        }
        sc.close();
    }
    public static void dfs(int start,ArrayList<ArrayList<Integer>> adj,boolean[] visited){
        visited[start]=true;
        System.out.print(start+" ");
        
        for(int neighbour: adj.get(start)){
            if(!visited[neighbour]){
                dfs(neighbour,adj,visited);
            }
        }
    }
}