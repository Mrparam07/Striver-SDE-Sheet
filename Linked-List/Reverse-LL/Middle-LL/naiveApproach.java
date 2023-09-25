class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        temp = head;
        for(int i=0;i<count/2;i++){
            temp = temp.next;
        }
        // int half = count/2;
        // count = 0;
        // ListNode ans = null;
        // while(temp != null)
        // {
        //     count++;
        //     if(count > half){
        //         ans = temp;
        //         return ans;
        //     }
        //     temp = temp.next;
        // }
        return temp;
    }
}
