package edu.northeastern.utkarsh;

//Time Complexity: O(n)
//Space Complexity: O(1)
public class Problem4 {
    public static void main(String args[]){

    }

    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode oddHead = head;
        ListNode evenStart = head.next;
        ListNode evenHead = head.next;

        while(evenHead != null){
            oddHead.next = evenHead.next;
            if(oddHead.next != null){
                oddHead = oddHead.next;
            }
            evenHead.next = oddHead.next;
            evenHead = evenHead.next;
        }
        oddHead.next = evenStart;
        return head;
    }
}
