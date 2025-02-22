package 브론즈3.Day2;

import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M - 45 < 0) {
            H--;
            M = (M + 60) - 45;
            if (H < 0) {
                H+=24;
            }
            System.out.println(H+" "+M);
        } else {
            M=M-45;
            System.out.println(H+" "+M);
        }
    }
}
