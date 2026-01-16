// 1672. Richest Customer Wealth
// You are given an m x n integer grid accounts where accounts[i][j] is the amount of
// money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. 
// The richest customer is the customer that has the maximum wealth.

// Solution In JAVA

class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int[] ans = new int[m];
        for(int i=0;i<m;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum = sum + accounts[i][j];
            }
            ans[i] = sum;
        }
        int max = ans[0];
        for(int i=0;i<m;i++){
            if(max < ans[i]){
                max = ans[i];
            }
        }
        return max;
    }
}

// Explanation :-

// Each row in the accounts array represents a customer, and each column represents the amount of money that customer has in a particular bank.
// The wealth of a customer is the sum of all values in their row.

//  To solve this problem:-

// Loop through each customer (row).
// For every customer, calculate the sum of money across all banks.
// Store each customer’s total wealth.
// Traverse all computed wealth values and return the maximum one.

// Approach:- 

// Use a nested loop
// Outer loop → iterate through customers.
// Inner loop → calculate total wealth for the current customer.
// Keep track of the maximum wealth found.

// ⏱️ Complexity Analysis
// Time Complexity: O(m × n)
// Where m is the number of customers and n is the number of banks.
// Space Complexity: O(m)
// Used to store the wealth of each customer.
