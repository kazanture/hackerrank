package hackerrank.datastructures.linkedlists;

import java.util.Stack;

/**
 * Created by kazanture on 4/23/2017.
 * You’re given the pointer to the head node of a linked list. Change the next pointers of the nodes so that their order is reversed. The head pointer given may be null meaning that the initial list is empty.

 Input Format
 You have to complete the Node* Reverse(Node* head) method which takes one argument - the head of the linked list. You should NOT read any input from stdin/console.

 Output Format
 Change the next pointers of the nodes that their order is reversed and return the head of the reversed linked list. Do NOT print anything to stdout/console.

 Sample Input

 NULL
 2 --> 3 --> NULL

 Sample Output

 NULL
 3 --> 2 --> NULL
 Explanation
 1. Empty list remains empty
 2. List is reversed from 2,3 to 3,2
 */
public class ReverseALinkedList {
    class Node {
        int data;
        Node next;
    }
    Node Reverse(Node head) {
        Stack reversStack=new Stack();
        while(head!=null){
            reversStack.push(head.data);
            head=head.next;
        }
        Node newHead=null;
        Node previous=null;
        while(!reversStack.empty()){
            int data=(int)reversStack.pop();
            Node node=new Node();
            node.data=data;
            if(newHead==null){
                newHead=node;
                previous=newHead;
            }
            else {
                previous.next=node;
                previous=node;
            }
        }
        return newHead;

    }
}
