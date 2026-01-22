// 189. Rotate Array

// Given an integer array nums, rotate the array to the 
// right by k steps, where k is non-negative.

// SOlution In JAVA:-

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int low, int high) {
        while (low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}

// Approach (Array Rotation Using Reversal):-

// To rotate the array to the right by k steps efficiently, we use the reversal technique.

// Key Idea:-
// Rotating the array can be broken down into three reversals.

// Steps:-
// Normalize k
// Since rotating by n (array length) results in the same array, compute
// k = k % n
// Reverse the entire array
// This brings the last k elements to the front, but in reversed order.
// Reverse the first k elements
// This restores the correct order of the rotated part.
// Reverse the remaining n - k elements
// This restores the order of the remaining elements.

// Example:
// nums = [1,2,3,4,5,6,7], k = 3

// Step 1: Reverse whole array
// [7,6,5,4,3,2,1]

// Step 2: Reverse first k elements
// [5,6,7,4,3,2,1]

// Step 3: Reverse remaining elements
// [5,6,7,1,2,3,4]

// Time Complexity:-

// O(n)
// Each element is visited a constant number of times during reversals.

// Space Complexity:-

// O(1)
// The rotation is done in-place without using extra space.
