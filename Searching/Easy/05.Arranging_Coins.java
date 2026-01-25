// 441. Arranging Coins

// You have n coins and you want to build a staircase with these coins.
// The staircase consists of k rows where the ith row has exactly i coins. 
// The last row of the staircase may be incomplete.
// Given the integer n, return the number of complete rows of the staircase you will build.

// Solution In JAVA:-

class Solution {
    public int arrangeCoins(int n) {
        return (int) (Math.sqrt(1 + 8L * n) - 1) / 2;
    }
}

// Approach:-

// We need to find the maximum number of complete rows k such that the total number of coins used
// 1+2+⋯+k  =  k(k+1)/2'
// is less than or equal to n.

// This leads to the inequality:-
// k(k+1)/2 ≤ n

// Rewriting it as a quadratic equation:-
// k^2+k−2n=0

// Using the quadratic formula, we compute:-
// k=sqrt(1+8n)−1/2;
	​
// Since we only need complete rows, we take the floor of the result.

// Time Complexity:-

// O(1)
// Only constant-time mathematical operations are used.

// Space Complexity:-

// O(1)
// No extra space is used.
