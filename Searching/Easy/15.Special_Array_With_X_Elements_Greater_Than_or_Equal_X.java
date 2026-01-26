// 1608. Special Array With X Elements Greater Than or Equal X

// You are given an array nums of non-negative integers. 
// nums is considered special if there exists a number x 
// such that there are exactly x numbers in nums that are greater than or equal to x.
// Notice that x does not have to be an element in nums.
// Return x if the array is special, otherwise, return -1. 
// It can be proven that if nums is special, the value for x is unique.

// SOlution In JAVA:-

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int x = n - i; 
            if (nums[i] >= x) {
                if (i == 0 || nums[i - 1] < x) {
                    return x;
                }
            }
        }
        return -1;
    }
}

// Approach (Sorting + Single Pass):-

// Sort the array in ascending order.

// Loop through the array:-

// Let x = n - i → number of elements from index i to the end (≥ nums[i]).
// If nums[i] >= x and (i == 0 or nums[i-1] < x) → x is the answer.
// If no such x is found → return -1.
// Efficient: avoids counting manually for each candidate x.

// Complexity Analysis:-
// Time	O(n log n) → sorting + single pass
// Space	O(1) → no extra space
