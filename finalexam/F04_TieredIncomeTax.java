import java.util.*;

public class F04_TieredIncomeTax {

    public static double tax(double income) {
        double tax = 0;
        double[] limits = {10000, 40000, 85000, 160000};
        double[] rates = {0.05, 0.12, 0.20, 0.30, 0.40};
        double[] prev = {0, 10000, 40000, 85000, 160000};

        for (int i = 0; i < rates.length; i++) {
            double upper = (i < limits.length) ? limits[i] : income;
            if (income > prev[i]) {
                double taxable = Math.min(income, upper) - prev[i];
                tax += taxable * rates[i];
            } else {
                break;
            }
        }
        return tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        sc.nextLine();         

        String[] parts = sc.nextLine().split(" ");  
        double totalTax = 0;

        for (int i = 0; i < n; i++) {
            double income = Double.parseDouble(parts[i]);
            double t = tax(income);
            totalTax += t;
            System.out.printf("Tax: $%.2f\n", t);
        }

        System.out.printf("Average: $%.2f\n", totalTax / n);

        /*
         * Time Complexity: O(n)
         * 說明：每筆收入走訪最多 5 個稅率區間計算稅額，總共處理 n 筆輸入，為線性時間。
         */
    }
}
