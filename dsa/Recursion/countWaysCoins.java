package Recursion;

import java.util.*;

public class countWaysCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of coins
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();  // coin denominations

        int target = sc.nextInt();  // target sum

        System.out.println(countWays(arr, n, target));

        sc.close();
    }

    public static int countWays(int[] arr, int n, int target) {
        // ✅ Base case 1: exact target reached
        if (target == 0) return 1;

        // ❌ Base case 2: overshot the target
        if (target < 0) return 0;

        // ❌ Base case 3: no coins left
        if (n == 0) return 0;

        // Recursive cases:
        // 1. Include current coin (arr[n-1]) → stay at same n
        // 2. Exclude current coin → reduce n
        return countWays(arr, n, target - arr[n - 1]) + countWays(arr, n - 1, target);
    }
}
