import java.util.Scanner;
public class test2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line =scanner.nextLine().trim();
        scanner.close();
        String[]parts = line.split("\\+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int sum = a+b ;
        System.out.println(sum);
    }
}