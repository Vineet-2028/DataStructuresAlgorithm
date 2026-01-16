// 1365. How Many Numbers Are Smaller Than the Current Number

// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
// That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
// Return the answer in an array.

// Solution In JAVA

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int j = 0;
        while(j < n){
            int count = 0;
            for(int i=0;i<n;i++){
                if(nums[i] < nums[j]){
                    count++;
                }
            }
            ans[j] = count;
            j++;
        }
        return ans;
    }
}

// Approach:-

// For each number nums[j] in the array:
// Initialize a count = 0
// Loop through all numbers nums[i] and count how many are smaller than nums[j]
// Store the count in the answer array.
// Repeat for all elements in nums

// Complexity Analysis:-
// Time	O(n²) → Nested loops for counting
// Space	O(n) → Result array

// Note: This solution is not optimal for large inputs.
// For optimized approaches:
// Sorting + HashMap → O(n log n)
// Counting Sort / Frequency Array → O(n) if numbers are within a small range (e.g., 0–100)
