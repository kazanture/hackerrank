package hackerrank.datastructures.trees;

/**
 * Created by kazanture on 4/23/2017.
 * <p>
 * Complete the postOrder function in your editor below, which has  parameter: a pointer to the root of a binary tree. It must print the values in the tree's postorder traversal as a single line of space-separated values.
 * <p>
 * Input Format
 * <p>
 * Our hidden tester code passes the root node of a binary tree to your postOrder function.
 * <p>
 * Output Format
 * <p>
 * Print the tree's postorder traversal as a single line of space-separated values.
 * <p>
 * Sample Input
 * <p>
 * BTinput.png
 * <p>
 * Sample Output
 * <p>
 * 1 4 5 6 2 3
 */
public class PostorderTraversal {

    class Node {
        int data;
        Node left;
        Node right;
    }


    void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }
}
