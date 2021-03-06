
/*
Reverse pairs of elements in a singly-linked list.

Examples

L = null, after reverse is null
L = 1 -> null, after reverse is 1 -> null
L = 1 -> 2 -> null, after reverse is 2 -> 1 -> null
L = 1 -> 2 -> 3 -> null, after reverse is 2 -> 1 -> 3 -> null
*/

/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */

public class Solution {
  public ListNode reverseInPairs(ListNode head) {
    // Write your solution here
    if(head == null || head.next == null) {
        return head;
    }
    ListNode nextNode = head.next;
    head.next = reverseInPairs(nextNode.next);
    nextNode.next = head;
    return nextNode;
  }
}


public Node reversePair(Node head) {
    // base case
    if(head == null || head.next == null) {
        return head;
    }
    Node newHead = reversePair(head.next.next);
    Node temp = head.next;
    head.next = newHead;
    temp.next = head;
    return temp;
}

