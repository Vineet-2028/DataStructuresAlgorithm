// 1773. 1773. Count Items Matching a Rule

// You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color,
// and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
// The ith item is said to match the rule if one of the following is true:
// ruleKey == "type" and ruleValue == typei.
// ruleKey == "color" and ruleValue == colori.
// ruleKey == "name" and ruleValue == namei.
// Return the number of items that match the given rule.

// Solution In JAVA


class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;
        if (ruleKey.equals("type")) index = 0;
        else if (ruleKey.equals("color")) index = 1;
        else if (ruleKey.equals("name")) index = 2;
        
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        
        return count;
    }
}

// Approach:-
// Determine the index corresponding to the ruleKey:

// ruleKey	index
//   type	0
//   color	1
//   name	2
// Iterate over each item in items.
// Compare item.get(index) with ruleValue using .equals().
// Increment a counter for each match.
// Return the counter.

// Complexity Analysis:-
// Time Complexity: O(n) → n = number of items, single pass.
// Space Complexity: O(1) → only a counter and an index variable used.
