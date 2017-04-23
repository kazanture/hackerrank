package hackerrank.datastructures.trees;

/**
 * Created by kazanture on 4/23/2017.
 * Complete the inOrder function in your editor below, which has  parameter: a pointer to the root of a binary tree. It must print the values in the tree's inorder traversal as a single line of space-separated values.
 * <p>
 * Input Format
 * <p>
 * Our hidden tester code passes the root node of a binary tree to your inOrder function.
 * <p>
 * Output Format
 * <p>
 * Print the tree's inorder traversal as a single line of space-separated values.
 * <p>
 * Sample Input
 * <p>
 * BTinput.png
 * <p>
 * Sample Output
 * <p>
 * 1 5 4 3 6 2
 */
public class InorderTraversal {
    class Node {
        int data;
        Node left;
        Node right;
    }


    void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }
}
