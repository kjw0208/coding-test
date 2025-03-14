package 브론즈2.Day4;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();

        }
/*        Arrays.sort(A);  이거사용해도가능

        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);

        }*/

        for (int i = 1; i < N; i++) { // 버블정렬
            for (int j = 0; j < N - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);

        }

    }
}
