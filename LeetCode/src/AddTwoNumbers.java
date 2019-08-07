/**
 * @Author: CX
 * @Date: 2019/8/4 下午 7:37
 * @Version 1.0
 * @Project: 两数相加 LeetCode.2
 */

public class AddTwoNumbers {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int dig = l1.val + l2.val + carry;
            int val = dig % 10;
            carry = dig / 10;
            ListNode newnode = new ListNode(val);
            current.next = newnode;
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int val = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;
            current.next = new ListNode(val);
            current = current.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int val = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            current.next = new ListNode(val);
            current = current.next;
            l2 = l2.next;
        }
        if (carry != 0)
            current.next = new ListNode(carry);
        return dummy.next;
    }
}
