package hackerrank.datastructures.trees;

/**
 * Created by kazanture on 4/23/2017.
 * Complete the preOrder function in your editor below, which has  parameter: a pointer to the root of a binary tree. It must print the values in the tree's preorder traversal as a single line of space-separated values.
 * <p>
 * Input Format
 * <p>
 * Our hidden tester code passes the root node of a binary tree to your preOrder function.
 * <p>
 * Output Format
 * <p>
 * Print the tree's preorder traversal as a single line of space-separated values.
 * <p>
 * Sample Input
 * <p>
 * BTinput.png
 * <p>
 * Sample Output
 * <p>
 * 3 5 1 4 2 6
 */
public class PreorderTraversal {


    class Node {
        int data;
        Node left;
        Node right;
    }


    void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);


    }

}
