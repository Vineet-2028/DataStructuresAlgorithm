// 1572. Matrix Diagonal Sum

// Given a square matrix mat, return the sum of the matrix diagonals.
// Only include the sum of all the elements on the primary diagonal and all
// the elements on the secondary diagonal that are not part of the primary diagonal.

class Solution{
    public int diagonalSum(int[][] mat) {
        int res = 0;
        int n = mat.length;
        for (int i=0; i<n; i++) {
            res += mat[i][i];  
            res += mat[n-1-i][i];  
        }
        return n % 2 == 0 ? res : res - mat[n/2][n/2];  
    }
}

//  Approach:-

// Traverse the matrix using a single loop.
// For each index i:-
// Add the primary diagonal element → mat[i][i]
// Add the secondary diagonal element → mat[n - 1 - i][i]
// If n is odd, the middle element is counted twice, so subtract it once.

// Time Complexity (TC):-

// Single loop over n elements
// O(n)
	​
// Space Complexity (SC)
// No extra data structures used
// O(1)
