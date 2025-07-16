import java.util.Scanner;

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        String[] stations = new String[n];

        
        for (int i = 0; i < n; i++) {
            stations[i] = sc.next();
        }

        
        String start = sc.next();
        String end = sc.next();

        int startIdx = -1, endIdx = -1;
        for (int i = 0; i < n; i++) {
            if (stations[i].equals(start)) startIdx = i;
            if (stations[i].equals(end)) endIdx = i;
        }

        if (startIdx == -1 || endIdx == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(startIdx - endIdx) + 1);
        }
    }
}
/*
 * Time Complexity: O(n)
 * 說明：程式需遍歷一次站名陣列以找出起點與終點，花費線性時間。
 */

/**
 * 站名查找與區間計算
 * 時間複雜度：O(n)
 * 空間複雜度：O(n)
 * 說明：透過一次迴圈搜尋起點與終點索引，計算站數差
 */