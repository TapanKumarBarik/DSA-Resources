/*
 * Problem Description
 * You have given a string A having Uppercase English letters.
 * 
 * You have to find how many times subsequence "AG" is there in the given
 * string.
 * 
 * NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= length(A) <= 105
 * 
 * 
 * 
 * Input Format
 * First and only argument is a string A.
 * 
 * 
 * 
 * Output Format
 * Return an integer denoting the answer.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = "ABCGAG"
 * Input 2:
 * 
 * A = "GAB"
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 3
 * Output 2:
 * 
 * 0
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * Subsequence "AG" is 3 times in given string
 * Explanation 2:
 * 
 * There is no subsequence "AG" in the given string.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

//1
public class Solution {
    public int solve(String A) {
        /*
         * ABCGAG
         * 222211
         * 2+1
         */

        int n = A.length();
        int[] arr = new int[n];

        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (A.charAt(i) == 'G') {
                count++;
            }
            arr[i] = count;
        }

        int res = 0;
        int mod = 1000000007;
        for (int i = 0; i < n - 1; i++) {

            if (A.charAt(i) == 'A') {

                res += arr[i + 1];
                res %= mod;
            }
        }
        return res;
    }
}

// 2
public class Solution {
    public int solve(String A) {
        int n = A.length();
        int count = 0;
        int res = 0;
        int mod = 1000000007;
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == 'A') {
                count++;
            }
            if (A.charAt(i) == 'G') {
                res += count;
                res %= mod;
            }
        }
        return res;
    }
}
