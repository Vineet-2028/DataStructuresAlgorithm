// 875. Koko Eating Bananas

// Koko loves to eat bananas. There are n piles of bananas, 
// the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
// Koko can decide her bananas-per-hour eating speed of k. Each hour, 
// she chooses some pile of bananas and eats k bananas from that pile.
// If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
// Return the minimum integer k such that she can eat all the bananas within h hours.

// Solution In JAVA:-

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int x : piles) {
            max = Math.max(x,max);
        }
        int low = 1;
        int high = max;
        int answer = max;

        while(low <= high){
            int mid = low + (high - low)/2;
            long sum = 0;

            for(int i=0;i<piles.length;i++){
                sum += (piles[i] + mid -1)/mid;
            }

            if(sum <= h){
                answer = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return answer;
    }
}

// Approach:-

// Observation:-

// Minimum eating speed is 1.
// Maximum eating speed is the largest pile max(piles).

// Binary Search on Answer:-

// Use binary search to find the smallest k such that Koko can finish all bananas within h hours.
// Set low = 1 and high = max(piles).

// Checking Condition:-
// For a candidate speed mid, calculate the total hours needed:
// for(int i=0;i<piles.length;i++){
// sum += (piles[i] + mid - 1)/mid;
// }
// (piles[i] + mid - 1) / mid is equivalent to ceil(piles[i] / mid) to compute hours.
// If sum <= h, try a smaller speed (high = mid - 1).
// Otherwise, increase the speed (low = mid + 1).
// Return the minimum speed found.

// Time Complexity:-

// Binary search range: 1 to max(piles) → O(log(maxPile)).
// For each mid, we scan all piles → O(n), where n = piles.length.

// Overall complexity:-
// O(n⋅log(maxPile))

// Space Complexity:-

// Only a few integer variables are used, no extra arrays.
// Overall space: O(1) (constant space).
