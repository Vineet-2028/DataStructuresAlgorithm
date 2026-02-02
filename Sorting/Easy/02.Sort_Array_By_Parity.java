// 905. Sort Array By Parity

// Given an integer array nums, move all the even integers
// at the beginning of the array followed by all the odd integers.
// Return any array that satisfies this condition.

// Solution In JAVA:-

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            if(nums[start]%2!=0 && nums[end]%2==0 ) {
                swap(start,end,nums); 
                start++;
                end--;
            }
            if(nums[start]%2==0){
                start++; 
            }
            if(nums[end]%2!=0){
                end--;
            }

        }
        return nums;
        
    }

    public void swap(int start,int end,int[] arr){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}

// Approach:-

// Two Pointers (start,end): start is initialized at index 0 while end is initialized at the last index.
// If nums[start] is odd and nums[end] is even, we need to swap the values so that even values 
// can be accumulated at the beginning of the array while the odd values can be moved towards the end.
// We increment & decrement start & end after swap respectively.
// If nums[start] is even: This means we are fine, we can safely increment start.
// If nums[end] is odd: This means we can safely decrement end as well.
// Loop breaks at start>end. So we travel towards the middle of the array from the extreme ends. 
// Hence we can say that after the loop finishes, all even values will be in the 1st
// half of the array and all odd values will be in the 2nd half.
// We can safely return nums at the end. My program utilised in-place sorting 
// but you can initialise another array of same length for the same. 
// Initialising another array can change the space complexity from O(1) to O(N),
// so avoid it if maintaning input integrity is not a condition.

// Complexity:-

// Time complexity: O(N)
// Space complexity: O(1)
