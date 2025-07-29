import java.util.*;

public class F06_ArraySecondLargest {

   
    public static int[] findSecondMax(int[] arr, int l, int r) {
        if (r - l == 1) {
        
            return new int[]{arr[l], Integer.MIN_VALUE};
        }

        int mid = (l + r) / 2;
        int[] left = findSecondMax(arr, l, mid);
        int[] right = findSecondMax(arr, mid, r);

        int max, second;

        if (left[0] > right[0]) {
            max = left[0];
            second = Math.max(left[1], right[0]);
        } else {
            max = right[0];
            second = Math.max(right[1], left[0]);
        }

        return new int[]{max, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = findSecondMax(arr, 0, n);
        System.out.println("SecondMax: " + result[1]);

        /*
 * Time Complexity: O(n)
 * 說明：使用分治遞迴回傳最大與次大值，每層處理常數時間，共處理 n 個元素。
 */

    }
}
