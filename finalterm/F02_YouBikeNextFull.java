import java.util.*;

public class F02_YouBikeNextFull {


    static int toMinutes(String time) {
        String[] parts = time.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        return h * 60 + m;
    }


    static String toHHMM(int totalMinutes) {
        int h = totalMinutes / 60;
        int m = totalMinutes % 60;
        return String.format("%02d:%02d", h, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            times[i] = toMinutes(sc.nextLine());
        }

        int queryTime = toMinutes(sc.nextLine());

        
        int left = 0, right = n - 1;
        int answerIndex = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] >= queryTime) {
                answerIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (answerIndex == -1) {
            System.out.println("No bike");
        } else {
            System.out.println(toHHMM(times[answerIndex]));
        }

        /*
 * Time Complexity: O(log n)
 * 說明：查詢時間已排序，使用二分搜尋找出第一個大於等於查詢時間的位置，為對數時間。
 */

    }
}
