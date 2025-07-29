class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class F10_BSTRangeSum {

    public static int rangeSum(TreeNode root, int L, int R) {
        if (root == null) return 0;

        if (root.val < L) {
          
            return rangeSum(root.right, L, R);
        } else if (root.val > R) {
          
            return rangeSum(root.left, L, R);
        } else {
            
            return root.val + rangeSum(root.left, L, R) + rangeSum(root.right, L, R);
        }
    }

    // 測試主程式可加 TreeBuilder 輸入
}
