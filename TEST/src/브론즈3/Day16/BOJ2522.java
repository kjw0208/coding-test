package 브론즈3.Day16;

import java.util.Scanner;

public class BOJ2522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N*2-1; i++) {
            for (int j = 0; j < N; j++) { //01
                if ((i < N && i + j >= N - 1) || (i >= N && i - j < N)) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
