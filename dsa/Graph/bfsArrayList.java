package Graph;

import java.util.*;
public class bfsArrayList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--> 0){
            int n=sc.nextInt();
            ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
            for(int i=0;i<n;i++){
                adj.add(new ArrayList<>());
            }
            
            int e=sc.nextInt();
            for(int i=0;i<e;i++){
                int x=sc.nextInt();
                int y=sc.nextInt();
                adj.get(x).add(y);
            }
            
            for(int i=0;i<n;i++){
                Collections.sort(adj.get(i));
            }
            
            bfs(0,adj,n);
            System.out.println();
        }
        sc.close();
    }
    public static void bfs(int start,ArrayList<ArrayList<Integer>> adj,int n){
        boolean[]visited=new boolean[n];
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty()){
            int key=q.poll();
            System.out.print(key+" ");
            for(int neg:adj.get(key)){
                if(!visited[neg]){
                    visited[neg]=true;
                    q.add(neg);
                }
            }
            
        }
    }
}