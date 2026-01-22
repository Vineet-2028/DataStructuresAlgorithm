// 198. House Robber

// You are a professional robber planning to rob houses along a street.
// Each house has a certain amount of money stashed, the only constraint 
// stopping you from robbing each of them is that adjacent houses have security 
// systems connected and it will automatically contact the police if two adjacent
// houses were broken into on the same night.
// Given an integer array nums representing the amount of money of each house, 
// return the maximum amount of money you can rob tonight without alerting the police.

// Solution In JAVA:-

class Solution {
    public int rob(int[] nums) {
        int prev2 = 0; 
        int prev1 = 0; 

        for (int num : nums) {
            int curr = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}

// Approach (Optimized Dynamic Programming):-

// This problem is about choosing houses to rob such that:-
// You cannot rob two adjacent houses
// You want to maximize total money

// Key Idea:-

// At each house, you have two choices:
// Skip the current house → keep the max money till previous house (prev1)
// Rob the current house → add current money to the best till two houses ago (prev2 + num)

// You choose the maximum of these two.

// State Meaning:-

// prev1 → maximum money robbed up to the previous house

// prev2 → maximum money robbed up to the house before previous

// Transition:-
// curr = Math.max(prev1, prev2 + num);

// Then shift states:

// prev2 = prev1;
// prev1 = curr;

// Why This Works

// This is a space-optimized version of DP:

// Instead of storing:

// dp[i] = max(dp[i-1], dp[i-2] + nums[i])

// We only keep the last two values, because earlier values are never needed again.

// Dry Run Example:-
// nums = [2,7,9,3,1]

// House	prev2	prev1	curr
  // 2	   0	   0	   2
  // 7	   0	   2     7
  // 9	   2	   7	  11
  // 3	   7	  11	  11
  // 1	   11	  11	  12

// Answer = 12

// Time Complexity:-
// O(n)

// Single pass through the array

// Space Complexity:-
// O(1)
// Only constant extra variables used
