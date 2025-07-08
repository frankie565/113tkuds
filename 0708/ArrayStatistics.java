class ArrayStatistics {

    
    public static void main(String[] args) {
        int[] numbers = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;

        
        int max = numbers[0], min = numbers[0];
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }

       
        int aboveAvgCount = 0;
        for (int num : numbers) {
            if (num > average) {
                aboveAvgCount++;
            }
        }

        int evenCount = 0, oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

       
        System.out.println("==== 陣列統計分析 ====");
        System.out.printf("總和\t\t：%d\n", sum);
        System.out.printf("平均值\t\t：%.2f\n", average);
        System.out.printf("最大值\t\t：%d（索引 %d）\n", max, maxIndex);
        System.out.printf("最小值\t\t：%d（索引 %d）\n", min, minIndex);
        System.out.printf("大於平均值數量：%d\n", aboveAvgCount);
        System.out.printf("偶數數量\t：%d\n", evenCount);
        System.out.printf("奇數數量\t：%d\n", oddCount);
    }
}
