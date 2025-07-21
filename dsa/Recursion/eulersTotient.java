package Recursion;

import java.util.*;

public class eulersTotient {

    // Function to calculate GCD
    // static int gcd(int a, int b) {
    //     if (b == 0)
    //         return a;
    //     return gcd(b, a % b);
    // }
    // we optimized this solution without finding gcd

    // Function to calculate Euler's Totient Function
    public static int phi(int n) {
        int result = n;

        for (int p = 2; p * p <= n; ++p) {
            if (n % p == 0) {
                // Remove all occurrences of p
                while (n % p == 0)
                    n /= p;
                result -= result / p;
            }
        }

        if (n > 1)
            result -= result / n;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases
        int[] arr = new int[t];

        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            System.out.println(phi(arr[i]));
        }

        sc.close();
    }
}

