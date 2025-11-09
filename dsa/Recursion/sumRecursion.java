package Recursion;
// You are using Java
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt(); //1789 -> 1+7+8+9=25 -> 2+5=7 -> 7

        System.out.println(findsum(n));

        sc.close();
    }
    public static int findsum(int n){
        //int sum=0;
        if(n<=9){
            return n;
        }
        // while(n!=0){
        //     sum+=n%10;
        //     n/=10;
        // }
        return n%10+findsum(n/10);
    }

}