/*
 * Given a binary string A. It is allowed to do at most one swap between any 0
 * and 1. Find and return the length of the longest consecutive 1’s that can be
 * achieved.
 * 
 * 
 * Input Format
 * 
 * The only argument given is string A.
 * Output Format
 * 
 * Return the length of the longest consecutive 1’s that can be achieved.
 * Constraints
 * 
 * 1 <= length of string <= 1000000
 * A contains only characters 0 and 1.
 * For Example
 * 
 * Input 1:
 * A = "111000"
 * Output 1:
 * 3
 * 
 * Input 2:
 * A = "111011101"
 * Output 2:
 * 7
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int solve(String A) {

        int totalOne = 0;
        int n = A.length();
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '1') {
                totalOne++;
            }
        }

        int maxAns = 0;

        for (int i = 0; i < n; i++) {

            int ans = 0;
            int count = 0;
            int zero = 1;
            int j = i;
            while (zero > -1 && j < n) {

                if (A.charAt(j) == '1') {
                    count++;
                } else {
                    zero--;
                }
                j++;
            }
            maxAns = Math.max(count, maxAns);
        }
        if (maxAns == totalOne) {
            return maxAns;
        }
        return maxAns + 1;
    }
}
