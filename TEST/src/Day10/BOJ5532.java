package Day10;

import java.util.Scanner;

public class BOJ5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int math = B / D;
        int kor = A / C;
        if (B % D!=0) {
            math++;
        }
        if (A % C != 0) {
            kor++;
        }
        int result = L - (Math.max(math,kor));
        System.out.println(result);
    }
}
