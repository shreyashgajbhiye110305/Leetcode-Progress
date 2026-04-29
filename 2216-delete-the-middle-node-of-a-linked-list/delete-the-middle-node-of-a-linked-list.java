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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)return null;
        ListNode current = head;
        int len = 0, index = 0;
        while(current != null){
            current = current.next;
            len++;
        }
        len = (len/2);
        current = head;
        while(index < len-1){
            current = current.next;
            index++;
        }
        current.next = current.next.next;
        return head;
    }
}