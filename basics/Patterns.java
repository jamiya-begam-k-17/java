import java.util.*;
public class Patterns{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the number of rows");
        int n=sc.nextInt();
        System.out.println("Give the number of cols");
        int m=sc.nextInt();

        // Rectangle
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Hollow rectangle
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==1 || j==1 || i==n-1 || j==m-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Half pyramid
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Inverted Half pyramid
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Inverted half pyramid Rotated by 180 deg
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Half pyramid with numbers
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Inverted half pyramid with numbers
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Floyd's triangle
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

        

        sc.close();
    }
}