package hackerrank.datastructures.trees;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/challenges/binary-search-tree-insertion
 */
public class BinarySearchTreeInsertion {

    class Node{
    int data;
    Node left;
    Node right;

    }

    Node Insert(Node root,int value)
    {
        if(root==null){
            Node node=new Node();
            node.data=value;
            return node;
        }
        if(value<root.data){
            if(root.left==null){
                Node node=new Node();
                node.data=value;
                root.left=node;
            }
            else{
                Insert(root.left,value);
            }
        }
        else{
            if(root.right==null){
                Node node=new Node();
                node.data=value;
                root.right=node;
            }
            else{
                Insert(root.right,value);
            }
        }
        return root;
    }
}
