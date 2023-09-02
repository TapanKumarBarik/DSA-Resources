/*
 * Problem Description
 * You are given an integer array A of length N.
 * You are also given a 2D integer array B with dimensions M x 2, where each row
 * denotes a [L, R] query.
 * For each query, you have to find the sum of all elements from L to R indices
 * in A (0 - indexed).
 * More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for
 * each query.
 * 
 * 
 * Problem Constraints
 * 1 <= N, M <= 103
 * 1 <= A[i] <= 105
 * 0 <= L <= R < N
 * 
 * 
 * Input Format
 * The first argument is the integer array A.
 * The second argument is the 2D integer array B.
 * 
 * 
 * Output Format
 * Return an integer array of length M where ith element is the answer for ith
 * query in B.
 * 
 * 
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * B = [[0, 3], [1, 2]]
 * Input 2:
 * 
 * A = [2, 2, 2]
 * B = [[0, 0], [1, 2]]
 * 
 * 
 * Example Output
 * Output 1:
 * [10, 5]
 * Output 2:
 * 
 * [2, 4]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
 * The sum of all elements of A[1 ... 2] = 2 + 3 = 5.
 * Explanation 2:
 * 
 * The sum of all elements of A[0 ... 0] = 2 = 2.
 * The sum of all elements of A[1 ... 2] = 2 + 2 = 4.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A,
            ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        int n = A.size();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A.get(i);
            arr.add(sum);
        }

        for (int i = 0; i < B.size(); i++) {

            int start = B.get(i).get(0);
            int end = B.get(i).get(1);

            if (start == 0) {
                res.add(arr.get(end));
            } else {
                int num = arr.get(end) - arr.get(start - 1);
                res.add(num);
            }
        }

        return res;
    }
}
