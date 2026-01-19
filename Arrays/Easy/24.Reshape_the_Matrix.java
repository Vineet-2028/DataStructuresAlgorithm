// 566. Reshape the Matrix

// In MATLAB, there is a handy function called reshape which can reshape 
// an m x n matrix into a new one with a different size r x c keeping its original data.
// You are given an m x n matrix mat and two integers r and c 
// representing the number of rows and the number of columns of the wanted reshaped matrix.
// The reshaped matrix should be filled with all the elements of the 
// original matrix in the same row-traversing order as they were.
// If the reshape operation with given parameters is possible and legal, 
// output the new reshaped matrix; Otherwise, output the original matrix.

// SOlution IN JAVA:-

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r * c != n * m) {
            return nums;
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            res[i / c][i % c] = nums[i / m][i % m];
        }
        return res;
    }
}

// Approach:-

// Check reshape feasibility:
// Calculate the total number of elements: total = n * m.
// If r * c != total, reshaping is impossible → return original matrix. 

// Flatten mapping using index math:-

// Iterate over the linear index i from 0 to total - 1.
// Map i to the original matrix: nums[i / m][i % m].
// Map i to the reshaped matrix: res[i / c][i % c].
// Return reshaped matrix.
// This avoids using extra space for flattening the matrix, achieving an O(1) extra space solution aside from the output.

// Time Complexity (TC):-

// Iterates through all r * c = n * m elements once.
// TC = O(n * m)

// Space Complexity (SC):-

// Creates a new matrix res of size r * c.
// SC = O(r * c) = O(n * m) (required for output)
// Extra space aside from output = O(1)
