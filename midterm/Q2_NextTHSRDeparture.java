import java.util.Scanner;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        int n = sc.nextInt();
        sc.nextLine(); 

        int[] times = new int[n];

   
        for (int i = 0; i < n; i++) {
            String timeStr = sc.nextLine();
            times[i] = toMinutes(timeStr);
        }

        String queryStr = sc.nextLine();
        int query = toMinutes(queryStr);

   
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (times[i] >= query) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            System.out.println("No train");
        } else {
            System.out.println(toHHMM(times[idx]));
        }
    }


    static int toMinutes(String hhmm) {
        String[] parts = hhmm.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        return h * 60 + m;
    }

  
    static String toHHMM(int mins) {
        int h = mins / 60;
        int m = mins % 60;
        return String.format("%02d:%02d", h, m);
    }
}
/*
 * Time Complexity: O(n)
 * 說明：需走訪 n 筆班次，找出第一個不早於查詢時間的時刻。
 */

/**
 * 基本線性搜尋實作（找下一班高鐵）
 * 時間複雜度：O(n)
 * 空間複雜度：O(n)
 * 穩定性：不適用（非排序）
 */