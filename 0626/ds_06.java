import java.util.Random;

public class ds_06 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; 
        }

        System.out.println("陣列內容：");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("陣列中的最大值為：" + max);
    }
}
