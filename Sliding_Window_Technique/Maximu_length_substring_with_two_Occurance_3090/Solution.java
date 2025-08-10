/*Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each character.
 

Example 1:

Input: s = "bcbbbcba"

Output: 4

Explanation:

The following substring has a length of 4 and contains at most two occurrences of each character: "bcbbbcba".
--------------------------------------------------------------------------------------------*/


class Solution {
    public static int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 
            if (!map.containsKey(c)) {
                map.put(c, i);
            } else {
                count++;
            }
        }
        return count;
    }

    
}
