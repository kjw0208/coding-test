package 브론즈3.Day18;

import java.util.Scanner;

public class BOJ2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int max_num = 0;

        for (int i = 1; i <= 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                int N = sc.nextInt();
                sum += N;
            }
            if (max < sum) {
                max = sum;
                max_num = i;
            }
        }

        System.out.println(max_num+" "+max);
    }
}
