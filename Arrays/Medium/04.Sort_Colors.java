// 75. Sort Colors

// Given an array nums with n objects colored red, white, or blue,
// sort them in-place so that objects of the same color are adjacent, 
// with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

// Solution In JAVA:-

class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                 mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}

// Approach (Dutch National Flag Algorithm):-

// We sort the array containing only 0, 1, and 2 using three pointers:
// low → boundary for 0s
// mid → current element under consideration
// high → boundary for 2s

// Steps:-

// Initialize low = 0, mid = 0, high = n - 1
// Traverse the array while mid <= high
// Based on the value at arr[mid]:-

// If 0:
// Swap arr[low] and arr[mid], then increment both low and mid

// If 1:
// Element is already in correct position, just increment mid

// If 2:
// Swap arr[mid] and arr[high], then decrement high
// (do not increment mid because the swapped value needs checking)

// This ensures:-

// All 0s are moved to the left
// All 2s are moved to the right
// All 1s remain in the middle

// Time Complexity-

// O(n)
// Each element is processed at most once.

// Space Complexity:-
// O(1)
// Sorting is done in-place, using only constant extra space.
