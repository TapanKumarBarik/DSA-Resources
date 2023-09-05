/*
 * Problem Description
 * You are given an array A of N integers.
 * Return a 2D array consisting of all the subarrays of the array
 * 
 * Note : The order of the subarrays in the resulting 2D array does not matter.
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 100
 * 1 <= A[i] <= 105
 * 
 * 
 * Input Format
 * First argument A is an array of integers.
 * 
 * 
 * Output Format
 * Return a 2D array of integers in any order.
 * 
 * 
 * Example Input
 * Input 1:
 * A = [1, 2, 3]
 * Input 2:
 * A = [5, 2, 1, 4]
 * 
 * 
 * Example Output
 * Output 1:
 * [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
 * Output 2:
 * [[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4
 * ] ]
 * 
 * 
 * Example Explanation
 * For Input 1:
 * All the subarrays of the array are returned. There are a total of 6
 * subarrays.
 * For Input 2:
 * All the subarrays of the array are returned. There are a total of 10
 * subarrays.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        int n = A.size();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int j = i; j < n; j++) {
                ar.add(A.get(j));
                arr.add(new ArrayList(ar));
            }
        }
        return arr;
    }
}
