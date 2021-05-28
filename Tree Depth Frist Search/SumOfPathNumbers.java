// Given a binary tree where each node can only have a digit (0-9) value, each root-to-leaf path will represent a number. Find the total sum of all the numbers represented by all paths.

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
};

class SumOfPathNumbers {
    public static int findSumOfPathNumbers(TreeNode root) {
        // TODO: Write your code here
        return -1;
    }

    public static int findRoottoLeadPathNumbers(TreeNode currentNode, int pathSum){
        if (currentNode == null) return 0;

        pathSum = pathSum * 10 + currentNode.val;

        if (currentNode.left == null && currentNode.right == null)
            return pathSum;

        return findSumOfPathNumbers(currentNode.left, pathSum) + findSumOfPathNumbers(currentNode.right, pathSum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);
        System.out.println("Total Sum of Path Numbers: " + SumOfPathNumbers.findSumOfPathNumbers(root));
    }
}
