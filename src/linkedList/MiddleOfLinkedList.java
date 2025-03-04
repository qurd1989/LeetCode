package linkedList;

import java.util.List;

public class MiddleOfLinkedList {
    //  Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode middleNode2(ListNode head) {
        ListNode[] nodes = new ListNode[100];
        int length = 0;
        while (head != null) {
            nodes[length++] = head;
            head = head.next;
        }
        return nodes[length /2];
    }


}
