import java.util.Scanner;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();         // 場次
        int[] a = new int[n];         // 比賽結果
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();      // 輸入 0 或 1
        }

        int k = sc.nextInt();         // 查詢前 k 場勝場

        int[] ps = new int[n + 1];    // prefix sum 陣列 (ps[0] = 0)
        for (int i = 1; i <= n; i++) {
            ps[i] = ps[i - 1] + a[i - 1];
        }

        System.out.print("PrefixSum:");
        for (int i = 1; i <= k; i++) {
            System.out.print(" " + ps[i]);
        }
        System.out.println();
    }
}
/*
 * Time Complexity: O(n)
 * 說明：前綴陣列建表走訪一次，每次查詢只要 O(1)。
 */