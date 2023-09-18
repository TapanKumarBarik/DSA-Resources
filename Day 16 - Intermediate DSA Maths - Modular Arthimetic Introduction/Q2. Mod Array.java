/*
 * Problem Description
 * You are given a large number in the form of a array A of size N where each
 * element denotes a digit of the number.
 * You are also given a number B. You have to find out the value of A % B and
 * return it.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 105
 * 0 <= Ai <= 9
 * 1 <= B <= 109
 * 
 * 
 * Input Format
 * The first argument is an integer array A.
 * The second argument is an integer B.
 * 
 * 
 * Output Format
 * Return a single integer denoting the value of A % B.
 * 
 * 
 * Example Input
 * Input 1:
 * A = [1, 4, 3]
 * B = 2
 * Input 2:
 * 
 * A = [4, 3, 5, 3, 5, 3, 2, 1]
 * B = 47
 * 
 * 
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * 
 * 20
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 143 is an odd number so 143 % 2 = 1.
 * Explanation 2:
 * 
 * 43535321 % 47 = 20
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int solve(ArrayList<Integer> A, long B) {

        int n = A.size() - 1;
        long res = 0;
        long des = 1;
        while (n >= 0) {

            long temp = (A.get(n) * des) % B;
            res = (res + temp) % B;
            des = (des * 10) % B;
            n--;
        }

        return (int) res;
    }
}
