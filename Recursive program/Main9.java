// Factorial Recursively
// Given a number n, find its factorial using recursion.

// Input Format
// Input consists only of integer n.

// Output Format
// Print the factorial of the number.

// Example 1
// Input

// 5
// Output

// 120
// Explanation

// 1 * 2 * 3 * 4 * 5 = 120.

//code

import java.util.*;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial_recursive(n));
        sc.close();
    }

    public static long factorial_recursive(int n) {
        // your code here
        if (n == 1) {
            return 1;
        }
        return n * factorial_recursive(n - 1);
    }
}