/*
 * Problem Description
 * Say you have an array, A, for which the ith element is the price of a given
 * stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 * 
 * Return the maximum possible profit.
 * 
 * 
 * 
 * Problem Constraints
 * 0 <= A.size() <= 700000
 * 1 <= A[i] <= 107
 * 
 * 
 * 
 * Input Format
 * The first and the only argument is an array of integers, A.
 * 
 * 
 * Output Format
 * Return an integer, representing the maximum possible profit.
 * 
 * 
 * Example Input
 * Input 1:
 * A = [1, 2]
 * Input 2:
 * 
 * A = [1, 4, 5, 2, 4]
 * 
 * 
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * 
 * 4
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * Buy the stock on day 0, and sell it on day 1.
 * Explanation 2:
 * 
 * Buy the stock on day 0, and sell it on day 2.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {

        int n = A.size();
        if (n == 0)
            return 0;

        int maxProfit = 0;

        int currentPrice = A.get(0);

        for (int i = 1; i < n; i++) {

            if (currentPrice < A.get(i)) {
                maxProfit = Math.max(maxProfit, A.get(i) - currentPrice);

            } else {
                currentPrice = A.get(i);
            }
        }

        return maxProfit;
    }
}