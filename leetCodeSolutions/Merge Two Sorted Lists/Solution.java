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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode steps = result;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                steps.next = list1;
                list1 = list1.next;
                steps = steps.next;
            } else {
                steps.next = list2;
                list2 = list2.next;
                steps = steps.next;
            }
        }

        while (list1 != null) {
            steps.next = list1;
            list1 = list1.next;
            steps = steps.next;
        }
        while (list2 != null) {
            steps.next = list2;
            list2 = list2.next;
            steps = steps.next;
        }

        return result.next;
    }
}