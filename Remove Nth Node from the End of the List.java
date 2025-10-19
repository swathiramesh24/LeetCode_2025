/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
*/

//code
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int k=0,l=0;
        ListNode t = head;
        while(t!=null)
        {
            l++;
            t=t.next;
        }
        
        if(n==l)
        {
            return head.next;
        }
        
        t=head;

        for(int i=1;i<l-n;i++)
        {
            t=t.next;
        }
        
        if(t.next!=null)
        {
            t.next=t.next.next;
        }
        return head;
    }
}
