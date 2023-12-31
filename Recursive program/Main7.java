// Tower Of Hanoi
// You are given the number of discs N and three rods 1,2, and 3. Initially, these discs are in rod 1.

// You need to print all the steps of the movement of the discs so that all the discs reach the 3rd rod. Use of rod 2 is allowed.

// Note

// The discs are arranged such that the top disc is numbered 1 and the bottom-most disc is numbered N. Also, all the discs have different sizes and a bigger disc cannot be put on top of a smaller disc at any time.

// Only 1 disc can be moved at a time.

// You need to find the most optimal solution, i.e., the solution with the minimum number of moves.

// You need to print output in the following format:

// move disk i from rod x to rod y

// Input Format
// The first line contains the number N.

// Output Format
// For each test case, print all the steps of movement of the disk.

// Example 1
// Input

// 2
// Output

// move disk 1 from rod 1 to rod 2
// move disk 2 from rod 1 to rod 3
// move disk 1 from rod 2 to rod 3
// Explanation

// To move 2 disks from rod 1 to rod 3, the steps mentioned in the output are required.

// Example 2
// Input

// 3
// Output

// move disk 1 from rod 1 to rod 3
// move disk 2 from rod 1 to rod 2
// move disk 1 from rod 3 to rod 2
// move disk 3 from rod 1 to rod 3
// move disk 1 from rod 2 to rod 1
// move disk 2 from rod 2 to rod 3
// move disk 1 from rod 1 to rod 3

//code

import java.io.*;
import java.util.*;

class Main7 {
    static void toh(int N, int from, int to, int aux) {
        // Write code here
        if (N == 0) {
            return;
        }
        toh(N - 1, from, aux, to);
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        toh(N - 1, aux, to, from);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        N = sc.nextInt();

        toh(N, 1, 3, 2);

        sc.close();
    }
}
