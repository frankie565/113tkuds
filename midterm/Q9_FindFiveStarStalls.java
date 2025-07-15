import java.util.Scanner;

public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextDouble();
        }

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (scores[i] == 5.0) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }
}
