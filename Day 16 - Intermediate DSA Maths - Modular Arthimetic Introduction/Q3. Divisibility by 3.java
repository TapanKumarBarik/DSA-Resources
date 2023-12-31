/*
 * Problem Description
 * Given a number in the form of an array A of size N. Each of the digits of the
 * number is represented by A[i]. Check if the number is divisible by 3.
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 105
 * 
 * 0 <= A[i] <= 9
 * 
 * A[1] ≠ 0
 * 
 * 
 * 
 * Input Format
 * Given an integer array representing the number
 * 
 * 
 * 
 * Output Format
 * Return 1 if the number is divisible by 3 and return 0 otherwise.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * A = [1, 2, 3]
 * Input 2:
 * A = [1, 0, 0, 1, 2]
 * 
 * 
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * 0
 * 
 * 
 * Example Explanation
 * For Input 1:
 * The number 123 is divisible by 3.
 * For Input 2:
 * The number 10012 is not divisible by 3.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int solve(ArrayList<Integer> A) {

        int sum = 0;
        for (int i = 0; i < A.size(); i++) {
            sum += A.get(i);
        }

        if (sum % 3 == 0)
            return 1;
        return 0;
    }
}
