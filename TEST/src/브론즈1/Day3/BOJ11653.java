package 브론즈1.Day3;

import java.util.Scanner;

public class BOJ11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N > 1) {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                while (N % i == 0) {
                    System.out.println(i);
                    N = N / i;
                }
            }
        }
        if (N > 1) {
            System.out.println(N);
        }

    }
}
