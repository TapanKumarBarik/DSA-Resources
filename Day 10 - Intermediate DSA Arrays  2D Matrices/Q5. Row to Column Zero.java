/*
 * Problem Description
 * You are given a 2D integer matrix A, make all the elements in a row or column
 * zero if the A[i][j] = 0. Specifically, make entire ith row and jth column
 * zero.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= A.size() <= 103
 * 
 * 1 <= A[i].size() <= 103
 * 
 * 0 <= A[i][j] <= 103
 * 
 * 
 * 
 * Input Format
 * First argument is a 2D integer matrix A.
 * 
 * 
 * 
 * Output Format
 * Return a 2D matrix after doing required operations.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * [1,2,3,4]
 * [5,6,7,0]
 * [9,2,0,4]
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * [1,2,0,0]
 * [0,0,0,0]
 * [0,0,0,0]
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column
 * zero.
 * 
 * 
 * 
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided
 * input. Use this to improve your problem understanding and test edge cases
 */

 public class Solution {
    public int[][] solve(int[][] A) {

        int n=A.length;
        int offset=1;
        for(int i=0;i<n;i++){
            if(A[i][0]==0){
                offset=0;
            }
            for(int j=1;j<A[i].length;j++){

                if(A[i][j]==0){
                    A[i][0]=0;
                    A[0][j]=0;
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=A[i].length-1;j>=1;j--){
                if(A[i][0]==0 || A[0][j]==0){
                    A[i][j]=0;
                }
            }
             if(offset==0){
                A[i][0]=0;
            }
        }
        return A;
    }
}
