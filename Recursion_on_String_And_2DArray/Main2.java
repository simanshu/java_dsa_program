// PairStar
// Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

// Input Format
// The first line contains the string.

// Output Format
// Return the desired output string where there is a * between consecutive same characters.

// Example 1
// Input

// hello
// Output

// hel*lo

//code

import java.util.*;

public class Main2 {
    static String PairStar(String str) {
        // Write your code here
        if (str.length() == 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + PairStar(str.substring(1));

        }
        return str.charAt(0) + PairStar(str.substring(1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(PairStar(s));
    }
}