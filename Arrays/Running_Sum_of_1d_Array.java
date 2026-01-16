// 1480. Running Sum of 1d Array
// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.

// Solution In JAVA

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = nums[i] + sum;
            ans[i]  = sum;
        }
        return ans;
    }
}

// Approach
// Initialize a variable sum to store the cumulative total.
// Traverse the array from left to right.
// Add the current element to sum.
// Store the updated sum in the result array at the same index.

//  Complexity Analysis:-
// Time Complexity: O(n) — single pass through the array
// Space Complexity: O(n) — extra array to store results
