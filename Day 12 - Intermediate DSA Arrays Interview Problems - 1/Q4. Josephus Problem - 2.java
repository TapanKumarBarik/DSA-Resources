/*
 * Problem Description
 * There are A people standing in a circle. Person 1 kills their immediate
 * clockwise neighbour and pass the knife to the next person standing in circle.
 * This process continues till there is only 1 person remaining. Find the last
 * person standing in the circle.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= A <= 105
 * 
 * 
 * Input Format
 * First argument A is an integer.
 * 
 * 
 * Output Format
 * Return an integer.
 * 
 * 
 * Example Input
 * Input 1:
 * A = 4
 * Input 2:
 * A = 5
 * 
 * 
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * 3
 * 
 * 
 * Example Explanation
 * For Input 1:
 * Firstly, the person at position 2 is killed, then the person at position 4 is
 * killed,
 * then the person at position 3 is killed. So the person at position 1
 * survives.
 * For Input 2:
 * 
 * Firstly, the person at position 2 is killed, then the person at position 4 is
 * killed,
 * then the person at position 1 is killed. Finally, the person at position 5 is
 * killed.
 * So the person at position 3 survives.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

public class Solution {
    public int solve(int A) {
        int maxPower = s(A);
        return ((A - maxPower) * 2) + 1;
    }

    int s(int a) {
        int num = 1;
        while (num <= a) {
            num *= 2;
        }

        return num / 2;
    }
}
