// 852. Peak Index in a Mountain Array

// You are given an integer mountain array arr of length n
// where the values increase to a peak element and then decrease.
// Return the index of the peak element.
// Your task is to solve it in O(log(n)) time complexity.

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}

// Approach:-

// Observations:-

// arr[i] < arr[i + 1] → you are in the increasing part, move right
// arr[i] > arr[i + 1] → you are in the decreasing part, move left or stay
// The peak is where arr[i] > arr[i + 1] and arr[i] > arr[i - 1]

// Binary Search Steps:-

// Initialize pointers:-

// start = 0, end = arr.length - 1

// While start < end:-

// Compute mid = start + (end - start)/2
// Compare arr[mid] and arr[mid + 1]:
// If arr[mid] < arr[mid + 1] → peak is right, set start = mid + 1
// Else → peak is left or mid, set end = mid
// Loop ends when start == end, which is the peak index

// Intuition:-

// The peak is the only point where the slope changes from + to -
// Binary search exploits this property in O(log n) time

// Time Complexity:-

// Binary search: O(log n)
// Each step halves the search space → logarithmic

// Space Complexity:-

// Only start, end, mid variables used
// O(1) space
