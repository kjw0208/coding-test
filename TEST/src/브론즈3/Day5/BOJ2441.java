package 브론즈3.Day5;

import java.util.Scanner;

public class BOJ2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
