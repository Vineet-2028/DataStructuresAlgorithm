// 1380. Lucky Numbers in a Matrix

// Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
// A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

// Solution In JAVA:-

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int colIndex = -1;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    colIndex = j;
                }
            }
            boolean isMaxInCol = true;
            for (int k = 0; k < n; k++) {
                if (matrix[k][colIndex] > min) {
                    isMaxInCol = false;
                    break;
                }
            }
            if (isMaxInCol) {
                ans.add(min);
            }
        }
        return ans;
    }
}


// How it works:-

// For each row, find the row minimum and note its column index.
// Check if that element is maximum in its column.
// If yes, it’s a lucky number → add to answer.

// Time Complexity:-

// Row minimum: O(n*m)
// Column check: O(n*m)
// Total TC = O(n*m)

// Space Complexity

// Only the result list → O(min(n, m))
