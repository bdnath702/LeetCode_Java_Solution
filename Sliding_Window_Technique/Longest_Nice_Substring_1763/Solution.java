/* LeetCode 1763: Longest Nice substring 
A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.

Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.

 

Example 1:

Input: s = "YazaAay"
Output: "aAa"
Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
"aAa" is the longest nice substring.
------------------------------------------------------------------------------------- */
import java.util.HashSet;
import java.util.Set;

class Solution {
    public static String longestNiceSubstring(String s) {
        if (s.length() < 2) return ""; // Base case: cannot be nice if only 1 char

        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        // check each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(set.contains(Character.toLowerCase(c)) &&
                  set.contains(Character.toUpperCase(c)))) {
                
                // split into two substrings and recurse
                String left = longestNiceSubstring(s.substring(0, i));
                String right = longestNiceSubstring(s.substring(i + 1));

                // return whichever is longer
                return left.length() >= right.length() ? left : right;
            }
        }
        return s; // if all chars satisfy the nice condition
    }

}
