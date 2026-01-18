// 867. Transpose Matrix

// Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal,
// switching the matrix's row and column indices.

// Solution In JAVA:-

class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}

// Approach:-

// Let the original matrix have:
// n rows
// m columns
// The transposed matrix will have:
// m rows
// n columns
// Create a new matrix ans[m][n].
// Traverse the original matrix:
// Assign ans[j][i] = matrix[i][j]
// Return the transposed matrix.

// Algorithm:-

// Initialize ans with size [m][n]

// For each element (i, j) in the original matrix:
// Place it at (j, i) in the result matrix
// Return ans

// Time Complexity (TC):-

// Let:
// n = number of rows
// m = number of columns
// Each element is visited once.
// O(n×m)
​
// Space Complexity (SC):-

// A new matrix of size m × n is created.
// O(n×m)​
