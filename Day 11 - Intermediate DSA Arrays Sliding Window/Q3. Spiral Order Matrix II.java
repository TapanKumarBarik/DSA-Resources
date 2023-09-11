/*
 * Problem Description
 * Given an integer A, generate a square matrix filled with elements from 1 to
 * A2 in spiral order and return the generated square matrix.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= A <= 1000
 * 
 * 
 * 
 * Input Format
 * First and only argument is integer A
 * 
 * 
 * Output Format
 * Return a 2-D matrix which consists of the elements added in spiral order.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * 1
 * Input 2:
 * 
 * 2
 * Input 3:
 * 
 * 5
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * [ [1] ]
 * Output 2:
 * 
 * [ [1, 2],
 * [4, 3] ]
 * Output 2:
 * 
 * [ [1, 2, 3, 4, 5],
 * [16, 17, 18, 19, 6],
 * [15, 24, 25, 20, 7],
 * [14, 23, 22, 21, 8],
 * [13, 12, 11, 10, 9] ]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * Only 1 is to be arranged.
 * Explanation 2:
 * 
 * 1 --> 2
 * |
 * |
 * 4<--- 3
 * Explanation 3:
 * 
 * 
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int[][] generateMatrix(int A) {

        int res[][] = new int[A][A];
        int i = 0, j = 0, num = 1;
        while (A > 1) {
            // store array value from left to right
            for (int k = 1; k < A; k++) {
                res[i][j] = num;
                j++;
                num++;
            }
            // store array value from top to down
            for (int k = 1; k < A; k++) {
                res[i][j] = num;
                i++;
                num++;
            }
            // store array value from right to left
            for (int k = 1; k < A; k++) {
                res[i][j] = num;
                j--;
                num++;
            }
            // store array value from down to top
            for (int k = 1; k < A; k++) {
                res[i][j] = num;
                i--;
                num++;
            }
            i++;
            j++;
            A -= 2;
        }
        if (A == 1) {
            res[i][j] = num;
        }

        return res;
    }
}
