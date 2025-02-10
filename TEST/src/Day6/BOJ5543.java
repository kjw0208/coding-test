package Day6;

import java.util.Scanner;

public class BOJ5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mina = Math.min(a,Math.min(b,c));
        int d = sc.nextInt();
        int f = sc.nextInt();

        int minb = Math.min(d,f);

        System.out.println(mina+minb-50);
    }
}
