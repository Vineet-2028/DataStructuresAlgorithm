// 73. Set Matrix Zeroes

// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
// You must do it in place.

// Solution In JAVA:-

class Solution {
    public void setZeroes(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        boolean firstRow = false;
        boolean firstCol = false;
        for(int i=0;i<c;i++){
            if(arr[0][i] == 0){
                firstRow = true;
                break;
            }
        }
        for(int i=0;i<r;i++){
            if(arr[i][0] == 0){
                firstCol = true;
                break;
            }
        }
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }
        if (firstRow) {
            for (int j = 0; j < c; j++) {
                arr[0][j] = 0;
            }
        }
        if (firstCol) {
            for (int i = 0; i < r; i++) {
                arr[i][0] = 0;
            }
        }
    }
}

// Approach (In-Place, Constant Space):-

// We use the first row and first column as markers to avoid using extra space.
// Key Idea
// If arr[i][j] == 0, then:
// mark its row → arr[i][0] = 0
// mark its column → arr[0][j] = 0
// The first row and first column themselves need special handling, so we track them using two boolean variables.

// Steps:-

// Check first row
// If any element in the first row is 0, set firstRow = true.
// Check first column
// If any element in the first column is 0, set firstCol = true.
// Mark rows and columns
// Traverse the matrix from (1,1) onward.
// For any 0, mark its row and column using the first row/column.
// Set zeroes using markers
// Traverse again from (1,1).
// If either the row marker or column marker is 0, set the cell to 0.
// Handle first row and first column
// If firstRow is true → set entire first row to 0
// If firstCol is true → set entire first column to 0

// Time Complexity:-

// Let:
// r = number of rows
// c = number of columns
// The matrix is traversed a constant number of times.

// Time Complexity:-
// O(r × c)

// Space Complexity:-

// Only two boolean variables are used (firstRow, firstCol)
// No extra arrays or data structures

// Space Complexity:-
// O(1)
