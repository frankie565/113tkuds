class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class F12_TreeDiameter {
    static int maxDiameter = 0;

    public static int height(TreeNode root) {
        if (root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

      
        maxDiameter = Math.max(maxDiameter, left + right);

        return Math.max(left, right) + 1; 
    }

    public static int diameterOfTree(TreeNode root) {
        maxDiameter = 0;
        height(root);
        return maxDiameter;
    }

    public static void main(String[] args) {
        

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int result = diameterOfTree(root);
        System.out.println("Diameter: " + result);

        // 複雜度 O(n)
    }
}
