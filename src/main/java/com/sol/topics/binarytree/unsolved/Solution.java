package com.sol.topics.binarytree.unsolved;

import com.sol.topics.binarytree.common.Treenode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//TOdo need to issue with the code, it is not returning the correct inorder traversal
class Solution {
    public static void main(String[] args) {
        // Example usage
        Treenode root = new Treenode(1);
        root.right = new Treenode(2);
        root.right.left = new Treenode(3);

        Solution solution = new Solution();
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println(result); // Output: [1, 3, 2]
    }
    public List<Integer> inorderTraversal(Treenode root) {
        Stack stackItm = new Stack<Treenode>();
        List<Integer> items = new ArrayList<Integer>();
        Treenode current = root;
        if (root == null)
            return items;
        else if (root != null && root.left == null && root.right == null) {
            items.add(root.val);
            return items;
        } else {

            while (current != null) {


                if (current.left != null) {
                    stackItm.push(current.left);
                    current = current.left;
                } else if (current.right != null) {
                    stackItm.push(current.right);
                    current = current.right;

                } else {
                    stackItm.push(current);
                    current = null;
                }

            }
            while (!stackItm.isEmpty()) {
                Treenode node = (Treenode) stackItm.pop();
                items.add(node.val);
            }


        }

        return items;
    }
}