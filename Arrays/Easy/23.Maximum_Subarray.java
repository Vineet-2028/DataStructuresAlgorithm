// 53. Maximum Subarray

//Given an integer array nums, find the subarray with the largest sum, and return its sum.

// SOlution In JAVA:-

class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}

// Maximum Subarray – Kadane’s Algorithm:- 
// Approach:-

// Initialize:

// sum = 0 → current subarray sum
// max = Integer.MIN_VALUE → maximum sum found so far
// Iterate through the array:
// Add the current element to sum.
// Update max if sum is greater.
// If sum becomes negative, reset it to 0 (start a new subarray).
// Return max after iterating.

// Idea:

// Negative sums cannot help increase a future subarray sum, so reset them.

// Why It Works

// Keeps track of the maximum subarray ending at the current index.
// Negative running sums are discarded because adding them to the next element would decrease the total.
// Guarantees O(n) time complexity.

// Time Complexity:-
// O(n) → single pass through the array.

// Space Complexity:-
// O(1) → only two variables used (sum and max).
