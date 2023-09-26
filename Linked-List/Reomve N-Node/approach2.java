// T::O(n)  S::O(1)

class Solution {
public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head == null) return head;
    int k = 0;
    ListNode curr = head;
    for(; curr != null; curr = curr.next) k++;
    k -= n; //to get position of given element from first node
    if(k == 0) return head.next;
    for(curr = head; k > 1; k--, curr = curr.next) ;
    curr.next = curr.next.next; // to remove that node
    return head;
    }
}
