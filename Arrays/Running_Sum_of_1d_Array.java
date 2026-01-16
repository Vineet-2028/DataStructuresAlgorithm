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
