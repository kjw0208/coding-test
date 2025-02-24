package 브론즈3.Day4;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int num1 = Math.max(A, Math.max(B, C));
        int num2 = Math.min(A, Math.min(B, C));

        System.out.println(A+B+C-num1-num2);*/

        int[] A = new int[3];
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();
        A[2] = sc.nextInt();
        Arrays.sort(A);
        System.out.println(A[1]);
    }
}
