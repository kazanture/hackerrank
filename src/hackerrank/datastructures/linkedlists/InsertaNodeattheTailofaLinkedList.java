package hackerrank.datastructures.linkedlists;

/**
 * Created by kazanture on 4/23/2017.
 */
public class InsertaNodeattheTailofaLinkedList {
    class Node {
        int data;
        Node next;
    }
    Node Insert(Node head,int data) {
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        Node node=new Node();
        node.next=null;
        node.data=data;
        current.next=node;
        return head;
// This is a "method-only" submission.
// You only need to complete this method.

    }
}
