Decrease Print Increase Print
// You are given a number N. You have to print the backward counting from N to 1. On reaching 1, you have to print counting from 1 to N.

// Note

// Complete the body of printDI function to achieve it. Don't change the function Definition.

// Input Format
// The first line contains a single integer N.

// Output Format
// Print the counting with each number in a new line.

// Example 1
// Input

// 4
// Output

// 4
// 3
// 2
// 1
// 1
// 2
// 3
// 4
// Explanation

// We count from 4 to 1 and back to 4 again.


// code

import java.io.*;
import java.util.*;

public class Main1 {
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
    printDI(n);
  }

  public static void printDI(int n) {
    // your code here
	  if(n<=0){
		  return;
	  }
	  else{
		  System.out.println(n);
		  printDI(n-1);
		  System.out.println(n);
	  }
  }
}