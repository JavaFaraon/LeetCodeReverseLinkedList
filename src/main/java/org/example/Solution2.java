package org.example;

public class Solution2 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode rest = reverseList(head.next);
        rest.printList();
        head.next.next = head;
        head.next = null;

        return rest;
    }
}
