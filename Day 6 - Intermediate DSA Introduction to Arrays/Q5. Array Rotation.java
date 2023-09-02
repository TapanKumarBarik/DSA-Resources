/*
 * Problem Description
 * Given an integer array A of size N and an integer B, you have to return the
 * same array after rotating it B times towards the right.
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <=109
 * 1 <= B <= 109
 * 
 * 
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is the integer B.
 * 
 * 
 * Output Format
 * Return the array A after rotating it B times to the right
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [1, 2, 3, 4]
 * B = 2
 * Input 2:
 * 
 * A = [2, 5, 6]
 * B = 1
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * [3, 4, 1, 2]
 * Output 2:
 * 
 * [6, 2, 5]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1,
 * 2]
 * Explanation 2:
 * 
 * Rotate towards the right 1 time - [2, 5, 6] => [6, 2, 5]
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        int n = A.size();
        B = B % n;
        reverse(A, 0, n - 1);
        reverse(A, 0, B - 1);
        reverse(A, B, n - 1);
        return A;
    }

    void reverse(ArrayList<Integer> arr, int i, int j) {
        while (i < j) {

            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
    }
}
