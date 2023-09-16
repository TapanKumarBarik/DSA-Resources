/*
 * Problem Description
 * Given an array of size N, find the majority element. The majority element is
 * the element that appears more than floor(n/2) times.
 * You may assume that the array is non-empty and the majority element always
 * exists in the array.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 5*105
 * 1 <= num[i] <= 109
 * 
 * 
 * Input Format
 * Only argument is an integer array.
 * 
 * 
 * Output Format
 * Return an integer.
 * 
 * 
 * Example Input
 * Input 1:
 * [2, 1, 2]
 * Input 2:
 * [1, 1, 1]
 * 
 * 
 * Example Output
 * Input 1:
 * 2
 * Input 2:
 * 1
 * 
 * 
 * Example Explanation
 * For Input 1:
 * 2 occurs 2 times which is greater than 3/2.
 * For Input 2:
 * 1 is the only element in the array, so it is majority
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        int vote = A.get(0);

        int n = A.size();
        int i = 0;
        int voteCount = 0;

        while (i < n) {

            if (voteCount == 0) {
                vote = A.get(i);
            }

            if (A.get(i) == vote) {
                voteCount++;
            } else {
                voteCount--;
            }

            i++;
        }

        return vote;
    }
}
