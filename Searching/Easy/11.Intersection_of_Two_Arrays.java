// 349. Intersection of Two Arrays

// Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must be unique and you may return the result in any order.

// SOlution In JAVA:-

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            if (set1.contains(n)) {
                result.add(n);
            }
        }
        int[] ans = new int[result.size()];
        int i = 0;
        for (int n : result) {
            ans[i++] = n;
        }
        return ans;
    }
}

// Approach (Using HashSet):-

// Create a HashSet (set1) and store all elements of nums1 in it.
// This removes duplicates from nums1 and allows fast lookup.
// Create another HashSet (result) to store the intersection elements.
// A Set automatically avoids duplicates.

// Traverse nums2:-
// If an element exists in set1, add it to result.
// Convert the result set into an integer array and return it.

// Time Complexity (TC):-

// Inserting elements into set1: O(n)
// Checking elements of nums2: O(m)

// Overall Time Complexity:-
// O(n+m)
// (Average case, since HashSet operations are O(1))

// Space Complexity (SC):-

// set1 stores up to n elements
// result stores up to min(n, m) elements
// O(n+m)
	​
// Why this approach is best:-

// Fastest solution
// Clean and readable
// Automatically handles duplicates
// Commonly expected in interviews and coding platforms
