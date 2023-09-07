/*
 * Problem Description
 * You are given a N X N integer matrix. You have to find the sum of all the
 * minor diagonal elements of A.
 * 
 * Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such
 * that i + j = M + 1 (where i, j are 1-based).
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 103
 * 
 * -1000 <= A[i][j] <= 1000
 * 
 * 
 * 
 * Input Format
 * First and only argument is a 2D integer matrix A.
 * 
 * 
 * 
 * Output Format
 * Return an integer denoting the sum of minor diagonal elements.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [[1, -2, -3],
 * [-4, 5, -6],
 * [-7, -8, 9]]
 * Input 2:
 * 
 * A = [[3, 2],
 * [2, 3]]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * -5
 * Output 2:
 * 
 * 4
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * A[1][3] + A[2][2] + A[3][1] = (-3) + 5 + (-7) = -5
 * Explanation 2:
 * 
 * A[1][2] + A[2][1] = 2 + 2 = 4
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<ArrayList<Integer>> A) {

        int n = A.size();

        int sum = 0;
        int i = 0;

        while (i < n) {
            sum += A.get(i).get(n - 1 - i);
            i++;
        }
        return sum;
    }
}
