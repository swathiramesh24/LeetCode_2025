/*
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
*/

//code
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        while(head!=null && head.val==val )
        {
            head =  head.next;
        }
        ListNode tr = head;
        while(tr!=null && tr.next!=null)
        {
            if(tr.next.val==val && tr.next!=null)
            {
                tr.next=tr.next.next;
            }
            else
            {
                tr= tr.next;
            }
        }
        return head;
    }
}
