package hackerrank.datastructures.linkedlists;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kazanture on 4/23/2017.
 *
 * Given pointers to the head nodes of  linked lists that merge together at some point, find the Node where the two lists merge. It is guaranteed that the two head Nodes will be different, and neither will be NULL.

 In the diagram below, the two lists converge at Node x:

 [List #1] a--->b--->c
 \
 x--->y--->z--->NULL
 /
 [List #2] p--->q
 Complete the int FindMergeNode(Node* headA, Node* headB) method so that it finds and returns the data value of the Node where the two lists merge.

 Input Format

 The FindMergeNode(Node*,Node*) method has two parameters,  and , which are the non-null head Nodes of two separate linked lists that are guaranteed to converge.
 Do not read any input from stdin/console.

 Output Format

 Each Node has a data field containing an integer; return the integer data for the Node where the two lists converge.
 Do not write any output to stdout/console.

 Sample Input

 The diagrams below are graphical representations of the lists that input Nodes  and  are connected to. Recall that this is a method-only challenge; the method only has initial visibility to those  Nodes and must explore the rest of the Nodes using some algorithm of your own design.

 Test Case 0

 1
 \
 2--->3--->NULL
 /
 1
 Test Case 1

 1--->2
 \
 3--->Null
 /
 1
 Sample Output

 2
 3
 Explanation

 Test Case 0: As demonstrated in the diagram above, the merge Node's data field contains the integer 2 (so our method should return 2).
 Test Case 1: As demonstrated in the diagram above, the merge Node's data field contains the integer 3 (so our method should return 3).
 */
public class FindMergePointofTwoLists {


  class Node {
     int data;
     Node next;
  }

    int FindMergeNode(Node headA, Node headB) {
        Map<Node,Integer> amap=new HashMap<Node,Integer>();
        while(headA!=null){
            if(amap.get(headA)!=null){
                break;
            }
            amap.put(headA,headA.data);
            headA=headA.next;
        }
        while(headB!=null){
            if(amap.get(headB)!=null){
                return headB.data;
            }
            headB=headB.next;
        }
        return -1;
    }
}
