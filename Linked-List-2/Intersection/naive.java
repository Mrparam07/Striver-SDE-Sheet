// TC::O(m*n)  SC::O(1)
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
       ListNode l2;
       while(l1 !=null){
           l2 = headB;
           while(l2 != null)
           {
               if(l1 == l2)
               return l1;

               l2 = l2.next;
           }
           l1 = l1.next;
       }
       return null;
    }
}
