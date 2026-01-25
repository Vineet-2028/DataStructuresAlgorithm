// 1539. Kth Missing Positive Number

// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
// Return the kth positive integer that is missing from this array.

// Solution In JAVA:-

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low + k;
    }
}

// Approach:-

// Define missing count:-
// For a sorted array arr, let
// missing(i)=arr[i]−(i+1)
// This represents the number of positive integers missing up to index i.

// Binary Search:-

// Search for the first index i such that missing(i) ≥ k.
// If missing(i) < k, move low = mid + 1
// Otherwise, move high = mid - 1

// Compute k-th missing number:-

// Once binary search ends, the k-th missing number is:-

// k-th missing=k+low
// low = number of array elements before k-th missing
// k = count of missing numbers we want
// Return the result.
// This avoids generating missing numbers explicitly and works in logarithmic time.

// Time Complexity:-

// Binary search over arr → O(log n)
// No loops over k, no extra array generation
// Total: O(log n)

// Space Complexity:-

// Only a few variables (low, high, mid, missing) are used
// No extra arrays or lists
// Total: O(1)
