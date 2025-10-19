/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
Input: head = [1,1,2]
Output: [1,2]
*/

//code
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tr = head;
        while(tr!=null && tr.next!=null)
        {
            if(tr.val == tr.next.val)
            {
                tr.next=tr.next.next;
            }
            else
            {
                tr=tr.next;
            }
        }
        return head;
    }
}
