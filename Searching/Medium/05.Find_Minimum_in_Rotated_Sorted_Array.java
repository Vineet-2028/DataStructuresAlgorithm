// 153. Find Minimum in Rotated Sorted Array


// Suppose an array of length n sorted in ascending order is rotated between 1 and n times. 
// For example, the array nums = [0,1,2,4,5,6,7] might become:
// [4,5,6,7,0,1,2] if it was rotated 4 times.
// [0,1,2,4,5,6,7] if it was rotated 7 times.
// Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time 
// results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
// Given the sorted rotated array nums of unique elements, return the minimum element of this array.
// You must write an algorithm that runs in O(log n) time.

// Solution In JAVA:-

class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[high] < nums[mid]) {
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
}

// Approach (GitHub Explanation):-

// The array is sorted and rotated.
// Use binary search to locate the minimum element.

// Compare nums[mid] with nums[high]:-

// If nums[mid] > nums[high], the minimum lies in the right half
// Otherwise, the minimum lies at mid or in the left half
// Narrow the search space until low == high.
// That index points to the minimum element.

// Time Complexity:-

// O(log n)
// Binary search reduces the search space by half each iteration.

// Space Complexity

// O(1)
// Constant extra space.
