package hackerrank.datastructures.linkedlists;

/**
 * Created by kazanture on 4/23/2017.
 * <p>
 * You’re given the pointer to the head node of a doubly linked list. Reverse the order of the nodes in the list. The head node might be NULL to indicate that the list is empty.
 * <p>
 * Input Format
 * You have to complete the Node* Reverse(Node* head) method which takes one argument - the head of the doubly linked list. You should NOT read any input from stdin/console.
 * <p>
 * Output Format
 * Change the next and prev pointers of all the nodes so that the direction of the list is reversed. Then return the head node of the reversed list. Do NOT print anything to stdout/console.
 * <p>
 * Sample Input
 * <p>
 * NULL
 * NULL <-- 2 <--> 4 <--> 6 --> NULL
 * <p>
 * Sample Output
 * <p>
 * NULL
 * NULL <-- 6 <--> 4 <--> 2 --> NULL
 * Explanation
 * 1. Empty list, so nothing to do.
 * 2. 2,4,6 become 6,4,2 o reversing in the given doubly linked list.
 */
public class ReverseaDoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
    }

    Node Reverse(Node head) {
        Node previous = null;
        while (head != null) {
            Node temPrev = head.prev;
            head.prev = head.next;
            Node tempNext = head.next;
            previous = head;
            head.next = temPrev;
            head = tempNext;
        }
        return previous;
    }

}
