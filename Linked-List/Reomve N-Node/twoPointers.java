// T::O(n) S::O(1)
class Solution {
public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head == null) return head;

    ListNode temp = new ListNode();
    temp.next = head;
    ListNode fast = temp;
    ListNode slow = temp;
    for(int i=1;i<=n;++i)
        fast = fast.next;

    while(fast.next != null){
        fast = fast.next;
        slow = slow.next;
    }
    slow.next = slow.next.next;

    return temp.next;
    }
}
