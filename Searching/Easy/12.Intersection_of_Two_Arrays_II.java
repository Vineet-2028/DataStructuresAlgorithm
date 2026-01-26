// 350. Intersection of Two Arrays II

// Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must appear as many times as it 
// shows in both arrays and you may return the result in any order.

// Solution In JAVA:-

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int n : nums2) {
            if (map.containsKey(n) && map.get(n) > 0) {
                result.add(n);
                map.put(n, map.get(n) - 1);
            }
        }
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}

// Approach (Using HashMap – Best):-

// Store frequency of elements from the smaller array in a HashMap
// Traverse the other array
// If element exists and count > 0 → add to result and decrement count

// Time Complexity (TC):-

// Building frequency map: O(n)
// Traversing second array: O(m)
// O(n+m)
	​
//  Space Complexity (SC):-

// HashMap stores up to min(n, m) elements
// Result list stores intersection elements
// O(min(n,m))
