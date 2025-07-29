package 브론즈1.Day3;

import java.util.Scanner;

public class BOJ2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (B > A) {
            int temp = A;
            A = B;
            B = temp;
        }
        int gcd = gcd(A, B);
        System.out.println(gcd);
        System.out.println(gcd * A / gcd * B / gcd);  //최소공배수= 최대공약수 * A/최대공약수 * B/최대공약수

    }

    private static int gcd(int a, int b) {  //최대공약수
        if (a % b != 0) {
            return gcd(b, a % b);
        }else {
            return b;
        }
    }
}
