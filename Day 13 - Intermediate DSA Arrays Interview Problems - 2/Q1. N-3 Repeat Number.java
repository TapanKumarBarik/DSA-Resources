
/*
 * Problem Description
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.

Note: Read-only array means that the input array should not be modified in the process of solving the problem



Problem Constraints
1 <= N <= 7*105
1 <= A[i] <= 109


Input Format
The only argument is an integer array A.


Output Format
Return an integer.


Example Input
Input 1:
[1 2 3 1 1]
Input 2:
[1 2 3]


Example Output
Output 1:
1
Output 2:
-1


Example Explanation
Explanation 1:
1 occurs 3 times which is more than 5/3 times.
Explanation 2:
No element occurs more than 3 / 3 = 1 times in the array.



Expected Output
Enter your input as per the following guideline:
There are 1 lines in the input

Line 1 ( Corresponds to arg 1 ) : An integer array. First number is the size S of the array. Then S numbers follow which indicate the elements in the array.
    For example, Array: [1, 2, 6] will be written as "3 1 2 6"(without quotes).
 */

public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {

        int vote1 = 0;
        int vote2 = 0;
        int voteCount1 = 0;
        int voteCount2 = 0;
        int i = 0;
        int n = a.size();

        while (i < n) {

            if (a.get(i) == vote1 || a.get(i) == vote2) {
                if (a.get(i) == vote1) {
                    voteCount1++;
                } else {
                    voteCount2++;
                }
            }

            else if (voteCount1 == 0 || voteCount2 == 0) {

                if (voteCount1 == 0) {
                    voteCount1++;
                    vote1 = a.get(i);
                } else {
                    voteCount2++;
                    vote2 = a.get(i);
                }
            } else {
                voteCount1--;
                voteCount2--;
            }

            i++;
        }

        // if vote 1 >n/3
        // if vote2 >n/3

        int count1 = 0;
        int count2 = 0;

        for (i = 0; i < n; i++) {

            if (a.get(i) == vote1) {
                count1++;
            } else if (a.get(i) == vote2) {
                count2++;
            }
        }

        //

        if (count1 > n / 3) {
            return vote1;
        }
        if (count2 > n / 3) {
            return vote2;
        }

        return -1;
    }
}
