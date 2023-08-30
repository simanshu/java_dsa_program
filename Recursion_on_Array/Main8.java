// Smallest Number in an Array using Recursion
// Given an array arr of length n, you have to find the minimum element present in the array using recursion.

// Input Format
// First line consists of an integer n, the number of elements in the array

// Second line consists of n spaced inetegrs, representing the array arr.

// Output Format
// Print the minimum element of the array.

// Example 1
// Input

// 3
// 1 2 3
// Output

// 1
// Explanation

// 1 is the smallest among 1, 2 and 3.

//code

import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println(recforMin(arr, n));
    }

    public static int recforMin(int[] arr, int n) {
        // Write your code here
        if (n == 1) {
            return arr[0];
        }
        int a = recforMin(arr, n - 1);
        return Math.min(a, arr[n - 1]);
    }
}