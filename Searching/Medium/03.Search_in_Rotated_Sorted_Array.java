// 33. Search in Rotated Sorted Array
  
// There is an integer array nums sorted in ascending order (with distinct values).
// Prior to being passed to your function, nums is possibly left rotated at an 
// unknown index k (1 <= k < nums.length) such that the resulting array is
// [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
// For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target, 
// return the index of target if it is in nums, or -1 if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity.

// Solution In JAVA:-

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) return mid;
            if(nums[low] <= nums[mid]){
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else{
                if(nums[high] >= target && nums[mid] <= target){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}

// Approach (Binary Search on Rotated Sorted Array):-

// The array is sorted but rotated at some pivot.
// We use a modified binary search to find the target efficiently.

// At each step:-

// Compute mid.
// If nums[mid] == target, return mid.
// Determine which half is sorted:-
// Left half sorted if nums[low] <= nums[mid]
// Otherwise, right half sorted
// Check whether the target lies within the sorted half:-
// If yes → search that half
// If no → search the other half
// Continue until low > high.
// If the target is not found, return -1.
// This works because at least one half of the array is always sorted, even after rotation.

// Time Complexity:-

// O(log n)
// Each iteration halves the search space, just like binary search.

// Space Complexity:-

// O(1)
// Only constant extra space is used (no recursion or auxiliary data structures).
