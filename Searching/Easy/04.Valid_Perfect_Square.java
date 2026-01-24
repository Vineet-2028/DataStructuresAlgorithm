// 367. Valid Perfect Square

// Given a positive integer num, return true if num is a perfect square or false otherwise.
// A perfect square is an integer that is the square of an integer.
// In other words, it is the product of some integer with itself.
// You must not use any built-in library function, such as sqrt.

// Solution In JAVA:-

class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long y = (long) mid * mid;
            if (y < num) {
                low = mid + 1;
            } else if (y > num) {
                high = mid - 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}

// Approach:-

// We use Binary Search to determine whether a number num is a perfect square.

// Initialize two pointers:-

// low = 1
// high = num

// While low <= high:-

// Compute mid = low + (high - low) / 2
// Compute mid * mid using long to avoid overflow
// If mid * mid == num, return true (perfect square found)
// If mid * mid < num, move low = mid + 1
// If mid * mid > num, move high = mid - 1
// If no exact square is found, return false.
// This approach leverages the sorted nature of square numbers and efficiently narrows the search space.

// Time Complexity:-

// O(log num) – Binary search halves the search space in each iteration.

// Space Complexity:-

// O(1) – Only constant extra space is used.

// Notes:-

// Using long for mid * mid prevents integer overflow for large num.
// This method is optimal for large inputs compared to iterative checking.
