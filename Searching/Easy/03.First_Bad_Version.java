// 278. First Bad Version

// You are a product manager and currently leading a team to develop a new product. 
// Unfortunately, the latest version of your product fails the quality check. 
// Since each version is developed based on the previous version, 
// all the versions after a bad version are also bad.
// Suppose you have n versions [1, 2, ..., n] and you want to 
// find out the first bad one, which causes all the following ones to be bad.
// You are given an API bool isBadVersion(version) which returns whether version is bad. 
// Implement a function to find the first bad version. You should minimize the number of calls to the API.

// SOlution In JAVA:-

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n == 2) {
            if (isBadVersion(1))
                return 1;
            else
                return 2;
        }

        long l = 1, r = n;

        while (l <= r) {
            long mid = (l + r) / 2;

            if (mid == 1)
                return 1;
            else if (mid == n)
                return n;
            else if (isBadVersion((int) mid) && !isBadVersion((int) mid - 1))
                return (int) mid;
            else if (isBadVersion((int) mid))
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }
}

// Approach:-

// This problem is solved using Binary Search.
// The first bad version lies within the range [1, n]
// We maintain two pointers low and high

// While low < high:-

// Compute mid
// If mid is not bad, then the first bad version must be after mid, so move low to mid + 1
// If mid is bad, then mid could be the first bad version, so move high to mid
// The loop ends when low == high, which points to the first bad version
// This approach ensures that we always converge toward the earliest bad version.

// Time Complexity:-

// O(log n)
// Binary search reduces the search space by half in each iteration.

// Space Complexity:-

// O(1)
// Only constant extra space is used.
