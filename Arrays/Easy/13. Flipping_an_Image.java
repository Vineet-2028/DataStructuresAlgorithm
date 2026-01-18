// 832. Flipping an Image

// Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
// To flip an image horizontally means that each row of the image is reversed.
// For example, flipping [1,1,0] horizontally results in [0,1,1].
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
// For example, inverting [0,1,1] results in [1,0,0].

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (m + 1) / 2; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][m - 1 - j] ^ 1;
                image[i][m - 1 - j] = temp;
            }
        }
        return image;
    }
}


// Approach:-

// We process the image row by row.
// For each row, we flip and invert simultaneously using a single loop.

// Steps:
// Iterate through each row.
// For each row, iterate only up to (m + 1) / 2:
// Swap the element at index j with the element at index m - 1 - j (horizontal flip).
// Invert both elements at the same time using XOR (^ 1).
// If the row length is odd, the middle element is inverted once automatically.
// The operation is done in-place, so no extra space is used.

// Time Complexity (TC):-
// Let n = number of rows
// Let m = number of columns
// Each row is processed in O(m) time.
// 𝑂(𝑛×𝑚)
	​

// Space Complexity (SC):-
//No extra data structures are used.
// The input array is modified directly.
// 𝑂(1)
	​
// Key Insight:-
// Using (m + 1) / 2 ensures:
// Proper handling of odd-length rows
// The middle element is inverted exactly once
// XOR (^ 1) efficiently toggles 0 ↔ 1
