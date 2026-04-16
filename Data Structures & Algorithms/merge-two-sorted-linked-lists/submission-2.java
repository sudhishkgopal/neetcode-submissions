/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode merge = temp;

        while(list1 != null && list2 != null){
            //get smaller node each time
            if(list1.val < list2.val) {
                merge.next = list1;
                list1 = list1.next;
            }
            else {
                merge.next = list2;
                list2 = list2.next;
            }

            merge = merge.next;

        }
        //add remaining nodes
        if(list1 != null) merge.next = list1;
        if(list2 != null) merge.next = list2;

        return temp.next;



    }
}