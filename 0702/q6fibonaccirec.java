import java.util.Scanner;

public class q6fibonaccirec {
    static int ops = 0;

    static int fib(int n) {
        ops++;
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();         
        int result = fib(n);          
        System.out.println(result);   
        System.out.println(ops);      
        sc.close();
    }
}