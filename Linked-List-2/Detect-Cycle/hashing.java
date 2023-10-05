public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        Set<ListNode> set = new HashSet<>();

        while(temp != null){
            if(set.contains(temp))
                return true;
                
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }
}
