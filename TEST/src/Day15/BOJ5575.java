package Day15;

import java.util.Scanner;

public class BOJ5575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            int eh = sc.nextInt();
            int em = sc.nextInt();
            int es = sc.nextInt();

            if (s > es) {
                es+=60;
                em--;
            }
            es-=s;

            if (m > em) {
                em+=60;
                eh--;
            }
            em-=m;
            eh-=h;



            System.out.println(eh+" "+em+" "+es);
        }

    }
}
