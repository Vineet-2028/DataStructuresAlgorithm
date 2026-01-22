// 55. Jump Game

// You are given an integer array nums. You are initially positioned at the array's first index,
// and each element in the array represents your maximum jump length at that position.
// Return true if you can reach the last index, or false otherwise.

class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int i = 0;
        int max = 0;

        while (i < n) {
            if (i > max) return false;
            max = Math.max(max, i + nums[i]);
            i++;
        }
        return true;
    }
}

// Approach:-

// Initialize max = 0 to store the farthest reachable index.
// Loop through the array:
// If i > max, we cannot reach this index → return false.
// Update max = Math.max(max, i + nums[i]).
// After the loop, return true (we never got stuck).

// Time complexity: O(n)
// Space complexity: O(1)
