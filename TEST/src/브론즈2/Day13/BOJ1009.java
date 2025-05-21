package 브론즈2.Day13;

import java.util.Scanner;

public class BOJ1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a%10;
            for (int j = 0; j < b-1; j++) { // 처음 result에 한번 계산해서 여기서 b-1
                result = (result * a) % 10; // 나머지자리를 버리고 일의자리만 구하기

            }

            if (result == 0) {
                System.out.println(10);
            }else {
                System.out.println(result);
            }

        }
    }
}