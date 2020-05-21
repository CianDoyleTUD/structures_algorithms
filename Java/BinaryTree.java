/* 
OBJECTIVE: Implement a sorted integer binary tree which takes an unsorted array as input.
*/

import java.util.ArrayList;
import java.util.Arrays; 

class Tree 
{
    
    static Node[] tree;
    private Node root;
    private ArrayList<Integer> visited = new ArrayList<Integer>();

    class Node 
    {
        public int val;
        public Node rightNode;
        public Node leftNode;

        public Node()
        {

        }

        public Node(int x)
        {
            this.val = x;
        }

    }

    public Tree(int[] data)
    {

        root = new Node(data[data.length / 2]); // Middle value is the root for a balanced sorted tree

        for (int i = 0; i < data.length; i++)
        {
           if (data[i] != root.val)
           {
                addNode(data[i]);

           }
        }
    }
 
    public Node addNodeRec(int value, Node curNode)
    {
        
        if (curNode == null) // BASE CASE: If we have reached the end of the tree
        { 
            System.out.println("Added node of value: " + value);
            return new Node(value);
        }

        if (value < curNode.val)
            curNode.leftNode = addNodeRec(value, curNode.leftNode);

        else if (value > curNode.val)
            curNode.rightNode = addNodeRec(value, curNode.rightNode);

        else 
            return curNode;

        return curNode;

    }

    public void addNode(int value)
    {
        root = addNodeRec(value, root);
    }

    public void displayNodes(Node curNode)
    {
        
        if(!visited.contains(curNode.val))
            System.out.println(curNode.val);
            visited.add(curNode.val); 
        
        if (curNode.rightNode != null)
        {
            displayNodes(curNode.rightNode);
        }   
        if (curNode.leftNode != null)
        {
            displayNodes(curNode.leftNode);
        }
    }

    public void displayTree()
    {   
        displayNodes(root);
    }

}
class BinaryTree 
{
    public static void main(String[] args)
    {
        int[] treeData = {1,2,3,4,5,6,7,8}; // Use some arbitrary data to populate tree
        Tree tree = new Tree(treeData); // Create tree object
        tree.displayTree();
    }

}

