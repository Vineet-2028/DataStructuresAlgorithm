// 1250. Check If It Is a Good Array

// Given an array nums of positive integers. Your task is to 
// select some subset of nums, multiply each element by an integer 
// and add all these numbers. The array is said to be good if you
// can obtain a sum of 1 from the array by any possible subset and multiplicand.
// Return True if the array is good otherwise return False.

 // Solution In JAVA:-

class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcd = 0;
        for (int num : nums) {
            gcd = GCD(gcd, num);
            if (gcd == 1) {
                return true; 
            }
        }
        return false;
    }

    private int GCD(int a, int b) {
        return b == 0 ? a : GCD(b, a % b);
    }
}

// Approach:-

// Key idea: An array is good if you can write 1 as a linear combination of its elements with integer coefficients.
// By Bézout's identity, this is equivalent to checking if the GCD of all elements is 1.

// Steps in your code:-

// Initialize gcd = 0.
// Iterate through the array, computing gcd = GCD(gcd, num) for each number.
// If gcd ever becomes 1, return true immediately.
// If the loop finishes and gcd > 1, return false.
// This works because the GCD is monotonic decreasing as you include numbers, so as soon as it hits 1, it can’t get any smaller.

// Complexity Analysis:-

// Time Complexity: O(n * log(max(nums)))
// Computing GCD takes O(log(max(nums)))
// We do it for n elements
// Space Complexity: O(1) (or O(log(max(nums))) recursion depth for GCD)
