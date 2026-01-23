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

// Approach:-

// The problem asks for the smallest missing positive integer from an unsorted array.
// Since the smallest missing positive number must lie in the range [1, n+1] (where n is the array length), we use an auxiliary boolean array of size n + 1.

// Iterate through the input array:-

// For every number x such that 0 ≤ x ≤ n, mark arr[x] = true.
// Then iterate from 1 to n:
// The first index i where arr[i] is false is the missing positive number.
// If all values from 1 to n are present, the answer is n + 1.
// This approach trades extra space for simplicity and clarity.

// Time Complexity:-

// O(n)
// One pass to mark the presence of elements
// One pass to find the missing number

// Space Complexity:-

// O(n)
// Extra boolean array of size n + 1
