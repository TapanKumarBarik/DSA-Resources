/*
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
 * First argument A is a 2D array of integers.(2D matrix).
 * 
 * 
 * 
 * Output Format
 * Return an array containing row-wise sums of original matrix.
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
 * [10,26,18]
 * 
 * 
 * Example Explanation
 * Explanation 1
 * 
 * Row 1 = 1+2+3+4 = 10
 * Row 2 = 5+6+7+8 = 26
 * Row 3 = 9+2+3+4 = 18
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {

        int n = A.size();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = 0; j < A.get(i).size(); j++) {
                sum += A.get(i).get(j);
            }
            arr.add(sum);
        }
        return arr;
    }
}
