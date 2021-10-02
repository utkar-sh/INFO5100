package edu.northeastern.utkarsh;

//Time Complexity : O(m) + O(n) = O(m+n)
//Space Complexity : O(1) //No extra space used
public class Problem3 {
    public static void main(String args[]){

    }

    private static ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode temp = null;

        int carry = 0;

        while (list1 != null || list2 != null) {

            int addition = carry;

            if (list1 != null) {
                addition += list1.data;
                list1 = list1.next;
            }
            if (list2 != null) {
                addition += list2.data;
                list2 = list2.next;
            }
            ListNode node = new ListNode(addition % 10);
            carry = addition / 10;
            if (temp == null) {
                temp = head = node;
            } else {
                temp.next = node;
                temp = temp.next;
            }
        }
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }
        return head;
    }
}
