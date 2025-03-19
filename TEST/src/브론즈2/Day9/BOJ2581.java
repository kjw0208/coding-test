package 브론즈2.Day9;

import java.util.Scanner;

public class BOJ2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10001];


        for (int i = 2; i < 10001; i++) {
            A[i] = i;
        }

        // 10000 이하의 소수구하기
        // 소수면 그자리에 자기값을 그대로 가지고 있고
        // 아니면 0으로 변경하는 방식
        for (int i = 2; i < Math.sqrt(10001); i++) {
            if (A[i] == i) { //소수이면
                for (int j = i + i; j < 10001; j = j + i) {
                    A[j] = 0;
                }
            }
        }
        int M = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        int min = 0;
        for (int i = N; i >= M; i--) {
            sum += A[i];
            if (A[i] != 0) {
                min = A[i];
            }
        }
        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
