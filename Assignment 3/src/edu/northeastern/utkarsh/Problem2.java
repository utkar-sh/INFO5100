package edu.northeastern.utkarsh;

//Time Complexity : O(n)
//Space Complexity : O(1)
public class Problem2 {
    public static void main(String args[]){

    }

    public ListNode removeElements(ListNode head, int val) {

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode removal = temp;

        while(removal.next != null){
            if(removal.next.data == val){
                ListNode next = removal.next;
                removal.next = next.next;
            }else{
                removal = removal.next;
            }
        }
        return temp.next;
    }
}
