package addTwoNumbers;

/**
 * https://leetcode.com/problems/add-two-numbers/description/
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * Exception in thread "main" java.lang.NumberFormatException: For input string: "9999999991"
 * [9]  [1,9,9,9,9,9,9,9,9,9]
 * Integer max:  2,147,483,647
 *              9,999,999,991
 *
 * Input:[5] [5]
 * Output:[0,1]
 *
 * Input: [1] [9,9]
 * Output: [0,0,1]
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(9);
        head2.next = new ListNode(9);
        addTwoNumbers(head1, head2);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        int remainder = sum / 10;
        ListNode newHead = new ListNode(sum % 10);
        ListNode temp = newHead;
        String sumStr = "";
        while (l1.next != null || l2.next != null) {
            int val1 = l1.next == null ? 0 : l1.next.val;
            int val2 = l2.next == null ? 0 : l2.next.val;
            sum = val1 + val2 + remainder;
            remainder = sum / 10;
            if (l1.next != null) l1 = l1.next;
            if (l2.next != null) l2 = l2.next;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }

        if(remainder != 0) {
            temp.next = new ListNode(remainder);
        }
        return newHead;
    }
}

