class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;

        // count length
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // remove head
        if (n == count) {
            return head.next;
        }

        int index = count - n;
        ListNode temp2 = head;

        for (int i = 0; i < index - 1; i++) {
            temp2 = temp2.next;
        }

        temp2.next = temp2.next.next;

        return head;
    }
}