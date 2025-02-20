package Day20;

import java.util.Scanner;

public class BOJ17362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 8 == 1) {
            System.out.println(1);
        } else if (a % 8 == 0 || a % 8 == 2) {
            System.out.println(2);
        } else if (a % 8 == 3 || a % 8 == 7) {
            System.out.println(3);
        } else if (a % 8 == 4 || a % 8 == 6) {
            System.out.println(4);
        } else {
            System.out.println(5);
        }
    }
}

