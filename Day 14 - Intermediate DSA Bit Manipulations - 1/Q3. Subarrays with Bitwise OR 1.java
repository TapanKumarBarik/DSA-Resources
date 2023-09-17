/*
 * Problem Description
 * Given an array B of length A with elements 1 or 0. Find the number of
 * subarrays such that the bitwise OR of all the elements present in the
 * subarray is 1.
 * Note : The answer can be large. So, return type must be long.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= A <= 105
 * 
 * 
 * Input Format
 * The first argument is a single integer A.
 * The second argument is an integer array B.
 * 
 * 
 * Output Format
 * Return the number of subarrays with bitwise array 1.
 * 
 * 
 * Example Input
 * Input 1:
 * A = 3
 * B = [1, 0, 1]
 * Input 2:
 * A = 2
 * B = [1, 0]
 * 
 * 
 * Example Output
 * Output 1:
 * 5
 * Output2:
 * 2
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * The subarrays are :- [1], [0], [1], [1, 0], [0, 1], [1, 0, 1]
 * Except the subarray [0] all the other subarrays has a Bitwise OR = 1
 * Explanation 2:
 * The subarrays are :- [1], [0], [1, 0]
 * Except the subarray [0] all the other subarrays has a Bitwise OR = 1
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public Long solve(int A, ArrayList<Integer> B) {

        Long ans = 0L;
        int count0 = 1;

        for (int i = 0; i < A; i++) {
            int temp = 0;
            if (B.get(i) == 1) {
                ans += count0 * (A - i);
                count0 = 1;
            } else {
                count0++;
            }
        }

        return ans;
    }
}
