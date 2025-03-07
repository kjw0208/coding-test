package 브론즈3.Day19;

import java.util.Scanner;

public class BOJ10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String reverse = "";

        for (int i = text.length()-1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        if (text.equals(reverse)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
