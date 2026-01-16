// 1512. Number of Good Pairs
// Given an array of integers nums, return the number of good pairs.
// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

// Solution In JAVA

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getKey();
            int freq = entry.getValue();

            if (freq > 1) {
                ans = ans + freq*(freq-1)/2;
            }
        }
        return ans;
    }
}

//  Approach:- 

//Count frequency of each number
// Use a HashMap where:
// Key → number in the array
// Value → frequency (number of occurrences)
// Calculate good pairs using combinations
// For a number appearing freq times, the number of good pairs is:
// pairs = freq*(freq-1)/2​
// Sum all pairs for all unique numbers to get the final answer.

// Complexity Analysis:- 
// Time	O(n) → one pass to count frequency + one pass over unique numbers
// Space	O(n) → HashMap stores frequency of each number
