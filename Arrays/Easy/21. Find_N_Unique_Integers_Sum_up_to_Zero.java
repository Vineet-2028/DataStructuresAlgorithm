// 1304. Find N Unique Integers Sum up to Zero

// Given an integer n, return any array containing n unique integers such that they add up to 0.

// Solution In JAVA:- 

class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int idx = 0;
        for (int i = 1; i <= n / 2; i++) {
            ans[idx++] = i;
            ans[idx++] = -i;
        }
        if (n % 2 == 1) {
            ans[idx] = 0;
        }
        return ans;
    }
}

// Approach:-

// To make the sum zero, add numbers in pairs: +x and -x

// Each pair contributes 0 to the sum.
// If n is odd, include a single 0.

// This guarantees:-

// All elements are unique
// Sum of array is zero

// Time Complexity (TC):-

// Single loop over n
// TC = O(n)

// Space Complexity (SC):-

// Output array of size n
// SC = O(n)
