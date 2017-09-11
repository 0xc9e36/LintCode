/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if(head == null || head.next == null ) return head;
        ListNode list = null;
        ListNode cur = head;
        while(head != null) {
            head = head.next;
            cur.next = list;
            list = cur;
            cur = head;
        }
        return list;
    }
}
