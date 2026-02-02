// 1502. Can Make Arithmetic Progression From Sequence

// A sequence of numbers is called an arithmetic progression 
// if the difference between any two consecutive elements is the same.
// Given an array of numbers arr, return true if the array can be 
// rearranged to form an arithmetic progression. Otherwise, return false.

 // Solution In JAVA:-

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        if (n <= 2) return true;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if ((max - min) % (n - 1) != 0) return false;

        int diff = (max - min) / (n - 1);
        if (diff == 0) return true;

        boolean[] seen = new boolean[n];

        for (int num : arr) {
            int idx = (num - min) / diff;
            if ((num - min) % diff != 0 || idx >= n || seen[idx]) {
                return false;
            }
            seen[idx] = true;
        }
        return true;
    }
}

// Approach:-

// In an arithmetic progression:
// min + i * diff must exist for every i

// Steps:-

// Find min and max element.
// Check if (max - min) is divisible by (n - 1).
// If not → ❌ cannot form AP.
// Compute diff = (max - min) / (n - 1).
// Use a boolean array (or in-place marking) to verify all expected values exist.

// Time Complexity:-

// O(n)

// Space Complexity:-

// O(n) (for the seen array)
