package hackerrank.datastructures.linkedlists;

/**
 * Created by kazanture on 4/23/2017.
 */
public class InsertaNodeataSpecificPositioninaLinkedList {
    class Node {
        int data;
        Node next;
    }

    Node InsertNth(Node head, int data, int position) {
        Node previous=null;
        Node correctNode=head;
        for(int i=0;i<position;i++){
            previous=correctNode;
            correctNode=correctNode.next;
        }
        Node node=new Node();
        node.data=data;
        node.next=correctNode;
        if(previous!=null){
            previous.next=node;
        }else{
            head=node;
        }

        return head;

        // This is a "method-only" submission.
        // You only need to complete this method.
    }
}
