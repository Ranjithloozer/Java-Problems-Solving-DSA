class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode current = root;
        while (current != null) {
            if (p.val < current.val && q.val < current.val) {
                current = current.left;
            }
            else if (p.val > current.val && q.val > current.val) {
                current = current.right;
            }
            else {
                return current;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode p = root.left.right.left;   // Node 3
        TreeNode q = root.left.right.right;  // Node 5
        Solution sol = new Solution();
        TreeNode ans = sol.lowestCommonAncestor(root, p, q);

        System.out.println("Lowest Common Ancestor = " + ans.val);
    }
}