package 브론즈2.Day16;

import java.util.Scanner;

public class BOJ1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] number = sc.next().toCharArray();
        for (int i = 0; i < number.length; i++) {
            if (i == 0) {
                if (number[i] == '0') System.out.print("0");
                else if (number[i] == '1') System.out.print("1");
                else if (number[i] == '2') System.out.print("10");
                else if (number[i] == '3') System.out.print("11");
            } else {
                if (number[i] == '0') System.out.println("000");
                else if (number[i] == '1') System.out.print("001");
                else if (number[i] == '2') System.out.print("010");
                else if (number[i] == '3') System.out.print("011");
            }
            if (number[i] == '4') System.out.print("100");
            else if (number[i] == '5') System.out.print("101");
            else if (number[i] == '6') System.out.print("110");
            else if (number[i] == '7') System.out.print("111");

        }
    }
}
