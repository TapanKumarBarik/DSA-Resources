/*
 * Problem Description
 * Give a N * N square matrix A, return an array of its anti-diagonals. Look at
 * the example for more details.
 * 
 * 
 * Problem Constraints
 * 1<= N <= 1000
 * 1<= A[i][j] <= 1e9
 * 
 * 
 * Input Format
 * Only argument is a 2D array A of size N * N.
 * 
 * 
 * Output Format
 * Return a 2D integer array of size (2 * N-1) * N, representing the
 * anti-diagonals of input array A.
 * The vacant spaces in the grid should be assigned to 0.
 * 
 * 
 * Example Input
 * Input 1:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Input 2:
 * 
 * 1 2
 * 3 4
 * 
 * 
 * Example Output
 * Output 1:
 * 1 0 0
 * 2 4 0
 * 3 5 7
 * 6 8 0
 * 9 0 0
 * Output 2:
 * 
 * 1 0
 * 2 3
 * 4 0
 * 
 * 
 * Example Explanation
 * For input 1:
 * The first anti diagonal of the matrix is [1 ], the rest spaces shoud be
 * filled with 0 making the row as [1, 0, 0].
 * The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be
 * filled with 0 making the row as [2, 4, 0].
 * The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be
 * filled with 0 making the row as [3, 5, 7].
 * The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be
 * filled with 0 making the row as [6, 8, 0].
 * The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be
 * filled with 0 making the row as [9, 0, 0].
 * For input 2:
 * 
 * The first anti diagonal of the matrix is [1 ], the rest spaces shoud be
 * filled with 0 making the row as [1, 0, 0].
 * The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be
 * filled with 0 making the row as [2, 4, 0].
 * The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces shoud be
 * filled with 0 making the row as [3, 0, 0].
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {

        int n = A.size();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < 2 * n - 1; i++) {

            int j = 0;
            if (i >= n) {
                j = i - n + 1;
            }
            ArrayList<Integer> ar = new ArrayList<>();
            int k = 0;
            for (int l = j; l <= i - j; l++) {
                ar.add(A.get(l).get(i - l));
                k++;
            }

            for (int l = k; k < n; k++) {
                ar.add(0);
            }
            arr.add(ar);
        }

        return arr;
    }
}

/*
 * 2*n-1;
 * offset that is if i<n then offset =0;
 * else offset=i-n+1;
 * // * k=0;
 * // * for j=offset ,j<=i-offset j++
 * // * add---a.get(j).get(i-j)
 * // * k++
 * 
 */