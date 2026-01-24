
// 374. Guess Number Higher or Lower

// We are playing the Guess Game. The game is as follows:
// I pick a number from 1 to n. You have to guess which number I picked (the number I picked stays the same throughout the game).
// Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
// You call a pre-defined API int guess(int num), which returns three possible results:
// -1: Your guess is higher than the number I picked (i.e. num > pick).
// 1: Your guess is lower than the number I picked (i.e. num < pick).
// 0: your guess is equal to the number I picked (i.e. num == pick).
// Return the number that I picked.

// Solution In JAVA:-

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = guess(mid);
            if (result == 1) {
                low = mid + 1;
            } else if (result == -1) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

// Approach:-

// This problem is solved using Binary Search.
// The picked number lies within the range [1, n]
// We maintain two pointers low and high to represent the current search space

// At each iteration:-

// Compute mid
// Call guess(mid) to compare mid with the picked number
// If guess(mid) == 1, the picked number is higher → search the right half
// If guess(mid) == -1, the picked number is lower → search the left half
// If guess(mid) == 0, mid is the picked number and is returned
// The search space is reduced by half on each iteration, ensuring efficiency
// The problem guarantees that a correct answer exists.

// Time Complexity:-

// O(log n)
// Binary search halves the search range in each iteration.

// Space Complexity:-

// O(1)
// Only constant extra space is used.
