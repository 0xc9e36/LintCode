/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


/**
 * 在链表前面添加一个辅助节点，方便处理。
 * 
 */
 
public class Solution {
    /*
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode list = first;
        while(first.next != null) {
            if(val == first.next.val) {
                first.next = first.next.next;
            } else {
                first = first.next;
            }
        }
        return list.next;
    }
}
