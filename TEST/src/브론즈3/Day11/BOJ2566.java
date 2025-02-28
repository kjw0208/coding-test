package 브론즈3.Day11;

import java.util.Scanner;

public class BOJ2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int max_row = 0;
        int max_col = 1;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int temp = sc.nextInt();
                if (temp > max) {
                    max = temp;
                    max_row = i;
                    max_col = j;
                }

            }
        }

        System.out.println(max);
        System.out.println(max_row+" "+max_col);
    }
}
