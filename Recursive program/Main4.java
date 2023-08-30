// Print the pattern
// Using recursion, print the given pattern.

// Input Format
// First line contains integer n, representing rows of the given pattern

// Output Format
// Display the given pattern.

// Example 1
// Input

// 5
// Output

// Explanation:

// The number of rows given is 3.

//code

import java.io.*;
import java.util.*;

class Main4 {

    public static void solve(int n) {
        // Your code here
        if (n == 0) {
            return;
        }
        solve(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

    }
}