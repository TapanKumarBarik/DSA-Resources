/*
 * Problem Description
 * Given an array of integers A, of size N.
 * 
 * Return the maximum size subarray of A having only non-negative elements. If
 * there are more than one such subarray, return the one having the smallest
 * starting index in A.
 * 
 * NOTE: It is guaranteed that an answer always exists.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 105
 * 
 * -109 <= A[i] <= 109
 * 
 * 
 * 
 * Input Format
 * The first and only argument given is the integer array A.
 * 
 * 
 * 
 * Output Format
 * Return maximum size subarray of A having only non-negative elements. If there
 * are more than one such subarrays, return the one having earliest starting
 * index in A.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [5, 6, -1, 7, 8]
 * Input 2:
 * 
 * A = [1, 2, 3, 4, 5, 6]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * [5, 6]
 * Output 2:
 * 
 * [1, 2, 3, 4, 5, 6]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * There are two subarrays of size 2 having only non-negative elements.
 * 1. [5, 6] starting point = 0
 * 2. [7, 8] starting point = 3
 * As starting point of 1 is smaller, return [5, 6]
 * Explanation 2:
 * 
 * There is only one subarray of size 6 having only non-negative elements:
 * [1, 2, 3, 4, 5, 6]
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int i = 0;
        int endIndex = 0;
        int startIndex = 0;
        int count = 0;
        int maxCount = 0;
        while (i < n) {
            if (A[i] > 0) {
                count++;
            } else {
                if (count > maxCount) {
                    endIndex = i;
                    maxCount = count;
                    startIndex = endIndex - count;
                    count = 0;
                } else {
                    count = 0;
                }
            }
            i++;
        }

        if (count > maxCount) {
            endIndex = n;
            startIndex = n - count;
        }
        int[] arr = new int[endIndex - startIndex];
        int ii = 0;
        for (int m = startIndex; m < endIndex; m++) {
            arr[ii] = A[m];
            ii++;
        }
        return arr;
    }
}
