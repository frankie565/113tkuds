import java.util.Scanner;

public class Q8_MergeTHSRPriceTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String[] station = new String[n];
        int[][] price = new int[n][2]; // [i][0]=standard, [i][1]=business

        for (int i = 0; i < n; i++) {
            station[i] = sc.next();            // 站名
            price[i][0] = sc.nextInt();        // 標準票價
            price[i][1] = sc.nextInt();        // 商務票價
        }

        // 表頭
        System.out.println("Station|Standard|Business");

        // 每一行資料
        for (int i = 0; i < n; i++) {
            System.out.printf("%-7s|%-8d|%d\n", station[i], price[i][0], price[i][1]);
        }
    }
}
