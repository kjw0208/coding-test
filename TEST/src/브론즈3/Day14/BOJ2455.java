package 브론즈3.Day14;

import java.util.Scanner;

public class BOJ2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int max = 0;
        for (int i = 0; i < 4; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            sum = (sum - A) + B;
            max = Math.max(max, sum);
        }

        System.out.println(max);

    }
}
