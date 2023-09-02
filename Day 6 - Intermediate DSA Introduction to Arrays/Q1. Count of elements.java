/*
 * Problem Description
 * Given an array A of N integers.
 * Count the number of elements that have at least 1 elements greater than
 * itself.
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 109
 * 
 * 
 * Input Format
 * First and only argument is an array of integers A.
 * 
 * 
 * Output Format
 * Return the count of elements.
 * 
 * 
 * Example Input
 * Input 1:
 * A = [3, 1, 2]
 * Input 2:
 * A = [5, 5, 3]
 * 
 * 
 * Example Output
 * Output 1:
 * 2
 * Output 2:
 * 1
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * The elements that have at least 1 element greater than itself are 1 and 2
 * Explanation 2:
 * The elements that have at least 1 element greater than itself is 3
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int solve(ArrayList<Integer> A) {

        int count = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < A.size(); i++) {
            maxNum = Math.max(maxNum, A.get(i));
        }

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) < maxNum) {
                count++;
            }
        }

        return count;
    }
}
