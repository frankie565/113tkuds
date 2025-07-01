public class matrix_multiplication_trace {
    public static void main(String[] args) {

        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] c = new int[2][2]; 


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("計算位置 c[" + i + "][" + j + "]：");

                int sum = 0;
                StringBuilder process = new StringBuilder();

                for (int k = 0; k < 2; k++) {
                    int product = a[i][k] * b[k][j];
                    sum += product;
                    process.append(a[i][k]).append("*").append(b[k][j]);
                    if (k < 1) {
                        process.append(" + ");
                    }
                }

                System.out.println(process.toString() + " = " + sum);
                c[i][j] = sum;
            }
        }


        System.out.println("結果矩陣：");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
         * 演算法時間複雜度說明：
         * 對於兩個 n x n 的矩陣相乘，必須使用三層迴圈：
         * - 外層 i 走訪每列：n 次
         * - 中層 j 走訪每行：n 次
         * - 內層 k 逐項計算乘積並加總：n 次
         * 總計為 n * n * n = O(n³)
         */