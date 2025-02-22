package 브론즈3.Day2;

import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = Integer.MIN_VALUE; //최소값을 넣어서 처음에 이거보다 큰것을찾는다 그다음부터는 반복문으로 비교해서 큰수찾음
        int min = Integer.MAX_VALUE; // 처음 최대값을 넣어서 이거보다 작은수 찾음

        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }

        System.out.println(min+ " "+max);

    }
}
