package 브론즈5.Day11;

import java.util.Scanner;

public class BOJ27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long F =1;
        for (int i=1; i<=N; i++){
            F *=i;
        }
        System.out.println(F);
    }
}
