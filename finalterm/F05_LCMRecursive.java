import java.util.Scanner;

public class F05_LCMRecursive {

 
    public static int gcd(int a, int b) {
        if (a == b) return a;
        if (a > b) return gcd(a - b, b);
        return gcd(a, b - a);
    }

    // 利用 GCD 計算 LCM
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = lcm(a, b);
        System.out.println("LCM: " + result);
/*
 * Time Complexity: O(a + b)
 * 說明：使用輾轉相減法遞迴求 GCD，每次遞迴最少減一，最多 a + b 次呼叫。
 */

    }
}
