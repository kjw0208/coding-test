package 브론즈3.Day4;

import java.util.Scanner;

public class BOJ10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();


            int A = (N % H) * 100;
            int B = (N - 1) / H + 1; // 9  7

            if (A == 0) {
                A = H*100;
            }


            System.out.println(A+B);
        }

    }
}
