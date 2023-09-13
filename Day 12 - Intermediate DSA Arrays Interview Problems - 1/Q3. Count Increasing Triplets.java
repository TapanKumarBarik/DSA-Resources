/*
 * Problem Description
 * You are given an array A of N elements. Find the number of triplets i,j and k
 * such that i<j<k and A[i]<A[j]<A[k]
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 103
 * 1 <= A[i] <= 109
 * 
 * 
 * Input Format
 * First argument A is an array of integers.
 * 
 * 
 * Output Format
 * Return an integer.
 * 
 * 
 * Example Input
 * Input 1:
 * A = [1, 2, 4, 3]
 * Input 2:
 * A = [2, 1, 2, 3]
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
 * For Input 1:
 * The triplets that satisfy the conditions are [1, 2, 3] and [1, 2, 4].
 * For Input 2:
 * 
 * The triplet that satisfy the conditions is [1, 2, 3].
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 * 
 */

public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[j] > A[i]) {
                    for (int k = j + 1; k < n; k++) {
                        if (A[k] > A[j]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
