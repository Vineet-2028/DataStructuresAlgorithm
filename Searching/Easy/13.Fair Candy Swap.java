// 888. Fair Candy Swap
// Alice and Bob have a different total number of candies. 
// You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i]
// is the number of candies of the ith box of candy that Alice has and bobSizes[j] 
// is the number of candies of the jth box of candy that Bob has.
// Since they are friends, they would like to exchange one candy box each so
// that after the exchange, they both have the same total amount of candy. 
// The total amount of candy a person has is the sum of the number of candies in each box they have.
// Return an integer array answer where answer[0] is the number of candies 
// the box that Alice must exchange, and answer[1] is the number of candies in the
// box that Bob must exchange. If there are multiple answers, you may return any one of them. 
// It is guaranteed that at least one answer exists.

// Solution In JAVA:-

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;
        for (int candies : aliceSizes)
            aliceTotal += candies;
        for (int candies : bobSizes)
            bobTotal += candies;

        Set<Integer> targets = new HashSet<>();
        for (int i = 0, m = aliceSizes.length; i < m; i++)
            targets.add((bobTotal - aliceTotal + 2 * aliceSizes[i]) / 2);

        for (int j = 0, n = bobSizes.length; j < n; j++)
            if (targets.contains(bobSizes[j]))
                return new int[] { (aliceTotal + 2 * bobSizes[j] - bobTotal) / 2, bobSizes[j] };

        return new int[0];
    }
}

// Approach:-

//Calculate total candies for Alice and Bob:-

// int aliceTotal = sum(aliceSizes);
// int bobTotal = sum(bobSizes);

// Use a HashSet to store target values:-
// target = (bobTotal−aliceTotal+2×a)/2
	​
// This is derived from:-
// aliceTotal−a+b=bobTotal−b+a
// Solve for b → the candy Bob needs to swap with Alice’s candy a.

// Iterate Bob’s candies. If a candy exists in the set, return the swap:-

// return new int[] { (aliceTotal + 2 * bobCandy - bobTotal)/2, bobCandy };
// If no swap is found (theoretically impossible by problem constraints), return new int[0].

// Complexity:-
// Time	O(n + m) – traverse both arrays once
// Space	O(n) – store targets for Alice’s candies
