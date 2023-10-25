/**
                                                             TC:: O(n)+O(n-k)        SC::O(1)
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
        return head;
        int len = 1;
        ListNode temp = head;

        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        k = k%len;
        temp.next = head;

        ListNode tempHead = head;

        temp = tempHead;
        for(int i=1;i<len-k;i++)
        {
            temp = temp.next;
        }
        tempHead = temp.next;
        temp.next = null;
        return tempHead;
    }
}
