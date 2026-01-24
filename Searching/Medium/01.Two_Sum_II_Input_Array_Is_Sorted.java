// 167. Two Sum II - Input Array Is Sorted

// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
// find two numbers such that they add up to a specific target number. 
// Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
// Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
// The tests are generated such that there is exactly one solution. You may not use the same element twice.
// Your solution must use only constant extra space.

// Solution In JAVA:-

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int low = 0;
        int high = n-1;
        int[] ans = new int[2];
        while(low < high){
            int sum = numbers[low] + numbers[high];
            if(sum == target){
                ans[0] = low + 1;
                ans[1] = high + 1;
                return ans;
            }
            else if(sum < target){
                low++;
            }
            else{
                high--;
            }
        }
        return ans;
    }
}

// Approach:-

// We use the two-pointer technique because the input array is sorted.

// Initialize two pointers:-

// low at the start of the array
// high at the end of the array

// While low < high:-

// Compute the sum of the numbers at the two pointers
// If the sum equals the target, return the indices (1-based)
// If the sum is less than the target, increment low to increase the sum
// If the sum is greater than the target, decrement high to decrease the sum
// This guarantees finding the two numbers whose sum equals the target.
// This approach avoids extra space and works in linear time due to the sorted nature of the array.

// Time Complexity:-

// O(n) – Each pointer moves at most n times.

// Space Complexity:-

// O(1) – No extra space besides the output array.
