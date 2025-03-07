package 브론즈3.Day20;

import java.util.Scanner;

public class BOJ5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int price = sc.nextInt();
            sum += price;
        }
        System.out.println(A - sum);

    }
}
