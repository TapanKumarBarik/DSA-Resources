/*
 * Given two integers A and B. A represents the count of mangoes and B represent
 * the count of slices of mangoes. Mango can be cut into three slices of
 * mangoes. A glass of mango shake can be formed by two slices of mangoes.
 * 
 * Find the maximum number of glasses of mango shakes you can make with A
 * mangoes and B slices of mangoes initially.
 * 
 * 
 * Input Format
 * 
 * The First argument is an integer A.
 * The Second argument is an integer B.
 * Output Format
 * 
 * Return the maximum number of glasses of mango shakes you can make.
 * Constraints
 * 
 * 0 <= A, B <= 10^8
 * For Example
 * 
 * Input 1:
 * A = 19
 * B = 0
 * Output 1:
 * 28
 * 
 * Input 2:
 * A = 7
 * B = 1
 * Output 2:
 * 11
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int solve(int A, int B) {
        return (A * 3 + B) / 2;
    }
}
