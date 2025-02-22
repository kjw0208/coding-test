package 브론즈4.Day16;

import java.util.Scanner;

public class BOJ4470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); //nextInt이건 한줄밑으로안내려감
        for (int i = 1; i <= N; i++) {
            String text=sc.nextLine();
            System.out.println(i+". "+text);
        }

    }
}
