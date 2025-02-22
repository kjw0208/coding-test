package 브론즈4.Day14;

import java.util.Scanner;

public class BOJ11948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();
        int sum = A+B+C+D+E+F;

        int min_a = Math.min(A, Math.min(B, Math.min(C, D)));
        int min_b = Math.min(E, F);

        System.out.println(sum-min_a-min_b);



    }
}
