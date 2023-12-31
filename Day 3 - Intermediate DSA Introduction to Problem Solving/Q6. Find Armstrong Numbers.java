/*
 * Problem Description
 * You are given an integer A. You need to print all the Armstrong Numbers
 * between 1 to A.
 * 
 * If sum of cubes of each digit of the number is equal to the number itself,
 * then the number is called an Armstrong number.
 * 
 * For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 500
 * 
 * 
 * 
 * Input Format
 * First and only argument is an integer A.
 * 
 * 
 * 
 * Output Format
 * Return an integer array of all the Armstrong numbers in range [1,A].
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * 5
 * Input 2:
 * 
 * 200
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 1
 * Output 2:
 * 
 * [1, 153]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * 1 is an armstrong number.
 * Explanation 2:
 * 
 * 1 and 153 are armstrong number under 200.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> solve(int A) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= A; i++) {
            if (isArmStrongNumber(i)) {
                arr.add(i);
            }
        }

        return arr;
    }

    boolean isArmStrongNumber(int n) {

        int num = 0;
        String s = "";
        s += n;

        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - '0';
            int temp_ = temp * temp * temp;
            num += temp_;
        }

        if (num == n) {
            return true;
        }
        return false;
    }
}
