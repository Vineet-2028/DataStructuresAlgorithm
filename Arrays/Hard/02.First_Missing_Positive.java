// 41. First Missing Positive

// Given an unsorted integer array nums.
// Return the smallest positive integer that
// is not present in nums.
// You must implement an algorithm that
// runs in O(n) time and uses O(1) auxiliary space.

// Solution In JAVA:-

 class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] arr = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0 && nums[i] < arr.length)
                arr[nums[i]] = true;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == false)
                return i;
        }
        return arr.length;
    }
 }


