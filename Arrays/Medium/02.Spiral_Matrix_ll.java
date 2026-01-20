// 59. Spiral Matrix II

// Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

// Solution In JAVA:-

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int count = 1;
        int left = 0;
        int bottom = n-1;
        int top = 0;
        int right = n-1;
        while(top <= bottom && left <= right){
            for(int i=left;i<=right;i++){
                ans[top][i] = count;
                count++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans[i][right] = count;
                count++;
            }
            right--;
            if(top <= bottom){
                for(int i=right;i>=left;i--){
                    ans[bottom][i] = count;
                    count++;
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    ans[i][left] = count;
                    count++;
                }
                left++;
            }
        }
        return ans;
    }
}

// Approach:-

// Use four pointers (top, bottom, left, right) to define boundaries
// Maintain a counter cnt starting from 1.
// Fill top row, right column, bottom row, and left column in clockwise order.
// Shrink boundaries after each layer (top++, bottom--, left++, right--).
// Stop when top > bottom or left > right.

// Time Complexity (TC):-

// Each cell is filled exactly once.
// For n x n matrix:
// TC = O(n²)

// Space Complexity (SC):-
// Result matrix of size n x n.
// No extra data structures used.
// SC = O(n²) (for the matrix)
