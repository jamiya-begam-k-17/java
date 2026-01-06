package Trees;

import java.util.*;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BST{
    Node root=null;
    public Node insert(Node root,int data){
        Node newnode=new Node(data);
        if(root==null){
            return newnode;
        }
        if(data<root.data){
            root.left=insert(root.left, data);
        }
        root.right=insert(root.right,data);
        return root;
    }
    public int LCA(Node root,int n1,int n2){
        if(root==null){
            return -1;
        }
        if(n1<root.data && n2<root.data){
            return LCA(root.left,n1,n2);
        }
        else if(n1>root.data && n2>root.data){
            return LCA(root.right,n1,n2);
        }
        return root.data;
    }
}
public class LeastCommonAncestors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total no of nodes");
        int n=sc.nextInt();
        Node root=null;
        BST b=new BST();
        System.out.println("Enter the nodes");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            root=b.insert(root,data);
        }
        System.out.println("Enter the two nodes to get the least common ancestors");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(b.LCA(root,n1,n2));
        sc.close();
    }
}
