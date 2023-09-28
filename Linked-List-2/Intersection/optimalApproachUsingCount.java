// T::O(m+n) S::O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
       ListNode l1 = headA;
       ListNode l2 = headB;
       int count1=0, count2=0;
       
       while(l1 != null){
           count1++;
           l1 = l1.next;
       }
            
       
       while(l2 != null){
           count2++;
           l2 = l2.next;
       }
            l1 = headA;
            l2 = headB;
        if(count1>count2){
            int k = count1-count2;
            int i = 0;
            while(i<k){
                l1 = l1.next;
                i++;
            } 
        }
        else{
            int k = count2-count1;
            int i=0;
            while(i<k){
                l2 = l2.next;
                i++;
            }
            
        }
        while(l1 != null && l2 !=null){
            if(l1 == l2)
            return l1;
            l1 = l1.next;
            l2 = l2.next;
        }
       return null;
    }
}
