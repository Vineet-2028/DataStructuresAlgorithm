// 69. Sqrt(x)

// Given a non-negative integer x, return the square root of x 
// rounded down to the nearest integer. The returned integer should be non-negative as well.
// You must not use any built-in exponent function or operator.
// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

// Solution In JAVA:-

class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long y = (long) mid * mid;
            if (y < x) {
                ans = mid;
                low = mid + 1;
            } else if (y > x) {
                high = mid - 1;
            }
            else{
                return mid;
            }
        }
        return ans;
    }
}

// Approach:-

// We use Binary Search to compute the integer square root of a non-negative integer x.
// The square root of x always lies in the range [0, x]
// At each step, we pick a middle value mid and compare mid * mid with x
// If mid * mid == x, mid is the exact square root
// If mid * mid < x, mid is a possible answer, so we store it and search the right half
// If mid * mid > x, we search the left half
// We continue until the search space is exhausted
// To avoid integer overflow, we compute mid * mid using long.
// The variable ans keeps track of the floor value of √x when an exact square root does not exist.

// Time Complexity:-

// O(log x)
// Binary search reduces the search space by half in each iteration.

// Space Complexity

// O(1)
// Only constant extra space is used.
