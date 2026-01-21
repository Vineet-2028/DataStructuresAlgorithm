// 73. Set Matrix Zeroes

// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
// You must do it in place.

// Solution In JAVA:-

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ii = new ArrayList<>();
        List<Integer> jj = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    ii.add(i);
                    jj.add(j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == list.get)
            }
        }
    }
}

// Approach (Using Extra Space):-

// The idea is to record the positions of all zeroes first, and then use that information to update the matrix.
// Steps:

// Traverse the matrix.
// Whenever a cell (i, j) contains 0, store:
// row index i in a list rows
// column index j in a list cols
// Traverse the matrix again.
// If the current cell’s row is in rows or its column is in cols, set it to 0.
// This ensures that we don’t modify the matrix while we are still detecting zeroes.

// Time Complexity:-

// Let:
// m = number of rows
// n = number of columns
// First traversal: O(m × n)
// Second traversal: O(m × n)
// O(m × n)

// Space Complexity:-

// We store row and column indices where zeroes occur.
// In the worst case, all cells are zero:
// rows list → up to m entries
// cols list → up to n entries
// O(m + n)

// Notes / Improvements:-

// This solution is easy to understand but uses extra space.
// The problem can be optimized to O(1) space by using the first row and first column as markers.
// Be careful with loop bounds:
// Use i < m for rows
// Use j < n for columns
