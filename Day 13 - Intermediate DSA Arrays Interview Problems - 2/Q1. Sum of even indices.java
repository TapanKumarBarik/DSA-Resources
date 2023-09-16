/*
 * Problem Description
 * You are given an array A of length N and Q queries given by the 2D array B of
 * size Q*2. Each query consists of two integers B[i][0] and B[i][1].
 * For every query, the task is to calculate the sum of all even indices in the
 * range A[B[i][0]…B[i][1]].
 * 
 * Note : Use 0-based indexing
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= Q <= 105
 * 1 <= A[i] <= 100
 * 0 <= B[i][0] <= B[i][1] < N
 * 
 * 
 * Input Format
 * First argument A is an array of integers.
 * Second argument B is a 2D array of integers.
 * 
 * 
 * Output Format
 * Return an array of integers.
 * 
 * 
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * B = [ [0,2]
 * [1,4] ]
 * Input 2:
 * A = [2, 1, 8, 3, 9]
 * B = [ [0,3]
 * [2,4] ]
 * 
 * 
 * Example Output
 * Output 1:
 * [4, 8]
 * Output 2:
 * [10, 17]
 * 
 * 
 * Example Explanation
 * For Input 1:
 * The subarray for the first query is [1, 2, 3] whose sum of even indices is 4.
 * The subarray for the second query is [2, 3, 4, 5] whose sum of even indices
 * is 8.
 * For Input 2:
 * The subarray for the first query is [2, 1, 8, 3] whose sum of even indices is
 * 10.
 * The subarray for the second query is [8, 3, 9] whose sum of even indices is
 * 17.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        int n = A.size();
        int evenSum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // even
                evenSum += A.get(i);

            }
            A.set(i, evenSum);
        }

        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < B.size(); i++) {
            int k = B.get(i).get(1);
            if (B.get(i).get(0) == 0) {
                ar.add(A.get(k));
            } else {
                ar.add(A.get(k) - A.get(B.get(i).get(0) - 1));
            }
        }

        return ar;
    }
}

// 1, 2, 3, 4, 5
// 1,1,4,4,9
// 0-2
// 4
// 1-4
//
