package leetcode.easy.linkedList;

import java.util.LinkedList;
import java.util.List;

public class RemoveNthFromEnd {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            head = head.next;
            return head;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        List<ListNode> list = new LinkedList<>();
        list.add(
                new ListNode(1,
                    new ListNode(2,
                            new ListNode(3,
                                    new ListNode(4,
                                            new ListNode(5,
                                                    new ListNode(6,
                                                            new ListNode(10))
                                            )
                                    )
                            )
                    )
                )
        );

        System.out.println(list);
        removeNthFromEnd(list.get(0), 3);
        System.out.println(list);
    }
}
