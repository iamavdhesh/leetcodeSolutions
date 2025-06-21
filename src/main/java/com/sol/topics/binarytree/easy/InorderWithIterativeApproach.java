package com.sol.topics.binarytree.easy;

import com.sol.topics.binarytree.common.Treenode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



class InorderWithIterativeApproach {
    public static void main(String[] args) {
        // Example usage
        Treenode root = new Treenode(1);
        root.left = new Treenode(4);
        root.right = new Treenode(2);
        root.right.left = new Treenode(3);
        root.right.right = new Treenode(5);

        InorderWithIterativeApproach solution = new InorderWithIterativeApproach();
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println(result); // Output: [1, 3, 2]
    }
    public List<Integer> inorderTraversal(Treenode root) {

        Stack stackItm = new Stack<Treenode>();
        List<Integer> items = new ArrayList<Integer>();
        Treenode tempNode = root;
        while (tempNode != null || !stackItm.isEmpty()) {
            // left tree reading
            while(tempNode!=null){
                stackItm.push(tempNode);
                tempNode = tempNode.left;
            }
            // root item reading
            Treenode node = (Treenode) stackItm.pop();
            items.add(node.val);
            // right tree read
            tempNode = tempNode.right;
        }

        return items;
    }
}