// 54. Spiral Matrix

// Given an m x n matrix, return all elements of the matrix in spiral order.

// Solution In JAVA:-

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;
        List<Integer> list = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}

// Approach:-

// We use four pointers to define the current boundaries of the matrix that need to be traversed:

// top → initial top row index (0)
// bottom → initial bottom row index (n-1)
// left → initial left column index (0)
// right → initial right column index (m-1)
// We iterate until the top pointer crosses bottom and left crosses right.

// Steps:-

// Traverse Top Row (Left → Right)
// Iterate i = left to right.
// Add matrix[top][i] to the result.
// Move top pointer down (top++).
// Traverse Right Column (Top → Bottom)
// Iterate i = top to bottom.
// Add matrix[i][right] to the result.
// Move right pointer left (right--).
// Traverse Bottom Row (Right → Left) (only if top <= bottom)
// Iterate i = right to left.
// Add matrix[bottom][i] to the result.
// Move bottom pointer up (bottom--).
// Traverse Left Column (Bottom → Top) (only if left <= right)
// Iterate i = bottom to top.
// Add matrix[i][left] to the result.
// Move left pointer right (left++).
// Repeat the above steps until top > bottom or left > right.

// Time Complexity (TC):-

// Each element is visited exactly once.
// For an n x m matrix, there are n*m elements.
// TC = O(n * m)

// Space Complexity (SC):-

// We use a list to store the result of size n*m.
// No extra auxiliary data structures are used.
// SC = O(n * m) (for the result list)
// If we ignore the result list, SC = O(1).

// Key Points / Edge Cases:-

// Single row or single column matrices.
// Empty matrix (matrix.length == 0).
// Rectangular matrices (n != m).
// Check top <= bottom and left <= right before traversing bottom row or left column to avoid duplicates.
