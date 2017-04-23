package hackerrank.datastructures.linkedlists;

/**
 * Created by kazanture on 4/23/2017.
 */
public class PrinttheElementsofaLinkedList {
    class Node {
        int data;
        Node next;
    }
    void Print(Node head) {
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}
