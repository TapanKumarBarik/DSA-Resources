/*
 * Problem Description
 * Given an array A of size N. You need to find the sum of Maximum and Minimum
 * element in the given array.
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 105
 * -109 <= A[i] <= 109
 * 
 * 
 * Input Format
 * First argument A is an integer array.
 * 
 * 
 * Output Format
 * Return the sum of maximum and minimum element of the array
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [-2, 1, -4, 5, 3]
 * Input 2:
 * 
 * A = [1, 3, 4, 1]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 1
 * Output 2:
 * 
 * 5
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.
 * Explanation 2:
 * 
 * Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int solve(ArrayList<Integer> A) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = A.size();
        for (int i = 0; i < n; i++) {
            int num = A.get(i);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max + min;
    }
}
