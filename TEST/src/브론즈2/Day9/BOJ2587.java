package 브론즈2.Day9;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[5];
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
            sum += A[i];


        }
        System.out.println(sum / 5);
        Arrays.sort(A);
        System.out.println(A[2]);

    }
}
