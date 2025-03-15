package 브론즈2.Day5;

import java.util.Scanner;

public class BOJ1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            boolean IsTrue = true;
            if (A == 1) {
                IsTrue = false;
            } else {
                for (int j = 2; j < A; j++) {
                    if (A % j == 0) {
                        IsTrue = false;
                        break;
                    }
                }
            }
            if (IsTrue) {
                count++;
            }
        }
        System.out.println(count);
    }
}
