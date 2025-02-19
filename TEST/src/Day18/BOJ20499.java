package Day18;

import java.util.Scanner;

public class BOJ20499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kda = sc.nextLine();
        String[] A = kda.split("/");

        int k = Integer.parseInt(A[0]);
        int d = Integer.parseInt(A[1]);
        int a = Integer.parseInt(A[2]);

        if (k + a < d || d == 0) {
            System.out.println("hasu");
        }else {
            System.out.println("gosu");
        }


    }
}
