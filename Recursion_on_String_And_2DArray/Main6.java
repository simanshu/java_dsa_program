// Count X in a string
// Count recursively the total number of character x that appear in the given string.

// Input Format
// Only line contains the string in which we have to count character x.

// Output Format
// Print the number of x in string in a single line.

// Example 1
// Input

// abcxxabc
// Output

// 2 
// Explanation

// 2 'x' are there in the given string.

//code

import java.util.Scanner;

public class Main6 {
    static int countX(String str, int i) {
        // Write your code here
        if (i == str.length()) {
            return 0;
        }
        if (str.charAt(i) == 'x') {
            return 1 + countX(str, i + 1);
        }
        return countX(str, i + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        System.out.println(countX(str, 0));
    }
}
