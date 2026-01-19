// 1. Two Sum

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// SOlution In JAVA:-

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}

// Approach (HashMap):-

// Iterate through the array once.
// For each element nums[i]:
// Compute the required value:
// rem = target - nums[i]
// Check if rem already exists in the map.
// If yes → we have found the two indices.
// If no → store the current number with its index in the map.

// The map stores:
// number → index

// This guarantees we find the answer in one pass.

// Why This Works:-

// The HashMap allows O(1) average lookup time.
// Ensures we never use the same element twice.
// Returns indices as soon as the valid pair is found.

// Time Complexity (TC):-

// Single pass through the array.
// TC = O(n)

// Space Complexity (SC):-

// HashMap stores up to n elements.
// SC = O(n)
