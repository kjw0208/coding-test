package 브론즈2.Day8;

import java.util.Scanner;

public class BOJ2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean fix = true;
        if (N == 1) {
            for (int i = 2; i < 9; i++) {
                int temp = sc.nextInt();
                if (temp != i) {
                    fix = false;
                    System.out.println("mixed");
                    break;
                }

            }
            if (fix) {
                System.out.println("ascending");
            }


        } else if (N == 8) {
            for (int i = 7; i > 0; i--) {

                int temp = sc.nextInt();
                if (temp != i) {
                    fix = false;
                    System.out.println("mixed");
                    break;
                }

            }
            if (fix) {
                System.out.println("descending");
            }


        } else {
            System.out.println("mixed");
        }

    }
}
