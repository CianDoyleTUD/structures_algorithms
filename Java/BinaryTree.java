/* 
OBJECTIVE: Implement a sorted integer binary tree which takes an unsorted array as input.
*/

import java.util.ArrayList;
import java.util.Arrays; 

class Tree 
{
    
    static Node[] tree;
    public Node z;

    class Node 
    {
        public int val;
        public Node rightNode;
        public Node leftNode;
    }

    public Tree(int[] data)
    {

        z = new Node();

        Arrays.sort(data);

        tree = new Node[data.length]; // Populate tree with empty nodes
        
        for (int i = 0; i < data.length; i++)
        {
            z.val = data[i];
            tree[i] = z;
        }

    }

    public void displayTree()
    {
        for (int i = 0; i < tree.length; i++)
        {
            System.out.println(tree[i].val);
        }
    }

}
class BinaryTree 
{
    public static void main(String[] args)
    {
        int[] treeData = {3,2,8,32,7,1,8}; // Use some arbitrary data to populate tree
        Tree tree = new Tree(treeData); // Create tree object
        tree.displayTree();
    }

}

