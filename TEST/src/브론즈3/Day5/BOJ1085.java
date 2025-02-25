package 브론즈3.Day5;

import java.util.Scanner;

public class BOJ1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();


        int min1 = w - x;
        int min2 = h - y;
        System.out.println(Math.min(Math.min(min1, x),Math.min(min2,y)));



    }
}
