// 238. Product of Array Except Self

// Given an integer array nums, return an array answer such that answer[i] 
// is equal to the product of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.

// Solution In JAVA:-

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n]; 
        int[] left = new int[n];    
        int[] right = new int[n];  
        left[0] = 1;
        for(int i=1;i<n;i++) left[i] = left[i-1]*nums[i-1]; 
        right[n-1] = 1;
        for(int i=n-2;i>=0;i--) right[i] = right[i+1]*nums[i+1]; 
        int k=0;
        while(k<n){
            arr[k] = left[k]*right[k];
            k++;
        } 
        return arr;
    }
}

// Approach:-

// Left Product Array
// left[i] stores the product of all elements before index i.
// Initialize left[0] = 1 because there are no elements before the first element.
// Right Product Array
// right[i] stores the product of all elements after index i.
// Initialize right[n-1] = 1 because there are no elements after the last element.
// For each index i, multiply left[i] * right[i] to get the final product except self.

// Time & Space Complexity:-
// Time	O(n)
// Space	O(n)
// Note: Space can be optimized to O(1) by using the result array and a running suffix product.
