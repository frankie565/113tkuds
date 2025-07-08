
// 檔名：ArraySearcher.java
import java.util.Scanner;

class ArraySearcher {

    /**
     * 搜尋指定數值在陣列中的索引位置
     */
    static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 計算指定數值在陣列中出現的次數
     */
    static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int value : array) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }

    /**
     * 主程式：使用者輸入要搜尋的數字
     */
    public static void main(String[] args) {
        int[] data = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};

        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入要搜尋的數字：");
        int target = scanner.nextInt();

        int index = findElement(data, target);
        int count = countOccurrences(data, target);

        System.out.println("搜尋數字: " + target);
        if (index != -1) {
            System.out.println("找到，索引位置: " + index);
        } else {
            System.out.println("找不到該數字，回傳: -1");
        }
        System.out.println("出現次數: " + count);

        scanner.close();
    }
}
