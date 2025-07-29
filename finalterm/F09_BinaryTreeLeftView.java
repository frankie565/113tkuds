import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class F09_BinaryTreeLeftView {

   
    public static TreeNode buildTree(String[] values) {
        if (values.length == 0 || values[0].equals("-1")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;
        while (index < values.length) {
            TreeNode current = queue.poll();

       
            if (index < values.length && !values[index].equals("-1")) {
                current.left = new TreeNode(Integer.parseInt(values[index]));
                queue.offer(current.left);
            }
            index++;

           
            if (index < values.length && !values[index].equals("-1")) {
                current.right = new TreeNode(Integer.parseInt(values[index]));
                queue.offer(current.right);
            }
            index++;
        }

        return root;
    }

  
    public static void printLeftView(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        System.out.print("LeftView: ");
        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();

              
                if (i == 0) {
                    System.out.print(current.val + " ");
                }

                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        TreeNode root = buildTree(input);
        printLeftView(root);

        // 時間複雜度 O(n)，空間 O(n)
    }
}
