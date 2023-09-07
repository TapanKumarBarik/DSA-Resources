/*
 * Problem Description
 * You are given a 2D integer matrix A, return a 1D integer array containing
 * column-wise sums of original matrix.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= A.size() <= 103
 * 
 * 1 <= A[i].size() <= 103
 * 
 * 1 <= A[i][j] <= 103
 * 
 * 
 * 
 * Input Format
 * First argument is a 2D array of integers.(2D matrix).
 * 
 * 
 * 
 * Output Format
 * Return an array containing column-wise sums of original matrix.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * [1,2,3,4]
 * [5,6,7,8]
 * [9,2,3,4]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * {15,10,13,16}
 * 
 * 
 * Example Explanation
 * Explanation 1
 * 
 * Column 1 = 1+5+9 = 15
 * Column 2 = 2+6+2 = 10
 * Column 3 = 3+7+3 = 13
 * Column 4 = 4+8+4 = 16
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 * Arg 1: Multi Dimensional Array with
 */

public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {

        int n = A.size();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < A.get(0).size(); i++) {

            int sum = 0;

            for (int j = 0; j < n; j++) {
                sum += A.get(j).get(i);

            }
            arr.add(sum);
        }

        return arr;
    }
}
