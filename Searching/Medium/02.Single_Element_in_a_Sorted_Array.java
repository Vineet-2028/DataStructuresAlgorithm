// 540. Single Element in a Sorted Array

// You are given a sorted array consisting of only integers where
// every element appears exactly twice, except for one element which appears exactly once.
// Return the single element that appears only once.
// Your solution must run in O(log n) time and O(1) space.

// SOlution In JAVA:-
  
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];
        int low = 1;
        int high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) ||
                    (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

// Approach:-

// We are given a sorted array where every element appears exactly twice, 
// except for one element that appears only once. The goal is to find that single element in O(log n) time.

// Key Observation:-

// Before the single element, pairs start at even indices
// After the single element, pairs start at odd indices
// This pattern allows us to use binary search.

// Steps

// Handle edge cases:-

// If the array has only one element, return it.
// If the first or last element is unique, return it directly.

// Binary Search:-

// Search in the range [1, n - 2] to safely compare neighbors.
// At each mid:
// If nums[mid] is different from both neighbors, it is the answer.
// If the index parity and pairing are correct (even index matches right OR odd index matches left), move right.
// Otherwise, move left.
// Continue until the single element is found.

// Time Complexity:-

// O(log n)
// Binary search halves the search space at every step.

// Space Complexity:-
// O(1)
// No extra space is used apart from a few variables.
