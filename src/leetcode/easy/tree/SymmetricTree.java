package leetcode.easy.tree;

import java.util.ArrayList;
import java.util.List;

public class SymmetricTree {
    public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
    public static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return Helper(root.left, root.right);
    }

    public static boolean Helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        }
        boolean cond1 = left.val == right.val;
        boolean cond2 = Helper(left.left, right.right);
        boolean cond3 = Helper(left.right, right.left);
        return cond1 && cond2 && cond3;
    }

    public static void main(String[] args) {
        List<TreeNode> simTrees = new ArrayList<>();
        List<TreeNode> nonSimTrees = new ArrayList<>();

        simTrees.add(new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)))
        );

        nonSimTrees.add(new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3)))
        );

        System.out.println(isSymmetric(simTrees.get(0)));
        System.out.println(isSymmetric(nonSimTrees.get(0)));
    }
}
