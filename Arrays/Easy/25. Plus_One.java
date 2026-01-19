// 66. Plus One

// You are given a large integer represented as an integer array digits, 
// where each digits[i] is the ith digit of the integer. 
// The digits are ordered from most significant to least significant in left-to-right order.
// The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.

// SOlution In JAVA:-

class Solution {
    public int[] plusOne(int[] nums) {
        int n = nums.length;
        int carry = 1; // initial +1
        List<Integer> list = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            int sum = nums[i] + carry;
            list.add(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            list.add(carry); 
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(list.size() - 1 - i);
        }
        return ans;
    }
}

// Approach:-

// Handles cases like [9,9,9] → [1,0,0,0].
// No fixed-size array — automatically adjusts length.
// Only loops once over nums → efficient.

// Time & Space Complexity:-

// Time Complexity: O(n) — iterate once through nums.
// Space Complexity: O(n) — for list and output array.
