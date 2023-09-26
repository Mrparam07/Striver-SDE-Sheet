// T::O(n) S::O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        ListNode dummy = new ListNode();
        ListNode ans = dummy;
        for(int i=0;i<count-n;i++){
            ans.next = temp;
            temp = temp.next;
            ans = ans.next;
        }
        ans.next = temp.next;

        return dummy.next;
    }
}
