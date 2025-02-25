package 브론즈3.Day6;

import java.util.Scanner;

public class BOJ2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            for (int j = 1; j < N - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < N-1; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < N - i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j < N - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }



    }
}
