package 브론즈4.Day19;

import java.util.Scanner;

public class BOJ16486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        double AB= d2*2*3.141592;  //원둘레 2파이r^2
        System.out.println(AB+d1+d1);

    }
}
