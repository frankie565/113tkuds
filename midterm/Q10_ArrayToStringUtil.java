import java.util.Scanner;

public class Q10_ArrayToStringUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] arr = new int[n];
        if (n > 0) {
            String[] parts = sc.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
        }

        System.out.println(arrayToString(arr));
    }

    static String arrayToString(int[] A) {
        if (A == null) return "null";
        if (A.length == 0) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < A.length; i++) {
            sb.append(A[i]);
            if (i < A.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
