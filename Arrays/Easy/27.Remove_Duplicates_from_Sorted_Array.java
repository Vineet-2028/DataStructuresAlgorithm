// 26. Remove Duplicates from Sorted Array

// Given an integer array nums sorted in non-decreasing order, 
// remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same.
// Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates,
// return the number of unique elements k.
// The first k elements of nums should contain the unique numbers in sorted order.
// The remaining elements beyond index k - 1 can be ignored.

// SOlution In JAVA:-

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;        
    }
}

// Approach:-

// Use two pointers:
// i → points to the position where the next unique element should go.
// j → scans through the array.

// Iterate through nums:-

// If nums[j] != nums[i-1], it's a new unique element:
// Assign it to nums[i] and increment i.
// Return i as the new length of the array.
// This works because the array is sorted, so duplicates are consecutive.

// Time Complexity:-

// O(n) — each element is visited exactly once.

// Space Complexity
// O(1) — in-place modification, no extra space.
