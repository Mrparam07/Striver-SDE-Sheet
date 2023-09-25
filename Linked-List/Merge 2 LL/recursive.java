//Two ways Comment also run but take more memory

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
