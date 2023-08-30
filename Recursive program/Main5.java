// Sum of natural numbers
// Write a recursive program to find out the sum of all natural numbers till N. Take input of N from the user and make a recursive function that returns the sum of all the natural numbers upto N.

// Input Format
// First line is an integer N

// Output Format
// Print the sum of first N natural numbers.

// Example 1
// Input

// 5
// Output

// 15
// Explanation

// Here, n = 5, so 1 + 2 + 3 + 4 + 5 = 15

// code

import java.util.*;

public class Main5 {
    static long NumberSum(long n) {
        // Write your code here
        if (n == 1) {
            return 1;
        }
        return n + NumberSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        System.out.println(NumberSum(N));
    }
}