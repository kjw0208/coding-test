package 브론즈3.Day17;

import java.util.Scanner;

public class BOJ2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            int N = sc.nextInt();
            if (N % 2 == 1) {
                sum += N;
                if (min > N) {
                    min = N;
                }
            }
        }
        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
