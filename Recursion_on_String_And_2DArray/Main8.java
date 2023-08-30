// String Palindrome
// A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left. So given a string str, determine whether it is a palindrome or not.

// Input Format
// The first line of input contains string str.

// Output Format
// Print YES or NO.

// EXAMPLE 1
// Input

// abba
// Output

// YES
// Explanation

// abba is a palindromic string.


//code

import java.io.*;
import java.util.Scanner;

public class Main8 {

    static boolean isPalindrome(String str){
        // Write your code here
		int n=str.length();
		if(ispalin(str,0,n-1)==1){
			return true;
		}
		return false;
    }
	static int ispalin(String s,int b,int e){
		if(b>e){
			return 1;
		}
		if(s.charAt(b)!=s.charAt(e)){
			return -1;
		}
		return ispalin(s,b+1,e-1);
	}
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        boolean result=isPalindrome(str);
        if(result)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}