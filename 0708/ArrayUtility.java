
class ArrayUtility {

    
    static void printArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    
    static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    
    static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    
    static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("陣列長度需至少為 2");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        return secondMax;
    }

    
    public static void main(String[] args) {
        int[] data = {3, 7, 1, 9, 4, 6, 8, 2, 5};

        System.out.println("原始陣列：");
        printArray(data);

       
        int[] copied = copyArray(data);
        System.out.println("\n陣列副本：");
        printArray(copied);

        
        reverseArray(data);
        System.out.println("\n反轉後的原始陣列：");
        printArray(data);

        
        int secondLargest = findSecondLargest(copied);
        System.out.println("\n副本陣列的第二大數值：" + secondLargest);
    }
}
