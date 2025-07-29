import java.util.*;

public class F07_AnagramPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toLowerCase();  

        int[] freq = new int[26];  

        for (char ch : line.toCharArray()) {
            if (Character.isLetter(ch)) {
                freq[ch - 'a']++;
            }
        }

        int oddCount = 0;
        for (int f : freq) {
            if (f % 2 != 0) oddCount++;
        }

        if (oddCount <= 1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }

        // 複雜度 O(Σ)，常數時間，Σ 為字母種類（最多 26）
    }
}
