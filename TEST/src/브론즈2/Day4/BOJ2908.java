package 브론즈2.Day4;

import java.util.Scanner;

public class BOJ2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] A = sc.next().toCharArray();
        char[] B = sc.next().toCharArray();

        StringBuilder RA = new StringBuilder();
        StringBuilder RB = new StringBuilder();

        for (int i = A.length-1; i >= 0; i--) {
            RA.append(A[i]);
        }
        for (int i = B.length-1; i >= 0; i--) {
            RB.append(B[i]);
        }

/*        char temp = A[0]; 이거사용해서해도가능
        A[0] = A[2];
        A[2] = temp;*/



        System.out.println(Math.max(Integer.parseInt(String.valueOf(RA)), Integer.parseInt(String.valueOf(RB))));


    }
}
