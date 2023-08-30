// Climbing Stairs
// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. Your task is to print the number of distinct ways you can climb to the top.

// Input Format
// The only line of input contains an integer n.

// Output Format
// The only line of output contains an integer denoting the distinct ways can you climb to the top.

// Example 1
// Input

// 2
// Output

// 2
// Explanation

// There are two ways to climb to the top.

// 1 step + 1 step

// 2 steps

//code

import java.util.*;
import static java.lang.Math.ceil;

class Accio {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public int ClimbingStairs(int n) {
        // Write your code here
        return fib(n + 1);

    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.ClimbingStairs(n));
    }
}