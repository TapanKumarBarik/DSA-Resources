/*
 * Problem Description
 * Given an array of integers A, every element appears twice except for one.
 * Find that integer that occurs once.
 * 
 * NOTE: Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= |A| <= 2000000
 * 
 * 0 <= A[i] <= INTMAX
 * 
 * 
 * 
 * Input Format
 * The first and only argument of input contains an integer array A.
 * 
 * 
 * 
 * Output Format
 * Return a single integer denoting the single element.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [1, 2, 2, 3, 1]
 * Input 2:
 * 
 * A = [1, 2, 2]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 3
 * Output 2:
 * 
 * 1
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * 3 occurs once.
 * Explanation 2:
 * 
 * 1 occurs once.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int num = 0;
        int n = A.size();
        for (int i = 0; i < n; i++) {
            num ^= A.get(i);
        }
        return num;
    }
}
