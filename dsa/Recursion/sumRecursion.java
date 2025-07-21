package Recursion;
// You are using Java
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(findsum(n));
        sc.close();
    }
    public static int findsum(int n){
        int sum=0;
        if(n<=9){
            return n;
        }
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return findsum(sum);
    }

}