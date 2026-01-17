// 1732. Find the Highest Altitude

// There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
// The biker starts his trip on point 0 with altitude equal 0.
// You are given an integer array gain of length n where gain[i] is the
// net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). 
// Return the highest altitude of a point.

class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int sum = 0;
        int max = 0;
        for(int i=0;i<n;i++) {
            sum = sum + gain[i];
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}

// Approach:-

// Initialize sum = 0 (current altitude) and max = 0 (maximum altitude).
// Iterate through the gain array:
// Add gain[i] to sum to get current altitude.
// Update max if sum is greater than current max.
// Return max.
// This works because the altitude at each point is the cumulative sum of gains, starting from 0.

// Complexity Analysis:-

// Time Complexity: O(n) — Single pass through the array.
// Space Complexity: O(1) — Only two extra variables (sum and max).
