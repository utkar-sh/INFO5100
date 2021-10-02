package edu.northeastern.utkarsh;

//Time Complexity: O(n)  //Loops only once
//Space Complexity: O(1) //No extra space used
public class Problem5 {
    public static void main(String args[]){
    }

    public ListNode middleNode(ListNode head) {
        if(head == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}
