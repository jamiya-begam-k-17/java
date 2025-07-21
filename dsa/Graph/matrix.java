package Graph;

import java.util.*;
public class matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        
        int[][] adjm=new int[v][v];
        
        for(int i=0;i<e;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            
            if(x==-1 && y==-1){
                break;
            }
            
            adjm[x-1][y-1]=1;
            adjm[y-1][x-1]=1;
        }
        
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(adjm[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}