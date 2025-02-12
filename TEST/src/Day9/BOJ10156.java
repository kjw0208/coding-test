package Day9;

import java.util.Scanner;

public class BOJ10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();

        int money = 0;
        money = K*N-M;
        if (money < 0) {
            money=0;
        }
        System.out.println(money);
    }
}
