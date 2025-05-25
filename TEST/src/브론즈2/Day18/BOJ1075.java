package 브론즈2.Day18;

import java.util.Scanner;

public class BOJ1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F = sc.nextInt();

        N = N / 100;
        N = N * 100;
        while (true) {
            if (N % F == 0) {
                break;
            }
            N++;
        }
        char[] A = String.valueOf(N).toCharArray();
        System.out.print(A[A.length-2]);
        System.out.print(A[A.length-1]);

    }
}
