/**
 TC :: O(n) SC :: O(n)
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
        return null;
        HashMap<ListNode, Integer> map = new HashMap();

        ListNode temp = head;
        int i=0;
        while(temp != null)
        {
            if(map.containsKey(temp))
                return temp;

            map.put(temp, i);
            i++;
            temp = temp.next;
        }
        return null;
    }
}
