// No X
// Given a string, compute recursively a new string where all the x chars have been removed.

// Input Format
// Only line contains the string S.

// Output Format
// Print the string with no x.

// Example 1
// Input

// xaaax
// Output

// aaa
// Explanation

// Remove the x at the start and the end.

//code

import java.util.*;

public class Main1 {
    static String noX(String s) {
        // Write your code here
        if (s.length() == 0) {
            return "";
        }
        if (s.charAt(0) == 'x') {
            return noX(s.substring(1));
        }
        return s.charAt(0) + noX(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(noX(s));
    }
}