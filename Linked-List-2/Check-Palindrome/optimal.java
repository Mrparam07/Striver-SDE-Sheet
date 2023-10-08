TC::O(n/2+n/2+n/2) SC::O(1)
class Solution {
    public ListNode reverseList(ListNode head)
    {
        ListNode current = head;
        ListNode prev = null;

        while(current != null)
        {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverseList(slow);

        while(secondHalf != null)
        {
            if(secondHalf.val != head.val)
                return false;
            
            secondHalf = secondHalf.next;
            head = head.next;
        }
        return true;
    }
}
