import java.util.Scanner;

public class q5matrixmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];


        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();


        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                B[i][j] = sc.nextInt();

        int ops = 0;

        for (int i = 0; i < n; i++) {          
            for (int j = 0; j < n; j++) {      
                int sum = 0;
                for (int k = 0; k < n; k++) {  
                    sum += A[i][k] * B[k][j];
                    ops += 2; 
                }
                C[i][j] = sum;
            }
        }

     
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }

       
        System.out.println(ops);
    }
}