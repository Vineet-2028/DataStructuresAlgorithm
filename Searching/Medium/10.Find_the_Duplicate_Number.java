// 287. Find the Duplicate Number

// Given an array of integers nums containing n + 1 integers 
// where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and
// using only constant extra space.

// Solution In JAVA:-

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast){
                break;
            }
        }

        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }
}

// Approach:-

// Treat the array as a linked list where each index points to nums[index].
// Since there is a duplicate number, a cycle must exist.

// Use Floyd’s Tortoise and Hare algorithm:-

// Move slow by one step and fast by two steps to find the meeting point.
// Reset slow to the start and move both pointers one step at a time.
// The point where they meet again is the duplicate number.

// Time Complexity:-

// O(n)
// Each pointer traverses the array at most a linear number of times.

// Space Complexity:-

// O(1)
// Only constant extra space is used (no additional data structures).
