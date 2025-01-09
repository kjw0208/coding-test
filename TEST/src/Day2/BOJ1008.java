package Day2;

import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        // float 소수점8자리 정도
        // double  15자리정도
        // 코테에서는 float보다는 double
        System.out.println(A/B);
    }
}
