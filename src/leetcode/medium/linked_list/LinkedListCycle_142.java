package leetcode.medium.linked_list;


import java.util.LinkedHashSet;

/**
 * @url: <a href="https://leetcode.com/problems/linked-list-cycle-ii/">link</a>
 */

public class LinkedListCycle_142 {
    public static void main(String[] args) {

        ListNode tail = new ListNode(5, null);
        ListNode node2 = new ListNode(4, tail);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node4);

        System.out.println(new Solution().detectCycle(head));
    }

    static class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head, fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) break;
            }

            if (fast == null || fast.next == null) {
                return null;
            }

            while (head != slow) {
                head = head.next;
                slow = slow.next;
            }

            return head;
        }
    }

    static class Solution2 {
        public ListNode detectCycle(ListNode head) {
            ListNode curr = null;
            ListNode next = head;

            LinkedHashSet<ListNode> set = new LinkedHashSet<>();
            set.add(curr);

            while (next != null) {
                curr = next;
                next = next.next;
                if (set.contains(next)) {
                    return next;
                }
                set.add(curr);
            }
            return null;
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
