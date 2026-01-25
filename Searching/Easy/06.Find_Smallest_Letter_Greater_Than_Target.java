// 744. Find Smallest Letter Greater Than Target

// You are given an array of characters letters that is sorted 
// in non-decreasing order, and a character target. 
// There are at least two different characters in letters.
// Return the smallest character in letters that is lexicographically 
// greater than target. If such a character does not exist, 
// return the first character in letters.

// Solution In JAVA:-

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid]<=target){
                start = mid  + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return letters[start% letters.length];
    }
}

// Approach:-

// The array letters is sorted. We need to find the smallest character strictly greater than target.
// This is a classic binary search problem:
// If letters[mid] ≤ target, the answer must be on the right side
// If letters[mid] > target, store it as a possible answer and move left
// Instead of storing the answer, we let start move to the position of the first character greater than target.
// If no such character exists (i.e., target is ≥ all characters), we wrap around and return the first character using modulo.

// Why modulo works:-
// letters[start % letters.length]
// If a greater letter exists → start is within bounds
// If not → start == letters.length
// Modulo wraps it back to index 0

// Time Complexity:-

// O(log n)
// Binary search over the array.

// Space Complexity:-

// O(1)
// Only constant extra variables are used.
