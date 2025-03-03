package 브론즈3.Day14;

import java.util.Scanner;

public class BOJ2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();


            if (A + B + C + D == 3) {
                System.out.println("A");
            } else if (A + B + C + D == 2) {
                System.out.println("B");
            } else if (A + B + C + D == 1) {
                System.out.println("C");
            } else if (A + B + C + D == 0) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }

        }
    }
}
