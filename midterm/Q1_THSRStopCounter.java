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
 * 說明：搜尋起點與終點在陣列中的索引，最多需要掃描 n 次（線性時間）。
 */
