// 1854. Maximum Population Year

// You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.
// The population of some year x is the number of people alive during that year. 
// The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. 
// Note that the person is not counted in the year that they die.
// Return the earliest year with the maximum population.

// Solution In JAVA:-

class Solution {
    public int maximumPopulation(int[][] logs) {
        int n = logs.length;
        int ans = Integer.MAX_VALUE;
        int max = 0; 
        for (int i = 0; i < n; i++) {
            int year = logs[i][0];
            int count = 0; 
            for (int j = 0; j < n; j++) {
                if (logs[j][0] <= year && year < logs[j][1]) {
                    count++;
                }
            } 
            if (count > max || (count == max && year < ans)) {
                max = count;
                ans = year;
            }
        }
        return ans;
    }
}

// Approach:- 

// Each log represents a person alive in the range
// [birthYear, deathYear) (death year is exclusive).
// Population can only increase in a birth year, so we only check population counts for birth years.

// For each birth year:
// Count how many people are alive in that year.
// A person is alive in year if
// birth ≤ year < death.

// Track:-

// max → maximum population seen so far
// ans → earliest year with that maximum population
// If two years have the same population, choose the earlier year.
// This brute-force approach is simple and ensures correctness.

// Time Complexity (TC):-

// Outer loop runs for n birth years.
// Inner loop checks all n people.
// TC = O(n²)

// Space Complexity (SC):-

// Only constant extra variables are used.
// SC = O(1)
