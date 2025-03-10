package 브론즈2.Day1;

import java.util.Scanner;

public class BOJ1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim();
        String[] A;
        if (text.isEmpty()) {
            System.out.println("0");
        } else {
            A = text.split(" ");
            System.out.println(A.length);
        }

    }
}
