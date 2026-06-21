import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        if (root == p || root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null)
            return root;
        return left != null ? left : right;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> children = new HashSet<>();

        for (int i = 0; i < n; i++) {

            int parent = sc.nextInt();
            int left = sc.nextInt();
            int right = sc.nextInt();

            map.putIfAbsent(parent, new TreeNode(parent));
            TreeNode parentNode = map.get(parent);
            if (left != -1) {
                map.putIfAbsent(left, new TreeNode(left));
                parentNode.left = map.get(left);
                children.add(left);
            }
            if (right != -1) {
                map.putIfAbsent(right, new TreeNode(right));
                parentNode.right = map.get(right);
                children.add(right);
            }
        }

        int pVal = sc.nextInt();
        int qVal = sc.nextInt();
        TreeNode root = null;
        for (int key : map.keySet()) {
            if (!children.contains(key)) {
                root = map.get(key);
                break;
            }
        }
        Solution sol = new Solution();
        TreeNode ans = sol.lowestCommonAncestor(root,map.get(pVal),map.get(qVal));

        System.out.println(ans.val);
    }
}