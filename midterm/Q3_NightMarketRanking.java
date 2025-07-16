import java.util.Scanner;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextDouble();
        }

  
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIdx]) {
                    maxIdx = j;
                }
            }
            // 交換
            double temp = scores[i];
            scores[i] = scores[maxIdx];
            scores[maxIdx] = temp;
        }

        int limit = Math.min(5, n);
        for (int i = 0; i < limit; i++) {
           System.out.printf("%.1f\n", scores[i]);
        }
    }
}
/*
 * Time Complexity: O(n^2)
 * 說明：使用選擇排序，每一輪掃描 n 次，總共約 n(n-1)/2 次比大小。
 */

 /**
 * 基本選擇排序實作
 * 時間複雜度：最佳 O(n²)，最壞 O(n²)，平均 O(n²)
 * 空間複雜度：O(1)
 * 穩定性：不穩定排序（因為會將非相鄰元素交換）
 */