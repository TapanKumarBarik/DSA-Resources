/*
 * Problem Description
 * Given an array A, find the size of the smallest subarray such that it
 * contains at least one occurrence of the maximum value of the array
 * 
 * and at least one occurrence of the minimum value of the array.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= |A| <= 2000
 * 
 * 
 * 
 * Input Format
 * First and only argument is vector A
 * 
 * 
 * 
 * Output Format
 * Return the length of the smallest subarray which has at least one occurrence
 * of minimum and maximum element of the array
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [1, 3, 2]
 * Input 2:
 * 
 * A = [2, 6, 1, 6, 9]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 2
 * Output 2:
 * 
 * 3
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * Take the 1st and 2nd elements as they are the minimum and maximum elements
 * respectievly.
 * Explanation 2:
 * 
 * Take the last 3 elements of the array.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

//1

public class Solution {
    public int solve(ArrayList<Integer> A) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int n = A.size();
        for (int i = 0; i < n; i++) {
            int num = A.get(i);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (max == min)
            return 1;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = A.get(i);
            if (num == max) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    count++;
                    if (A.get(j) == min) {
                        res = Math.min(res, count);
                    }
                }
            }
            if (num == min) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    count++;
                    if (A.get(j) == max) {
                        res = Math.min(res, count);
                    }
                }
            }
        }

        return res;
    }
}

// 2
public class Solution {
    public int solve(ArrayList<Integer> A) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int n = A.size();
        for (int i = 0; i < n; i++) {
            int num = A.get(i);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int minIndex = -1;
        int maxIndex = -1;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = A.get(i);
            if (num == max) {
                maxIndex = Math.max(maxIndex, i);
            }
            if (num == min) {
                minIndex = Math.max(minIndex, i);
            }

            if (minIndex != -1 && maxIndex != -1) {

                int res1 = Math.abs(maxIndex - minIndex) + 1;
                res = Math.min(res, res1);
            }
        }

        return res;
    }
}
