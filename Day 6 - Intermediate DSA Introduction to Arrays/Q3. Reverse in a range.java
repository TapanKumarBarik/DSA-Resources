/*
 * Problem Description
 * Given an array A of N integers and also given two integers B and C. Reverse
 * the elements of the array A within the given inclusive range [B, C].
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 109
 * 0 <= B <= C <= N - 1
 * 
 * 
 * Input Format
 * The first argument A is an array of integer.
 * The second and third arguments are integers B and C
 * 
 * 
 * Output Format
 * Return the array A after reversing in the given range.
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [1, 2, 3, 4]
 * B = 2
 * C = 3
 * Input 2:
 * 
 * A = [2, 5, 6]
 * B = 0
 * C = 2
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * [1, 2, 4, 3]
 * Output 2:
 * 
 * [6, 5, 2]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * We reverse the subarray [3, 4].
 * Explanation 2:
 * 
 * We reverse the entire array [2, 5, 6].
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> arr, int i, int j) {
        while (i < j) {

            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }

        return arr;
    }

}
