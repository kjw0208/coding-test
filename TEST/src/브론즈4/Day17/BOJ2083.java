package 브론즈4.Day17;

import java.util.Scanner;

public class BOJ2083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String name =sc.next();
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (name.equals("#") && A == 0 && B == 0) {
                break;
            } else if (A > 17 || B >= 80) {
                System.out.println(name+" Senior");
            }else {
                System.out.println(name+" Junior");

            }


        }
    }
}
