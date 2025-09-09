/* LeetCode Problem 206
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
------------------------------------------------------------------------------
*/

class Solution {
    public ListNode reverseList(ListNode head) {
       

        ListNode prev= null;
        ListNode crr= head;
        while (crr!=null){
            ListNode nextNode= crr.next;
            crr.next=prev;
            prev=crr;
            crr=nextNode;
           
        }
return prev;
    }
}