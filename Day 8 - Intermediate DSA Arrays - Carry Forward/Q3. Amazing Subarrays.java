/*
 * You are given a string S, and you have to find all the amazing substrings of
 * S.
 * 
 * An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I,
 * O, U).
 * 
 * Input
 * 
 * Only argument given is string S.
 * Output
 * 
 * Return a single integer X mod 10003, here X is the number of Amazing
 * Substrings in given the string.
 * Constraints
 * 
 * 1 <= length(S) <= 1e6
 * S can have special characters
 * Example
 * 
 * Input
 * ABEC
 * 
 * Output
 * 6
 * 
 * Explanation
 * Amazing substrings of given string are :
 * 1. A
 * 2. AB
 * 3. ABE
 * 4. ABEC
 * 5. E
 * 6. EC
 * here number of substrings are 6 and 6 % 10003 = 6.
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int solve(String A) {

        int n = A.length();
        int count = 0;
        A = A.toUpperCase();
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == 'A' ||
                    A.charAt(i) == 'E' ||
                    A.charAt(i) == 'I' ||
                    A.charAt(i) == 'O' ||
                    A.charAt(i) == 'U') {
                count = count % 10003 + (n - i) % 10003;
            }
        }
        return count % 10003;
    }
}
