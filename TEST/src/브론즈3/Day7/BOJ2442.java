package 브론즈3.Day7;

import java.util.Scanner;

public class BOJ2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
