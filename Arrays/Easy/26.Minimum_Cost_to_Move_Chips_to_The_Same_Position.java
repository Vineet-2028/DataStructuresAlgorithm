// 1217. Minimum Cost to Move Chips to The Same Position

// We have n chips, where the position of the ith chip is position[i].
// We need to move all the chips to the same position. In one step, 
// we can change the position of the ith chip from position[i] to:
// position[i] + 2 or position[i] - 2 with cost = 0.
// position[i] + 1 or position[i] - 1 with cost = 1.
// Return the minimum cost needed to move all the chips to the same position.

class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return Math.min(oddCount, evenCount);
    }
}

// Approach:-

// Identify Parity:-
// Chips at even positions can be moved amongst each other at no cost, similarly for odd positions due to the zero-cost of two-position moves.
// The only time a cost is incurred is when moving a chip from an even position to an odd position, or vice versa, as this requires a one-position move.

// Count Parity:-

// Iterate through the array of chip positions.
// Maintain two counters: one for chips at even positions (evenCount) and another for chips at odd positions (oddCount).

// Calculate Minimum Cost:-

// Since moving chips within the same parity group (even to even or odd to odd) costs nothing, 
// the only decision is to determine the lesser cost between moving all even-positioned chips
// to an odd position or moving all odd-positioned chips to an even position.
// The cost is directly proportional to the number of chips being moved. 
// Hence, to minimize the cost, you would move all chips from the smaller group (either oddCount or evenCount) to the larger group.
// Return the Result:
The function returns the smaller of the two counts (evenCount or oddCount), representing the minimum cost based on the number of moves required.
Complexity
Time complexity:
O(N)

Space complexity:
O(1)
