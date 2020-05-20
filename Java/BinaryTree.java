/* 
OBJECTIVE: Implement a sorted integer binary tree which takes an unsorted array as input.
*/

import java.util.ArrayList;
import java.util.Arrays; 

class Tree 
{
    
    static Node[] tree;
    public Node root;
    public Node z;
    public Node current;

    class Node 
    {
        public int val;
        public Node rightNode;
        public Node leftNode;

        public Node(int x)
        {
            this.val = x;
        }

    }

    public Tree(int[] data)
    {

        Arrays.sort(data);
        root = new Node(data[0]);

        for (int i = 0; i < data.length; i++)
        {

            z = new Node(data[i]);
            System.out.println(": " + z.val);
            current = root;
            while(current.leftNode != null)
            {
                current = current.leftNode;
            }
            current.leftNode = z;
        }

    }

    public void displayTree()
    {   
        current = root;
        while(current.leftNode != null)
        {
            System.out.println(current.val);
            current = current.leftNode;
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

