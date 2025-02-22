package 브론즈3.Day1;

import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        char[] second = sc.next().toCharArray();
        int sum = 0;
        int su = 1;
        for (int i = 2; i >=0 ; i--) {
            int A = first * Integer.parseInt(String.valueOf(second[i])); //char값을 string으로
            System.out.println(A);
            sum += A * su;
            su *= 10;

        }

        System.out.println(sum);
    }
}
