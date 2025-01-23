package Day17;

import java.util.Scanner;

public class BOj9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int i= 0; i<T; i++){
            String A = sc.nextLine();
            String text = A.substring(0,1)+A.substring(A.length()-1);
//            String text = String.valueOf(A.charAt(0))+A.charAt(A.length()-1);
            System.out.println(text);
        }


    }
}
