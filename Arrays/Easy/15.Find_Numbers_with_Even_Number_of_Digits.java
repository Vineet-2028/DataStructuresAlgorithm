// 1295. Find Numbers with Even Number of Digits

// Given an array nums of integers, return how many of them contain an even number of digits.

// Solution In JAVA:-

class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int count = 0;

            while (temp > 0) {
                count++;
                temp = temp / 10;
            }

            if (count % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}

// Approach:- 
// Iterate through each number in the array.
// For each number:-
// Count the number of digits by repeatedly dividing the number by 10.
// If the digit count is even, increment the result counter.
// Return the final count.
// This approach avoids converting numbers to strings and works efficiently using basic arithmetic.

// Algorithm:-
// Initialize ans = 0
// For each number in nums:
// Set count = 0
// While the number is greater than 0:
// Increment count
// Divide the number by 10
// If count is even, increment ans
// Return ans

// Time Complexity (TC):-

// Let:
// n = number of elements in the array
// d = number of digits in a number
// O(n×d)
	​
// Space Complexity (SC):-
// No extra data structures are used.
// O(1)
