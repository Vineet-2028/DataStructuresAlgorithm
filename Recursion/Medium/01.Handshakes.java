// HandShakes

// We have N persons sitting on a round table. Any person can do a handshake with any other person.
//      1
// 2         3
//      4
// Handshake with 2-3 and 1-4 will cause cross.
// In how many ways these N people can make handshakes so that no two handshakes cross each other. N would be even.

// Solution In JAVA:-

class Solution {
    static int count(int N) {
        if(N%2!=0) return 0;
        if(N==0) return 1;
        int ans = 0;
        for(int i=2;i<=N;i+=2){
            int top = count(i-2);
            int bottom = count(N-i);
            ans += (top*bottom);
        }
        return ans;
    }
}

// Approach:- 

// We use recursion to count the number of valid ways.
// If N  is odd, pairing is not possible, so return 0.
// If N == 0, it means all elements are successfully paired, so return 1.
// For every possible pairing choice, we divide the remaining elements into:
// - left part
// - right part

// Then recursively calculate:
// top = count(i - 2)
// bottom = count(N - i)

// The total ways for that split are:
// top * bottom
// We sum all possible combinations to get the final answer.

// Time Complexity:-

// Exponential due to repeated recursive calls.
// O(2^N)

// Space Complexity:-
// Recursive stack depth:
// O(N)
