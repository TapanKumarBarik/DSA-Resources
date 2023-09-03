/*
 * Given an array of integers A, find and return the product array of the same
 * size where the ith element of the product array will be equal to the product
 * of all the elements divided by the ith element of the array.
 * 
 * Note: It is always possible to form the product array with integer (32 bit)
 * values. Solve it without using the division operator.
 * 
 * 
 * Input Format
 * 
 * The only argument given is the integer array A.
 * Output Format
 * 
 * Return the product array.
 * Constraints
 * 
 * 2 <= length of the array <= 1000
 * 1 <= A[i] <= 10
 * For Example
 * 
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * Output 1:
 * [120, 60, 40, 30, 24]
 * 
 * Input 2:
 * A = [5, 1, 10, 1]
 * Output 2:
 * [10, 50, 5, 50]
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int[] solve(int[] A) {

        int n = A.length;

        int[] leftArr = new int[n];

        int[] rightArr = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                leftArr[i] = A[i];
            } else {
                leftArr[i] = leftArr[i - 1] * A[i];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                rightArr[i] = A[i];
            } else {
                rightArr[i] = rightArr[i + 1] * A[i];
            }
        }

        // 1, 2, 3, 4, 5
        // 1 ,2, 6, 24, 120
        // 120, 120, 60, 20, 5

        int[] res = new int[n];
        res[0] = rightArr[1];
        res[n - 1] = leftArr[n - 2];

        for (int i = 1; i < n - 1; i++) {
            res[i] = rightArr[i + 1] * leftArr[i - 1];
        }

        return res;
    }
}
