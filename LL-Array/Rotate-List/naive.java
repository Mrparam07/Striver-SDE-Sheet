/**
 TC::O(n*k) SC::O(1)
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        for(int i=0;i<k;i++)
        {
            ListNode temp = head;
            while(temp.next.next != null) 
                temp = temp.next;

            ListNode end = temp.next;
            temp.next = null;
            end.next = head;
            head = end;
        }
        return head;
    }
}
