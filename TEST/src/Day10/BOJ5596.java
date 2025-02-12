package Day10;

import java.util.Scanner;

public class BOJ5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = 0;
        int T = 0;

        for (int i = 0; i < 4; i++) {
            int A = sc.nextInt();
            S += A;
        }
        for (int i = 0; i < 4; i++) {
            int B = sc.nextInt();
            T += B;
        }

        System.out.println(Math.max(S,T));


    }
}
