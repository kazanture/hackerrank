package hackerrank.datastructures.linkedlists;

/**
 * Created by kazanture on 4/23/2017.
 * Given a reference to the head of a doubly-linked list and an integer, , create a new Node object having data value  and insert it into a sorted linked list.
 * <p>
 * Complete the Node* SortedInsert(Node* head, int data) method in the editor below. It has two parameters:
 * <p>
 * : A reference to the head of a doubly-linked list of Node objects.
 * : An integer denoting the value of the  field for the Node you must insert into the list.
 * The method must insert a new Node into the sorted (in ascending order) doubly-linked list whose data value is without breaking any of the list's double links or causing it to become unsorted.
 * <p>
 * Note: Recall that an empty list (i.e., where ) and a list with one element are sorted lists.
 * <p>
 * Input Format
 * <p>
 * Do not read any input from stdin. Hidden stub code reads in the following sequence of inputs and passes and  to the method:
 * <p>
 * The first line contains an integer, , denoting the number of lists that will be checked. The  subsequent lines describe the elements to insert into each list over two lines:
 * <p>
 * The first line contains an integer, , denoting the number of elements that will be inserted into the list.
 * The second line contains  space-separated integers describing the respective data values that your code must insert into the list during each call to the method.
 * Output Format
 * <p>
 * Do not print anything to stdout. Your method must return a reference to the  of the same list that was passed to it as a parameter. The custom checker for this challenge checks the list to ensure it hasn't been modified other than to properly insert the new Node in the correct location.
 * <p>
 * Sample Input
 * <p>
 * 1
 * 3
 * 2 5 4
 * Sample Output
 * <p>
 * 2 4 5
 * Explanation
 * <p>
 * We start out with an empty list. We insert a node with . The list becomes . We return .
 * The head of the previously modified list is passed to our method as an argument. We insert a node with . The list becomes . We return .
 * The head of the previously modified list is passed to our method as an argument. We insert a node with . The list becomes . We return .
 * Hidden stub code then prints the final list as a single line of space-separated integers.
 */
public class InsertingaNodeIntoaSortedDoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
    }

    Node SortedInsert(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            return newNode;
        }
        if (head.data > data) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
        Node headReserved = head;
        Node previous = head;
        while (head != null) {
            if (head.data > data)
                break;
            previous = head;
            head = head.next;
        }
        newNode.next = previous.next;
        newNode.prev = previous;
        previous.next = newNode;
        if (head != null) {
            head.prev = newNode;
        }

        return headReserved;


    }

}
