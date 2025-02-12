package Day9;

import java.util.Scanner;

public class BOJ2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int P = sc.nextInt();
        int result = L * P;
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            System.out.print(num-result+" ");
        }

    }
}
