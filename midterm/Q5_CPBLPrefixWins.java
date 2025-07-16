import java.util.Scanner;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();         
        int[] a = new int[n];         
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();      
        }

        int k = sc.nextInt();         
        int[] ps = new int[n + 1];    
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

 /**
 * 前綴總和（Prefix Sum）實作
 * 時間複雜度：O(n)
 * 空間複雜度：O(n)
 * 穩定性：不適用（非排序演算法）
 */