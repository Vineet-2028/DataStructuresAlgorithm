// 1886. Determine Whether Matrix Can Be Obtained By Rotation

// Given two n x n binary matrices mat and target, 
// return true if it is possible to make mat equal to target 
// by rotating mat in 90-degree increments, or false otherwise.

// SOlution In JAVA:-

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        int count0 = 0, count1 = 0, fin0 = 0, fin1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) count0++;
                else count1++;

                if (target[i][j] == 0) fin0++;
                else fin1++;
            }
        }

        if (count0 != fin0 || count1 != fin1) return false;
        
        for (int r = 0; r < 4; r++) {
            if (isSame(mat, target)) return true;
            mat = rotate(mat);
        }

        return false;
    } 

    private boolean isSame(int[][] a, int[][] b) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    } 
    private int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] res = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - 1 - i] = mat[i][j];
            }
        }
        return res;
    }
}

// Approach:-

//Count Validation (Early Pruning)
// Count the number of 0s and 1s in both mat and target.
// If the counts don’t match, it is impossible to obtain target from mat using rotations → return false.
// Try All 4 Rotations
// A square matrix has only 4 possible orientations: 0°, 90°, 180°, 270°.

// For each rotation:

// Check if the current matrix is equal to target.
// If yes, return true.
// Otherwise, rotate the matrix 90° clockwise and continue.
// Matrix Comparison
// Compare both matrices cell by cell to check equality.
// Rotation Logic
// For a 90° clockwise rotation:
// rotated[j][n - 1 - i] = mat[i][j]

// Why This Works:-

// Rotations preserve the count of elements (0s and 1s).
// Checking all 4 rotations guarantees that if a valid rotation exists, it will be found.
// Early count check avoids unnecessary computation.

// Time Complexity (TC):-

// Each rotation and comparison takes O(n²)
// Total rotations = 4
// TC = O(4 × n²) → O(n²)

// Space Complexity (SC):-
// An extra matrix is used during rotation.
// SC = O(n²)
