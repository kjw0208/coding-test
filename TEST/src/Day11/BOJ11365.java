package Day11;

import java.util.Scanner;

public class BOJ11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String A = sc.nextLine();
            if (A.equals("END")) {
                break;
            }
            char[] textArr = A.toCharArray();
            for (int i = textArr.length-1; i >= 0; i--) {
                System.out.print(textArr[i]);

            }

            System.out.println();
        }
    }
}
