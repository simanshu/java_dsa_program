// Recursively Print Numbers In Reverse
// Write a recursive program to print all numbers starting from N till 1. Print numbers in descending order from N till you reach 1.

// Input Format
// Input consists of a single integer N

// Output Format
// Print the numbers between N and 1 in descending order, each separated by a single space.

// Example 1
// Input

// 5
// Output

// 5 4 3 2 1

//code

import java.util.*;

public class Main2 {

    public static void printtillN(int N) {
        // write code here
        if (N <= 0) {
            return;
        } else {
            System.out.print(N + " ");
            printtillN(N - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        printtillN(N);
        sc.close();
    }
}