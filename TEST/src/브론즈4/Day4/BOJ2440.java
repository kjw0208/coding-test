package 브론즈4.Day4;

import java.util.Scanner;

public class BOJ2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();

        for (int i = N; i>0; i--){ //01234
            for (int j =0; j<i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
