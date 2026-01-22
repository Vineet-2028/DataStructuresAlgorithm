// 34. Find First and Last Position of Element in Sorted Array

//  an array of integers nums sorted in non-decreasing order, 
// find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

// Solution In JAVA:-

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int first = -1;
        int last = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                first = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        low = 0;
        high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return new int[] { first, last };
    }
}

// Approach:-

// First Occurrence
// Perform binary search.
// If nums[mid] == target, record mid as first and continue searching left (high = mid - 1) to find the earliest occurrence.
// If nums[mid] < target, move low = mid + 1.
// If nums[mid] > target, move high = mid - 1.

// Last Occurrence:-

// Perform binary search again.
// If nums[mid] == target, record mid as last and continue searching right (low = mid + 1) to find the latest occurrence.
// Otherwise, adjust low and high as above.
// Return [first, last].

// Time & Space Complexity:-
// Time	O(log n)
// Space	O(1)
// Two binary searches → still O(log n) time.

// Summary:-

// Efficiently finds first and last occurrence using binary search.
// Works for arrays where the target may appear multiple times.
// Returns [-1, -1] if target is not present.
// Space optimized: only uses constant extra variables.
