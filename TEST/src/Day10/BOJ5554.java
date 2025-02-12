package Day10;

import java.util.Scanner;

public class BOJ5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sum = a + b + c + d;
        int x = sum / 60;
        int y = sum % 60;

        System.out.println(x);
        System.out.println(y);
    }
}
