/*
 * Problem Description
 * You are given two integers A and B.
 * Set the A-th bit and B-th bit in 0, and return output in decimal Number
 * System.
 * 
 * Note:
 * The bit positions are 0-indexed, which means that the least significant bit
 * (LSB) has index 0.
 * 
 * 
 * Problem Constraints
 * 0 <= A <= 30
 * 0 <= B <= 30
 * 
 * 
 * Input Format
 * First argument A is an integer.
 * Second argument B is an integer.
 * 
 * 
 * Output Format
 * Return an integer.
 * 
 * 
 * Example Input
 * Input 1:
 * A = 3
 * B = 5
 * Input 2:
 * A = 4
 * B = 4
 * 
 * 
 * Example Output
 * Output 1:
 * 40
 * Output 2:
 * 16
 * 
 * 
 * Example Explanation
 * For Input 1:
 * The binary expression is 101000 which is 40 in decimal.
 * For Input 2:
 * The binary expression is 10000 which is 16 in decimal
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int solve(int A, int B) {

        if (A == B)
            return pow(A);
        return pow(A) + pow(B);
    }

    int pow(int num) {

        int power = 1;
        while (num > 0) {
            power *= 2;
            num--;
        }

        return power;
    }
}

// ------------------------------------------
public class Solution {
    public int solve(int A, int B) {

        return ((1 << A) | (1 << B));
    }
}