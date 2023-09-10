/*
 * Problem Constraints
 * 1 <= A.size() <= 1000
 * 
 * 1 <= A[i].size() <= 1000
 * 
 * 1 <= A[i][j] <= 1000
 * 
 * 
 * 
 * Input Format
 * First argument is a 2D matrix of integers.
 * 
 * 
 * 
 * Output Format
 * You have to return the Transpose of this 2D matrix.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 * Input 2:
 * 
 * A = [[1, 2],[1, 2],[1, 2]]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
 * Output 2:
 * 
 * [[1, 1, 1], [2, 2, 2]]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4,
 * 5, 6],[7, 8, 9]]
 * we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int[][] solve(int[][] A) {

        int n = A.length;

        int m = A[0].length;

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                arr[i][j] = A[j][i];
            }
        }

        return arr;

    }
}
