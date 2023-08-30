// Number of ways to form Natural Number
// Find number of ways an integer N can be represented as a sum of unique natural numbers.

// Input Format
// First line contains a single integer N.

// Output Format
// Print a single integer containing number of ways.

// Example 1
// Input

// 6
// Output

// 4
// Explaination

// 6 can be represented as (1, 2, 3), (1, 5), (2, 4), (6)

// Example 2

//code

import java.io.*;
import java.util.*;

public class Main7 {
    public static long countWays(int N, int currentNumber) {
        // Write your code here
        if (N == 0) {
            return 1;
        }

        long ways = 0;

        for (int i = currentNumber; i <= N; i++) {
            ways += countWays(N - i, i + 1);
        }

        return ways;

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(countWays(n, 1));
    }
}