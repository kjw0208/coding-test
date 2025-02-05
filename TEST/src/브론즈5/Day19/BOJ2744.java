package 브론즈5.Day19;

import java.util.Scanner;

public class BOJ2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char tmp=0;
        String A="";

        for (int i=0; i<text.length(); i++){
            tmp = text.charAt(i);

            if (Character.isUpperCase(tmp)) {
                A += Character.toLowerCase(tmp);
            } else if (Character.isLowerCase(tmp)) {
                A += Character.toUpperCase(tmp);
            }
        }
        System.out.println(A);
    }
}
