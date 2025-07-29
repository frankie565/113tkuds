import java.util.*;

public class F08_ClimbStairsMemo {

    static int[] memo = new int[41];  

    public static int climb(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;

        if (memo[n] != -1) return memo[n];

        memo[n] = climb(n - 1) + climb(n - 2) + climb(n - 3);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Arrays.fill(memo, -1);
        int ways = climb(n);
        System.out.println("Ways: " + ways);

        // 複雜度 O(n)，每個 n 計算一次
    }
}
