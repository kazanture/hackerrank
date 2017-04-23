package hackerrank.datastructures.linkedlists;

/**
 * Created by kazanture on 4/23/2017.
 */
public class DeleteaNode {
    class Node {
        int data;
        Node next;
    }
    Node Delete(Node head, int position) {
        Node tobedeleted=head;
        Node previous=null;
        for(int i=0;i<position;i++){
            previous=tobedeleted;
            tobedeleted=tobedeleted.next;
        }
        if(previous!=null){
            previous.next=tobedeleted.next;
            tobedeleted=null;
        }else{
            head=head.next;
        }
        return head;

        // Complete this method

    }
}
