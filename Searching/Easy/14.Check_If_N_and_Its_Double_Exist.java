// 1346. Check If N and Its Double Exist

// Given an array arr of integers, check if there exist two indices i and j such that :
// i != j
// 0 <= i, j < arr.length
// arr[i] == 2 * arr[j]

// Solution In JAVA:-

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num * 2) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

// Approach (HashSet – Optimal):-

// Use a HashSet to keep track of numbers we’ve seen so far.
// For each number num in the array:
// If 2 * num is in the set → return true
// If num is even and num / 2 is in the set → return true
// Otherwise, add num to the set and continue.
// If no valid pair is found → return false.
// This approach handles negative numbers, zeros, and duplicates correctly.

// Complexity Analysis:-
// Time	O(n) – single pass through the array
// Space	O(n) – for the HashSet
