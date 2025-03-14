package 브론즈2.Day3;

import java.util.Scanner;

public class BOJ2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = A * B * C;
        char[] ABC = Integer.toString(result).toCharArray();
        int[] arr = new int[10];
        for (int i = 0; i<ABC.length; i++) {
            int temp = Integer.parseInt(String.valueOf(ABC[i]));
            arr[temp]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
