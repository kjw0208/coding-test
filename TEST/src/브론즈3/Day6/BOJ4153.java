package 브론즈3.Day6;

import java.util.Scanner;

public class BOJ4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A == 0 && B == 0 && C == 0) {
                break;
            }

            if (C > A && C > B) {
                if ((A * A) + (B * B) == C * C ) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
            if (B > A && B > C) {

                if ((A * A) + (C * C) == B * B) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
            if (A > B && A > C) {

                if ((C * C) + (B * B) == A * A) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }

    }
}
