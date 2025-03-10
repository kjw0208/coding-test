package 브론즈2.Day1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> myset = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int temp = sc.nextInt() % 42;
            myset.add(temp);

        }
        System.out.println(myset.size());
    }
}
