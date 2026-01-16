// 1470. Shuffle the Array
// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
// Return the array in the form [x1,y1,x2,y2,...,xn,yn].

// Solution in JAVA

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = nums.length;
        int[] ans = new int[m];
        int j = 0;
        for(int i=0;i<m;i++){
            if(i%2 == 0){
                ans[i] = nums[j];
                j++;
            }
            else{
                ans[i] = nums[n];
                n++;
            }
        }
        return ans;
    }
}

// Approach:-

// Create a new array ans to store the shuffled result.
// Use two pointers:
// j to track elements from the first half (x values).
// n (used as an index) to track elements from the second half (y values).

// Traverse the result array:
// If the index is even, take an element from the first half.
// If the index is odd, take an element from the second half.

//  Complexity Analysis:-
// Time Complexity: O(n)
// Each element is processed once.

// Space Complexity: O(2n) → O(n)
// Extra array used to store the result.
