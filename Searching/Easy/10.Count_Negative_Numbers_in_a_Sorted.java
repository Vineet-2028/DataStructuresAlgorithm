// 1351. Count Negative Numbers in a Sorted Matrix

// Given a m x n matrix grid which is sorted in non-increasing order 
// both row-wise and column-wise, return the number of negative numbers in grid.

// Solution In JAVA:-

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0) {
                    count += grid[i].length - j;
                    break;
                }
            }
        }       
        return count;
    }
}

// Approach:-

// Once you find a negative number in a row, all elements to its right are also negative
// So you don’t need to scan the rest of that row

// Algorithm:-

// Initialize count = 0
// Loop through each row:
// Loop through each column in that row:
// If grid[i][j] < 0:
// All remaining elements in this row are negative → add (grid[i].length - j) to count
// Break to next row
// Return count

// Key Idea:-

// Exploit the sorted property to avoid counting each negative individually

// Time Complexity:-

// Worst case: O(m * n) if all numbers are positive until the last column
// Best case: O(m + n) if matrix is mostly negative or mostly positive
// Average case depends on matrix content, but this is very efficient because of the break

// Space Complexity:-
// Only count variable used → O(1)
