package com.sol.topics.binarytree.common;

// This class represents a binary tree node with an integer value and pointers to left and right children.
 public class Treenode {
    public int val;
    public Treenode left;
    public Treenode right;

    Treenode() {
    }

    public Treenode(int val) {
        this.val = val;
    }

    Treenode(int val, Treenode left, Treenode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
