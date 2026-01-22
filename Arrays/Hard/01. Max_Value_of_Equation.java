// 1499. Max_Value_of_Equation.java

// You are given an array points containing the coordinates of points on a 2D plane, 
// by the x-values, where points[i] = [xi, yi] such that xi < xj for all 1 <= i < j <= points.length.
// You are also given an integer k.
// Return the maximum value of the equation yi + yj + |xi - xj| where |xi - xj| <= k and 1 <= i < j <= points.length.
// It is guaranteed that there exists at least one pair of points that satisfy the constraint |xi - xj| <= k.

// SOlution In JAVA:-

class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = 1;
        int n = points.length;
        while(left < n){
            if(right < left + 1) right = left + 1;
            for(int i=right;i<=n-1;i++){
                if(points[i][0] > points[left][0] + k){
                    break;
                }
                int sum = points[i][1] + points[left][1] + points[i][0] - points[left][0];
                if(sum > max){
                    max = Math.max(max,sum);
                    right = i-1;
                }
            }
            left++;
        }
        return max;
    }
}

// Approach:-

// Use two pointers: left and right
// Iterate left from 0 to n-1
// Move right from left+1 while x[right] - x[left] <= k
// Compute equation: yi + yj + xj - xi (since xj >= xi)
// Update max
// Reset right = i-1 after updating max to optimize inner iterations

// Time Complexity:-
// Worst case O(n²) (because inner loop can run n times for each left)
// This is not optimal — optimal solution uses deque → O(n)

// Space Complexity:-
// O(1) (only a few variables)

// Note on Optimization:-

// The optimal solution for this problem uses a monotonic deque:
// yi−xi+yj+xj=(yi−xi)+(yj+xj)
// You maintain a max heap / deque of (yi - xi) values to get O(n) time.
