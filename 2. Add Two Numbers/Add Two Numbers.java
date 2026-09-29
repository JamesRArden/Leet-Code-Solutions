/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode tail = null;
        ListNode node = null;

        ListNode leftover = new ListNode(-1, null);

        int sum = 0;
        int num1 = 0;
        int num2 = 0;
        boolean remainder = false;

        sum = l1.val + l2.val;
        if (remainder == true) {
            sum++;
            remainder = false;
        }

        if (sum > 9) {
            remainder = true;
            sum = sum % 10;
        }

        head = new ListNode(sum, null);
        tail = head;

        while (l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;

            sum = l1.val + l2.val;
            if (remainder == true) {
                sum++;
                remainder = false;
            }

            if (sum > 9) {
                remainder = true;
                sum = sum % 10;
            }

            node = new ListNode(sum, null);
            tail.next = node;
            tail = node;

        }

        if(l1.next != null){
            leftover = l1;
        }
        else if(l2.next != null){
            leftover = l2;
        }

        while (leftover.next != null ) {
            leftover = leftover.next;
          
            sum = leftover.val;
            if (remainder == true) {
                sum++;
                remainder = false;
            }

            if (sum > 9) {
                remainder = true;
                sum = sum % 10;
            }

            node = new ListNode(sum, null);
            tail.next = node;
            tail = node;

        }

        if (remainder == true) {
            node = new ListNode(1, null);
            tail.next = node;
            tail = node;
        }

        return head;
    }
}