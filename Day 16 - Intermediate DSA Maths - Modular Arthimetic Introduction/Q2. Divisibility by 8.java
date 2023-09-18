/*
 * Problem Description
 * You are given a number A in the form of a string. Check if the number is
 * divisible by eight or not.
 * 
 * Return 1 if it is divisible by eight else, return 0.
 * 
 * 
 * Problem Constraints
 * 1 <= length of the String <= 100000
 * '0' <= A[i] <= '9'
 * 
 * 
 * Input Format
 * The only argument given is a string A.
 * 
 * 
 * Output Format
 * Return 1 if it is divisible by eight else return 0.
 * 
 * 
 * Example Input
 * Input 1:
 * A = "16"
 * Input 2:
 * 
 * A = "123"
 * 
 * 
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * 
 * 0
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 16 = 8 * 2
 * Explanation 2:
 * 
 * 123 = 15 * 8 + 3
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int solve(String A) {

        int n = A.length();
        if (n == 1) {
            if ((A.charAt(0) - '0') % 8 == 0) {
                return 1;
            }
            return 0;
        }
        if (n == 2) {
            int x = (A.charAt(0) - '0') * 10 + A.charAt(1) - '0';
            if (x % 8 == 0) {
                return 1;
            }
            return 0;
        }
        int a3 = (A.charAt(n - 3) - '0') * 100 + (A.charAt(n - 2) - '0') * 10 + (A.charAt(n - 1) - '0');
        if (a3 % 8 == 0) {
            return 1;
        }
        return 0;
    }
}
