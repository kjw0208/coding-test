package 브론즈3.Day3;

import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 1; i <= 9; i++) {
            int N = sc.nextInt();
            if (N > max) {
                max = N;
                count = i;
            }

        }


        System.out.println(max);
        System.out.println(count);

    }
}
