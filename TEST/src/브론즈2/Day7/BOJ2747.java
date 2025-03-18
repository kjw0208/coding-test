package 브론즈2.Day7;

import java.util.Scanner;

public class BOJ2747 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] p = new int[46];
        p[0] = 0;
        p[1] = 1;
        for (int i = 2; i <= 45; i++) {   //피보나치 만들어 놓은것
            p[i] = p[i - 1] + p[i - 2];
        }

        System.out.println(p[N]);

    }
}
