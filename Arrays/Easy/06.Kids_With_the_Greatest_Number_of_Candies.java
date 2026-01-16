// 1431. Kids With the Greatest Number of Candies 
// There are n kids with candies. You are given an integer array candies, 
// where each candies[i] represents the number of candies the ith kid has, 
// and an integer extraCandies, denoting the number of extra candies that you have. 
// Return a boolean array result of length n, where result[i] is true if, 
// after giving the ith kid all the extraCandies, they will have the greatest number 
//of candies among all the kids, or false otherwise. 
// Note that multiple kids can have the greatest number of candies. 

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = candies[0];
        for(int i=0;i<n;i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = candies[i] + extraCandies;
            if(x >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}

// Explanation 
// First, we determine the maximum number of candies any kid currently has. 
// Then, for each kid, Add extraCandies to their current candies. 
// If this value is greater than or equal to the maximum, add true to the list. 
// Otherwise, add false. 
// Finally, return the list of boolean values. 

// ⏱️ Complexity Analysis:- 

// Time Complexity: O(n) 
// One pass to find the maximum and one pass to check each kid. 

// Space Complexity: O(n) 
// Used for storing the result list.
