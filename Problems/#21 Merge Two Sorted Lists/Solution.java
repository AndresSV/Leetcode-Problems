/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(in  t val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        else {
            ListNode head = new ListNode();
            ListNode currentNode = head;
            
            while( list1 != null && list2 != null) {
                if(list2.val <= list1.val) {
                    currentNode.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
                else {
                    currentNode.next = new ListNode(list1.val);
                    list1 = list1.next;
                }
                currentNode = currentNode.next;
            }
            currentNode.next = (list1!=null)?list1:list2;
            return head.next;
        }
    }
}