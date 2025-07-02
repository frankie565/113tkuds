import java.util.Scanner;

public class q7permutation {
    static int ops = 0;  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        boolean[] used = new boolean[n];

        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        int[] result = new int[n];
        permute(nums, used, result, 0);

        System.out.println(ops);
    }

    public static void permute(int[] nums, boolean[] used, int[] result, int depth) {
        if (depth == nums.length) {
           
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i == result.length - 1 ? "\n" : " "));
            }
            ops++;
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                result[depth] = nums[i];
                permute(nums, used, result, depth + 1);
                used[i] = false; 
            }
        }
    }
}