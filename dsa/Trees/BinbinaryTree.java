package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class node{
    int data;
    node left,right;

    node(int data){
        this.data=data;
        left=right=null;
    }
}

public class BinbinaryTree {
    node root=null;
    public node insert(node root, int data){
        node newnode=new node(data);
        Queue<node>q=new LinkedList<>();
        if(root==null){
            root=newnode;
            return root;
        }
        else{
            q.add(root);
            while(!q.isEmpty()){
                node temp=q.poll();
                if(temp.left==null){
                    temp.left=newnode;
                    break;
                } else{
                    q.offer(temp.left);
                }
                if(temp.right==null){
                    temp.right=newnode;
                    break;
                } else{
                    q.offer(temp.left);
                }
            }
            return root;
        }
        
    }
    public void inorder(node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public void postorder(node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public void preorder(node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();

        BinbinaryTree b=new BinbinaryTree();
        node root=null;

        for(int i=0;i<size;i++){
            int num=sc.nextInt();
            root=b.insert(root,num);
        }

        System.out.print("Preorder traversal: ");
        b.preorder(root);
        System.out.println();
        System.out.print("Postorder traversal: ");
        b.postorder(root);
        System.out.println();
        System.out.print("Inorder traversal: ");
        b.inorder(root);
        sc.close();
    }
}