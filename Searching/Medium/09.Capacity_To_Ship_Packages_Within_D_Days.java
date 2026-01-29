// 1011. Capacity To Ship Packages Within D Days

// A conveyor belt has packages that must be shipped from one port to another within days days.
// The ith package on the conveyor belt has a weight of weights[i]. 
// Each day, we load the ship with packages on the conveyor belt (in the order given by weights).
// We may not load more weight than the maximum weight capacity of the ship.
// Return the least weight capacity of the ship that will result in all the
// packages on the conveyor belt being shipped within days days.

// Solution In JAVA:-

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0, sum = 0;
        for (int w : weights) {
            max = Math.max(max, w);
            sum += w;
        }
        int low = max, high = sum;
        int answer = sum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int daysNeed = 1;
            int current = 0;
            for (int weight : weights) {
                current += weight;
                if (current > mid) {
                    daysNeed++;
                    current = weight;
                }
            }
            if (daysNeed <= days) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }
}

// Approach:-

// Understand the range of possible ship capacities:-

// The ship must at least carry the heaviest package, so minCapacity = max(weights).
// At most, the ship could carry all packages in one go, so maxCapacity = sum(weights).

// Binary Search on Capacity:-

// Use binary search to find the minimum capacity that can ship all packages within the given number of days.
// Set low = max(weights) and high = sum(weights).

// Simulate shipping with a candidate capacity (mid):-

// Iterate through weights, summing weights until adding the next package exceeds mid.
// If it exceeds, increment daysNeed and start a new shipment from the current package.
// If daysNeed ≤ days, mid is a feasible capacity, so try a smaller capacity (high = mid - 1).
// If daysNeed > days, mid is too small, try a larger capacity (low = mid + 1).
// Return the minimum feasible capacity.

// Time Complexity:-

// Binary Search: The search space is from max(weights) to sum(weights), so the number of iterations is O(log(sum - max)).
// Simulation: For each candidate mid, we scan all weights → O(n).

// Overall:
// O(n⋅log(sum(weights)−max(weights)))

// Space Complexity:-

// Only a few integer variables are used (low, high, mid, current, daysNeed, etc.).
// Overall: O(1) (constant space).

// This is an efficient approach using binary search + greedy simulation
