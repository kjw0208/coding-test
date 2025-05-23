package 브론즈2.Day17;

import java.util.Scanner;

public class BOJ2902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] text = sc.nextLine().split("-");
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i].toCharArray()[0]);
        }
    }
}
