class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class F11_BSTClosestValue {
    public static int closestValue(TreeNode root, int T) {
        int closest = root.val;

        while (root != null) {
          
            if (Math.abs(root.val - T) < Math.abs(closest - T) ||
                (Math.abs(root.val - T) == Math.abs(closest - T) && root.val < closest)) {
                closest = root.val;
            }

           
            if (T < root.val) {
                root = root.left;
            } else if (T > root.val) {
                root = root.right;
            } else {
                break; 
            }
        }

        return closest;
    }
}
