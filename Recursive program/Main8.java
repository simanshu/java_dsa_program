// power calculation
// You are given two integers, N and X. You have to find X raised to the power N in O(N) time complexity using recursion.

// Note Complete the given function and use recursion to solve this problem.

// It is guaranteed that the test cases are made such that the answer does not overflow a 64-bit integer datatype.

// Input Format
// The first line contains two integers, X, and N.

// Output Format
// Print the answer.

// Example 1
// Input

// 2 3
// Output

// 8
// Explanation

// 2 raised to the power 3 is 8.

//code

import java.util.*;

class Main8 {
    public static long xPowerN(int x, int n) {
        // write code here
        if (n == 0) {
            return 1;

        }
        if (x == 0) {
            return 1;
        }
        return x * xPowerN(x, n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(xPowerN(x, n));
    }
}