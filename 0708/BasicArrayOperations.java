class BasicArrayOperations {
    public static void main(String[] args) {
      
        int[] arr = {15, 28, 7, 42, 91, 33, 66, 58, 24, 81};


        int arrayLength = arr.length;
        System.out.println("陣列長度為：" + arrayLength);


        arr[2] = 99;


        arr[arr.length - 1] = 100;

  
        System.out.println("\n陣列內容如下：");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("索引 %d：%d\n", i, arr[i]);
        }
    }
}