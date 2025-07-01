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
/*這個程式對陣列中的每個元素進行一次加總操作，因此：

時間複雜度：O(n)，其中 n 是陣列的長度。

每一個元素都會被訪問一次並進行加法運算。

這是一種線性時間演算法，效率非常好，適合用於處理中大型資料陣列的總和計算。*/