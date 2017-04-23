package hackerrank.datastructures.trees;

import java.util.Stack;

/**
 * Created by kazanture on 4/23/2017.
 * You are given a pointer to the root of a binary tree. Print the top view of the binary tree.
 You only have to complete the function.
 For example :

 3
 /   \
 5     2
 / \   / \
 1   4 6   7
 \       /
 9     8
 Top View : 1 -> 5 -> 3 -> 2 -> 7
 Input Format

 You are given a function,

 void top_view(node * root)
 {

 }
 Output Format

 Print the values on a single line separated by space.

 Sample Input

 3
 /   \
 5     2
 / \   / \
 1   4 6   7
 \       /
 9     8
 Sample Output

 1 5 3 2 7
 Explanation

 3
 /   \
 5     2
 / \   / \
 1   4 6   7
 \       /
 9     8
 From the top only nodes 1,5,3,2 and 7 will be visible.
 */
public class TopView {

   class Node {
       int data;
       Node left;
       Node right;
   }
    void top_view(Node root)
    {
        Stack leftStack=new Stack();
        Node leftNode=root.left;
        Node rightNode=root.right;
        while(leftNode!=null){
            leftStack.push(leftNode);
            leftNode=leftNode.left;
        }


        while(!leftStack.empty()){
            Node node=(Node)leftStack.pop();
            System.out.print(node.data+" ");
        }
        System.out.print(root.data+" ");
        while(rightNode!=null){
            System.out.print(rightNode.data+" ");
            rightNode=rightNode.right;
        }
    }
}
