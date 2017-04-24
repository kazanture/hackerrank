package hackerrank.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/challenges/tree-level-order-traversal
 */
public class LevelOrderTraversal {


 class Node{
    int data;
    Node left;
    Node right;
 }
    void LevelOrder(Node root)
    {
        Queue queue=new LinkedList();
        queue.add(root);
        while(queue.peek()!=null){
            Node node=(Node)queue.poll();
            System.out.print(node.data+" ");
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }

        }

    }
}
