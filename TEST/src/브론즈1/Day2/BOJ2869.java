package 브론즈1.Day2;

import java.util.Scanner;

public class BOJ2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int C = A - B;
        int day = (V-B) / C;

        if ((V - B) % C != 0) {
            day++;
        }
        System.out.println(day);

/*        int sum = 0;
        while (true) {
            day++;
            sum += A;

            if (sum >= V) {
                break;
            } else {
                sum -= B;
            }
        }
        System.out.println(day);*/

    }
}
