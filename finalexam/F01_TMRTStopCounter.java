import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] stops = new String[n];

        for (int i = 0; i < n; i++) {
            stops[i] = sc.next();
        }

        String start = sc.next();
        String end = sc.next();

        int indexStart = -1, indexEnd = -1;

        
        for (int i = 0; i < n; i++) {
            if (stops[i].equals(start)) indexStart = i;
            if (stops[i].equals(end)) indexEnd = i;
        }

        if (indexStart == -1 || indexEnd == -1) {
            System.out.println("Invalid");
        } else {
            int stopCount = Math.abs(indexStart - indexEnd) + 1;
            System.out.println(stopCount);
        }

       /*
 * Time Complexity: O(n)
 * 說明：最多需掃描兩次陣列找出起訖站點的索引，因此是線性時間。
 */

    }
}
