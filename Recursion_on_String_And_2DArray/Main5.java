// Countabc
// Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

// countAbc("abc") → 1

// countAbc("abcxxabc") → 2

// countAbc("abaxxaba") → 2

// Input Format
// Only line contains the string in which we have to count "abc" and "aba".

// Output Format
// Print the number of "abc" and "aba" in string.

// Example 1
// Input

// abcxxabc
// Output

// 2
// Explanation

// There are 2 abc from 0 -> 2 and from 5 -> 7

//code

import java.util.*;

public class Main5 {
    static int CountABC(String str) {
        // Write your code here
        if (str.length() < 3) {
            return 0;
        }
        if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {
            return 1 + CountABC(str.substring(1));
        } else {
            return CountABC(str.substring(1));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(CountABC(s));

    }
}