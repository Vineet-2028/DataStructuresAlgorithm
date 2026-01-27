// 162. Find Peak Element

// A peak element is an element that is strictly greater than its neighbors.
// Given a 0-indexed integer array nums, find a peak element, and return its index. 
// If the array contains multiple peaks, return the index to any of the peaks.
// You may imagine that nums[-1] = nums[n] = -∞. In other words,
// an element is always considered to be strictly greater than a neighbor that is outside the array.
// You must write an algorithm that runs in O(log n) time.

// Solution In JAVA:-

class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }
}

// Approach:-

// A peak element is greater than its adjacent elements.
// The array boundaries are treated as negative infinity, so a peak always exists.

// We apply binary search based on slope:-

// If nums[mid] < nums[mid + 1], the slope is increasing → peak lies on the right side
// Otherwise, the slope is decreasing → peak lies at mid or on the left side
// Reduce the search space until low == high.
// That index is guaranteed to be a peak element.

// Time Complexity:-
// O(log n) — binary search

// Space Complexity:-
// O(1) — constant extra space
