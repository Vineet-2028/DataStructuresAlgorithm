// 35. Search Insert Position

// Given a sorted array of distinct integers and a target value, 
// return the index if the target is found. If not,
// return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.

// Solution In JAVA:-

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
}

// Approach:-

// Initialize pointers:-

// low = 0, high = nums.length - 1

// While low <= high:-

// Calculate mid = low + (high - low) / 2

// Compare nums[mid] with target:-

// If equal → return mid
// If nums[mid] < target → move low = mid + 1
// If nums[mid] > target → move high = mid - 1
// If the loop ends, low points to the correct insert position, so return low.

// Intuition:-

// Binary search effectively finds the first element ≥ target.
// If no element is ≥ target, low ends up at the end of the array.

// Time Complexity:-

// Binary search scans log n steps
// Each step does constant work

// Time Complexity:-
// O(log n)

// Space Complexity:-

// Only a few integer variables (low, high, mid)
// No extra data structures
// Space Complexity: O(1)
