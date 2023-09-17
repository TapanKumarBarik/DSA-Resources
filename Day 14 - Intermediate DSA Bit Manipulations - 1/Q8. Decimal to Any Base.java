/*
 * Problem Description
 * Given a decimal number A and a base B, convert it into its equivalent number
 * in base B.
 * 
 * 
 * Problem Constraints
 * 0 <= A <= 512
 * 2 <= B <= 10
 * 
 * 
 * Input Format
 * The first argument will be decimal number A.
 * The second argument will be base B.
 * 
 * 
 * Output Format
 * Return the conversion of A in base B.
 * 
 * 
 * Example Input
 * Input 1:
 * A = 4
 * B = 3
 * Input 2:
 * A = 4
 * B = 2
 * 
 * 
 * Example Output
 * Output 1:
 * 11
 * Output 2:
 * 100
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * Decimal number 4 in base 3 is 11.
 * Explanation 2:
 * Decimal number 4 in base 2 is 100.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int DecimalToAnyBase(int A, int B) {
        int ans = 0;
        int pow = 1;
        while (A > 0) {
            int digit = A % B;
            A /= B;
            ans += digit * pow;
            pow *= 10;
        }
        return ans;
    }
}
