/*
LeetCode Problem 83
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

Example 1:

Input: head = [1,1,2]
Output: [1,2]

--------------------------------------------------------------------------------------

*/ 
class Solution{
    publiic ListNode deleteDuplicates(ListNode head){
        if (head==null) return null;
        ListNode current= head;
        while(current.next!=null){
            if(current.val==current.next.val){
                //skip the duplicate node
                current.next- current.next.next;
            }else{
                current= current.next;// move to the next distinct element
            }
        }
        return head;
    }
}