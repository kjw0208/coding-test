package Day18;

import java.util.Scanner;

public class BOJ5524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String text = sc.nextLine();
            System.out.println(text.toLowerCase());
        }

    }
}
