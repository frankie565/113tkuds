public class array_sum_trace {
    public static void main(String[] args) {
        // 固定陣列
        int[] arr = {1, 3, 5};

        int total = 0;

        // 加總過程並顯示
        for (int i = 0; i < arr.length; i++) {
            System.out.println("加總過程：total = " + total + " + " + arr[i] + " = " + (total + arr[i]));
            total += arr[i];
        }

        // 顯示總和
        System.out.println("總和為：" + total);
    }
}