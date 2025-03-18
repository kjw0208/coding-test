package 브론즈2.Day7;

import java.util.Scanner;

public class BOJ1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        if (B >= C) {
            System.out.println("-1");
        } else {

            long result = A  / (C - B)+1;


/*            int count = 1;   이것도가능
            while (true) {
                if (A + B * count < C * count) {
                    break;
                } else {
                    count++;
                }
            }
            System.out.println(count);*/
            System.out.println(result);

        }
    }
}
