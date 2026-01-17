// 1832. Check if the Sentence Is Pangram

// A pangram is a sentence where every letter of the English alphabet appears at least once.
// Given a string sentence containing only lowercase English letters,
// return true if sentence is a pangram, or false otherwise.

// Solution In JAVA

class Solution {
    public boolean checkIfPangram(String sentence) {
        StringBuilder sb = new StringBuilder(sentence);
        boolean[] bool = new boolean[26];
        for(char ch : sb.toString().toCharArray()){
            bool[ch - 'a'] = true;
        }

        for(boolean b : bool){
            if(!b) return false;
        }

        return true;
    }
}

// Explanation:-

// The boolean array acts as a checklist for all lowercase letters.
// By mapping 'a' to index 0, 'b' to 1, … 'z' to 25, we can efficiently mark letters
// as we traverse the string. If any letter is missing after traversal, the sentence is not a pangram.

// Approach:-

// Use a boolean array of size 26 to track the presence of each lowercase English letter.
// Iterate over the sentence (converted from StringBuilder to String) and mark each letter as seen using bool[ch - 'a'] = true.
// After processing all characters, check if every letter in the alphabet has been seen.
// Return true if all letters are present, otherwise false.

// Time Complexity:-
// O(n) — single pass through the sentence of length n.

// Space Complexity:-
// O(1) — fixed size boolean array of 26 letters.
