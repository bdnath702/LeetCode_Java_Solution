/* 
LeetCode Problem: 234
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

Example 1:

Input: head = [1,2,2,1]
Output: true
Example 2:

Input: head = [1,2]
Output: false
-------------------------------------------------------------------------
*/
 

class Solution {
    public boolean isPalindrome(ListNode head) {
        //base case
        if (head==null || head.next==null) return true;
        //define slow & fast
        ListNode slow= head;
        ListNode fast = head;
        while (fast!= null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        //reverse the last half of the list
        ListNode left= head;
        ListNode right = reverse(slow);
        while(right!=null){
            if (left.val==right.val){
                left= left.next;
                right = right.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
    //helper: reverse linkedList
    private ListNode reverse(ListNode head){
        ListNode curr= head;
        ListNode prev= null;
        while (curr!= null){
            ListNode nextNode= curr.next;
            curr.next=prev;
            prev= curr;
            curr= nextNode;
        }
        return prev;
    }
}