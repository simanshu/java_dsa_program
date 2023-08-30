// Print Stair Path
// You are given a number n representing number of stairs in a staircase.

// You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.

// Complete the body of printStairPaths function - without changing signature - to print the list of all paths that can be used to climb the staircase up. Use sample input and output to take idea about output.

// Note: Write recursive and not iterative logic

// Input Format
// Input consists of one line.

// First line contains an integer n.

// Output Format
// Print paths (one path in each line) in order hinted by Example output

// Example
// Input

// 3
// Output

// 111
// 12
// 21
// 3

//code

import java.io.*;
import java.util.*;

public class Main9 {
    static void printStairPaths(int n, String pathSoFar) {
        // Write your code here
        if (n < 0) {
            return;
        }
        if (n == 0) {
            System.out.println(pathSoFar);
            return;
        }
        printStairPaths(n - 1, pathSoFar + "1");
        printStairPaths(n - 2, pathSoFar + "2");
        printStairPaths(n - 3, pathSoFar + "3");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        printStairPaths(n, "");
    }
}