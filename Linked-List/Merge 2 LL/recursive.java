//Two ways Comment also run but take more memory
/*Time Complexity: O(n)
Space Complexity: O(n)
The space complexity is determined by the maximum depth of the recursive call stack. In the worst case, when list1 and list2 are both non-empty and have similar lengths, the code will make recursive calls for each node until it reaches the end of one of the lists. This means the maximum recursion depth is proportional to the number of nodes in the longer of the two lists. Therefore, the space complexity is O(n), where n is the number of nodes in the longer list.
*/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
        return list2;
        if(list2 == null)
        return list1;

        //ListNode temp;
        if(list1.val <= list2.val){
            //temp = new ListNode(list1.val);
            //temp.next = mergeTwoLists(list1.next, list2);
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else{
            //temp = new ListNode(list2.val);
            //temp.next = mergeTwoLists(list1, list2.next);
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
        //return temp;
    }
}
