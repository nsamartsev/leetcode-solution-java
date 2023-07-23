package leetcode.medium.linked_list;


/**
 * @url <a href="https://leetcode.com/problems/linked-list-cycle">link</a>
 *
 */
public class LinkedListCycle_141 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        var node4 = new ListNode(4, null);
        var node3 = new ListNode(0, node4);
        var node2 = new ListNode(2, node3);
        var node1 = new ListNode(3, node2);
        node4.next = node2;

        assert solution.hasCycle(node1);
    }

    static class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head, fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) return true;
            }

            return false;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


