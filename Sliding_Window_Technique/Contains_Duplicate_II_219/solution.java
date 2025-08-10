/*Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true*/

import java.util.HashMap;
class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                int pastIndex = map.get(nums[i]);
                if (Math.abs(pastIndex - i) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i); // update index
                }
            }
        }
        return false; // only return false after checking all elements
    }

}
