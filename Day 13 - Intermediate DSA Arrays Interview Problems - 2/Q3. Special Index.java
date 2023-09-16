/*
 * Problem Description
 * Given an array, arr[] of size N, the task is to find the count of array
 * indices such that removing an element from these indices makes the sum of
 * even-indexed and odd-indexed array elements equal.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= n <= 105
 * -105 <= A[i] <= 105
 * 
 * 
 * Input Format
 * First argument contains an array A of integers of size N
 * 
 * 
 * Output Format
 * Return the count of array indices such that removing an element from these
 * indices makes the sum of even-indexed and odd-indexed array elements equal.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * A=[2, 1, 6, 4]
 * Input 2:
 * 
 * A=[1, 1, 1]
 * 
 * 
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * 
 * 3
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that,
 * arr[0] + arr[2] = arr[1].
 * Therefore, the required output is 1.
 * Explanation 2:
 * 
 * Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that
 * arr[0] = arr[1]
 * Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that
 * arr[0] = arr[1]
 * Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that
 * arr[0] = arr[1]
 * Therefore, the required output is 3.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int solve(ArrayList<Integer> A) {

        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        int n = A.size();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {// even

                evenSum += A.get(i);
                even.add(evenSum);
                odd.add(oddSum);
            } else {
                oddSum += A.get(i);
                even.add(evenSum);
                odd.add(oddSum);
            }

        }
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (i == 0) {
                int e = odd.get(n - 1) - odd.get(0);
                int o = even.get(n - 1) - even.get(0);

                if (e == o)
                    count++;
            } else {

                int e = even.get(i - 1) + odd.get(n - 1) - odd.get(i);
                int o = odd.get(i - 1) + even.get(n - 1) - even.get(i);

                if (e == o)
                    count++;
            }
        }

        return count;
    }
}
