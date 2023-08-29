/*
 * Problem Description
 * 
 * You are given a function that takes an integer argument A. Return 1 if A is a
 * perfect square otherwise return 0.
 * 
 * A perfect square is an integer that is the square of an integer. For example
 * 16 is perfect square as it is the square of an integer 4 (42 = 16)
 * 
 * 
 * Problem Constraints
 * 
 * 1 <= A <= 108
 * 
 * 
 * 
 * Input Format
 * 
 * First argument is an integer A.
 * 
 * 
 * 
 * Output Format
 * 
 * Return an integer (0 or 1) based upon the question.
 * 
 * 
 * 
 * Example Input
 * 
 * Input 1:
 * 
 * A = 4
 * Input 2:
 * 
 * A = 1001
 * 
 * 
 * Example Output
 * 
 * Output 1:
 * 
 * 1
 * Output 2:
 * 
 * 0
 * 
 * 
 * Example Explanation
 * 
 * Explanation 1:
 * 
 * sqrt(4) = 2
 * Explanation 2:
 * 
 * 1001 is not a perfect square.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int solve(int A) {

        for (int i = 1; i * i <= A; i++) {
            if (i * i == A) {
                return 1;
            }
        }
        return 0;
    }
}
