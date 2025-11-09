package stacks;

import java.util.Scanner;

class Stack{
    int[] arr;
    int top;
    int capacity;
    public Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x){
        if(top >= capacity-1){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top]=x;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(top==-1) return -1;
        return arr[top];
    }

    boolean isEmpty() {
        return top==-1;
    }

}
public class StackUsingArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your stack: ");
        int n = sc.nextInt();
        Stack st = new Stack(n);
        boolean flag = true;
        while(flag){
            System.out.println("Enter 1 to push 2 to pop 3 to peek and 4 to stop.");
            int y = sc.nextInt();
            switch (y) {
                case 1:
                    System.out.println("Enter the number to push.");
                    int z = sc.nextInt();
                    st.push(z);
                    break;
                case 2:
                    System.out.println(st.pop());
                    break;
                case 3:
                    System.out.println(st.peek());
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Enter a valid number.");
                    break;
            }
        }
    }
}
