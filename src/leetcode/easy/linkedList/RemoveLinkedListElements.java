package leetcode.easy.linkedList;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode head =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(6,
                                        new ListNode(3,
                                                new ListNode(4,
                                                        new ListNode(5,
                                                                new ListNode(6, null)
                                                        )
                                                )
                                        )
                                )
                        )
                );

        System.out.println(new Solution().removeElements(head, 6));

    }

    static class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if (head == null) {
                return head;
            }

            ListNode curr = new ListNode(0, null);
            curr.next = head;

            ListNode result = curr;

            while (curr != null && curr.next != null) {
                if (curr.next.val == val) {
                    curr.next = curr.next.next;
                } else {
                    curr = curr.next;
                }
            }

            return result.next;
        }
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

}
