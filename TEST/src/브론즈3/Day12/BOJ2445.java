package 브론즈3.Day12;

import java.util.Scanner;

public class BOJ2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N*2; j++) {
                if (i < j) { //08  17 26
                    if (j >= N * 2 - i-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();

        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N * 2; j++) {
                if (i + j>N-1) {
                    if (N+i-1<j) { //0 5+1-1
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                } else {
                    System.out.print("*");
                }

            }
            System.out.println();

        }
    }
}
