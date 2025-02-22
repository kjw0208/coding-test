package 브론즈4.Day13;

import java.util.Scanner;

public class BOJ10768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A < 2 || (A <= 2 && B < 18)) {
            System.out.println("Before");
        } else if (A > 2 || (A >= 2 && B > 18)) {
            System.out.println("After");
        } else if (A == 2 && B == 18) {
            System.out.println("Special");
        }

    }
}
