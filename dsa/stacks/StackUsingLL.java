package stacks;

import java.util.Scanner;

public class StackUsingLL {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node top = null;                     // For example [10 | next → null]

    public void push(int x) {
        Node newnNode = new Node(x);   // [20 | next → null]
        newnNode.next = top;          // [20 | next → [10 | next → null]]
        top = newnNode;              // top → [20 | next → [10 | next → null]]
        System.out.println(x + " pushed into the stack.");
    }

    public int pop() {
        if(top == null) {
            System.out.println("Stack underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    public int peek() {
        if(top == null) {
            System.out.println("Stack underflow");
            return -1;
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        StackUsingLL st = new StackUsingLL();
        
        boolean flag = true;
        while(flag){
            System.out.println("Enter 1 to push 2 to pop 3 to peek 4 to see empty and 5 to stop.");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                int y = sc.nextInt();
                st.push(y);
                break;
                case 2:
                System.out.println(st.pop());
                break;
                case 3:
                System.out.println(st.peek());
                break;
                case 4:
                System.out.println(st.isEmpty());
                break;
                case 5:
                flag = false;
                break;
                default:
                System.out.println("Enter a valid number");
                break;
            }
        }
    }
}
