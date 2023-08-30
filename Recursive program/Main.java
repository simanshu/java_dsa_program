// Recursive Multiplication
// You are given two integers N and M. Calculate and return their multiplication
// using recursion.

// You can only use subtraction and addition for your calculation. No other
// operators are allowed.

// Note

// Complete the given function. The input would be handled by the driver code.
// You only have to print the answer.

// Input Format
// The first line contains N.

// The second line contains M.

// Output Format
// Print the product.

// Example 1
// Input

// 10
// 13
// Output

// 130
// Explanation

// 10 * 13 = 130



//code


import java.io.*;
import java.util.*;
public class Main {
  public static int multiplyRecursively(int n, int m) {
    //Write code here and print output
	  if(m==0){
		  return 0;
	  }
	return n+multiplyRecursively(n,m-1);
	 // System.out.println(s);
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
	 System.out.println(   multiplyRecursively(n, m));
  }
}