// 81. Search in Rotated Sorted Array II

// There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
// Before being passed to your function, nums is rotated at an unknown pivot index k 
// (0 <= k < nums.length) such that the resulting array is 
// [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
// For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
// Given the array nums after the rotation and an integer target, 
// return true if target is in nums, or false if it is not in nums.
// You must decrease the overall operation steps as much as possible.

// Solution In JAVA:-

class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }
            else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && nums[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[high] >= target && nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}

// Approach (Binary Search in Rotated Sorted Array with Duplicates):-

// This problem is an extension of binary search where the array is sorted, rotated, and may contain duplicates.
// Key Observations:-
// At least one half of the array is sorted, but duplicates can make it ambiguous.
// When nums[low] == nums[mid] == nums[high], we cannot determine the sorted half.
// In this case, safely shrink the search space by doing low++ and high--.

// Algorithm Steps:-
// Initialize two pointers: low and high.
// While low <= high:
// Compute mid.
// If nums[mid] == target, return true.
// If nums[low] == nums[mid] == nums[high]:-
// Increment low and decrement high to skip duplicates.
// Else if the left half is sorted:
// Check if the target lies in the left half.
// Narrow the search accordingly.
// Else the right half is sorted:
// Check if the target lies in the right half.
// Narrow the search accordingly.
// If the target is not found, return false.

// Time Complexity:-

// Average Case: O(log n)
// Binary search reduces the search space by half.

// Worst Case: O(n)
// When the array contains many duplicate elements (e.g., [1,1,1,1,1]), we may shrink the range one step at a time.

// Space Complexity:-

// O(1)
// Uses constant extra space.
