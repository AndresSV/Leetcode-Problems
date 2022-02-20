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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode currentNode = head;

        while(l1 != null || l2 != null) {
            int overflow = 0;
            int sum = ((currentNode.next != null) ? currentNode.next.val : 0 ) 
                        + ((l1 != null) ? l1.val : 0) 
                        + ((l2 != null) ? l2.val : 0);
            
            overflow = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
            if (overflow > 0) {
                currentNode.next = new ListNode(overflow);               
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return head.next;
    }
}