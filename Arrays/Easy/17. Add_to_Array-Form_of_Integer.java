// 989. Add to Array-Form of Integer

// The array-form of an integer num is an array representing its digits in left to right order.
// For example, for num = 1321, the array form is [1,3,2,1].
// Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

// Solution IN JAVA:-

class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        int n = nums.length;
        int i = n-1;
        List<Integer> list = new ArrayList<>();
        while(i >= 0 || k > 0){
            if(i >= 0){
                k = k + nums[i];
                i--;
            }
            list.add(k%10);
            k = k/10;
        }
        Collections.reverse(list);
        return list;
    }
}

// Approach:-

// Start from the last digit of nums (rightmost).
// Use k as a carry, adding digits from nums one by one.
// For each digit:
// Add nums[i] to k
// Store k % 10 in the result list
// Update k = k / 10
// Continue until all digits of nums and carry k are processed.
// Reverse the result list to get the correct order.
// This approach avoids converting the array to an integer, making it safe for large numbers.

// Time Complexity (TC):-

// Let:

// n = nums.length
// d = number of digits in k
// O(max(n,log10k))

// Space Complexity (SC):-

// Output list stores the result
// O(n+log10k)
