package 브론즈5.Day5;

import java.util.Scanner;

public class BOJ8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =0;

        for (int i=1; i<=n; i++){
            num +=i;
        }

        System.out.println(num);
    }
}
