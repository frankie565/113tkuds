import java.util.Scanner;
public class ds_03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入使用者姓名:");
        String name = scanner.nextLine();
        System.out.print("請輸入年齡:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("請輸入城市:");
        String city = scanner.nextLine(); 
        System.out.println("你的姓名是:"+name);
        System.out.println("你的年齡是:"+age);
        System.out.println("你的城市是:"+city);

      scanner.close();


    }
}