package 브론즈4.Day11;

import java.util.Scanner;

public class BOJ10987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int sum=0;
        char[] textArr = A.toCharArray();
        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i] == 'a' || textArr[i] == 'e' || textArr[i] == 'i' || textArr[i] == 'o' || textArr[i] == 'u') {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
