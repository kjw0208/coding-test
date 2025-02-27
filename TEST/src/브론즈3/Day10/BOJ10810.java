package 브론즈3.Day10;

import java.util.Scanner;

public class BOJ10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[sc.nextInt()+1];
        int M = sc.nextInt();

        for (int a = 0; a < M; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int b = i; b <= j; b++) {
                N[b] = k;

            }

        }

        for (int i = 1; i < N.length; i++) {
            System.out.print(N[i]+" ");
        }
    }
}
