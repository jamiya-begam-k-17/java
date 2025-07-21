package Trees;

// You are using Java
import java.util.*;
class node{
    int data;
    node left,right;
    node(int data){
        this.data=data;
        right=left=null;
    }
}
public class binarySearchTree{
    node root=null;
    node insert(node root,int data){
        node newnode=new node(data);
        if(root==null){
            return newnode;
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }else{
            root.right=insert(root.right,data);
        }
        return root;
    }
    
    void inorder(node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    
    node delete(node root,int delkey){
        if(root==null) return null;
        
        if(delkey<root.data){
            root.left=delete(root.left,delkey);
        } else if(delkey>root.data){
            root.right=delete(root.right,delkey);
        } else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            root.data=minvalue(root.right);
            root.right=delete(root.right,root.data);
        }
        return root;
    }
    private int minvalue(node nnode){
        while(nnode.left!=null){
            nnode=nnode.left;
        }
        return nnode.data;
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        binarySearchTree b=new binarySearchTree();
        node root=null;
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            root=b.insert(root,data);
        }
        System.out.print("Before deletion: ");
        b.inorder(root);
        System.out.print("\nAfter deletion: ");
        int delkey=sc.nextInt();
        root=b.delete(root,delkey);
        b.inorder(root);

        sc.close();
    }
}