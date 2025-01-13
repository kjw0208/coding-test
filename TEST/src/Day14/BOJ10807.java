package Day14;

import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[201];
        int N = sc.nextInt();

        for (int i =0; i<N; i++ ){
            int index = sc.nextInt();
            A[index+100]++;   // 범위가-100~100이면 -가 들어오면 arrayindexoutofbounds이거떠서
        }

        int v = sc.nextInt();
        System.out.println(A[v+100]);

    }
}
