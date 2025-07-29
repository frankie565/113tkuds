import java.util.*;

public class F03_ConvenienceHotItems {

 
    static class Item {
        String name;
        int qty;

        Item(String name, int qty) {
            this.name = name;
            this.qty = qty;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            String name = parts[0];
            int qty = Integer.parseInt(parts[1]);
            items[i] = new Item(name, qty);

       
            int j = i;
            while (j > 0 && items[j - 1].qty < items[j].qty) {
             
                Item tmp = items[j];
                items[j] = items[j - 1];
                items[j - 1] = tmp;
                j--;
            }
        }

        
        int outputCount = Math.min(10, n);
        for (int i = 0; i < outputCount; i++) {
            System.out.println(items[i].name + " " + items[i].qty);
        }

        /*
 * Time Complexity: O(n^2)
 * 說明：使用插入排序來排序前 n 筆商品，最壞情況下兩層迴圈，為平方時間。
 */

    }
}
